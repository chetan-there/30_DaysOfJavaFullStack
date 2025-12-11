package com.ct.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserApp {

    // ✅ User Model
    static class User {
        private int id;
        private String name;
        private String role;
        private boolean active;

        public User(int id, String name, String role, boolean active) {
            this.id = id;
            this.name = name;
            this.role = role;
            this.active = active;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public String getRole() { return role; }
        public boolean isActive() { return active; }

        @Override
        public String toString() {
            return "User{id=" + id + ", name='" + name + "', role='" + role + "', active=" + active + "}";
        }
    }

    //  Service Layer (Real-world Optional usage)
    static class UserService {

        private List<User> users = new ArrayList<>();

        public UserService() {
            users.add(new User(1, "Chetan", "ADMIN", true));
            users.add(new User(2, "Rohit", "USER", false));
            users.add(new User(3, "Amit", "MANAGER", true));
        }

        //  Find user by ID (Optional used in real projects)
        public Optional<User> findUserById(int id) {
            return users.stream()
                    .filter(u -> u.getId() == id)
                    .findFirst();
        }

        //  Find only active user
        public Optional<User> findActiveUser(int id) {
            return findUserById(id)
                    .filter(User::isActive);
        }

        //  Find user by role
        public Optional<User> findUserByRole(String role) {
            return users.stream()
                    .filter(u -> u.getRole().equalsIgnoreCase(role))
                    .findFirst();
        }

        public List<User> getAllUsers() {
            return users;
        }
    }

    //  Main Method
    public static void main(String[] args) {

        UserService service = new UserService();

        //  1. Find user by ID
        Optional<User> user1 = service.findUserById(1);
        user1.ifPresent(u -> System.out.println("Found: " + u));

        //  2. Try to find non-existing user
        Optional<User> user99 = service.findUserById(99);
        System.out.println("User 99: " + user99.orElse(null));

        //  3. Find active user
        Optional<User> activeUser = service.findActiveUser(2);
        System.out.println("Active User 2: " + activeUser.orElse(null));

        //  4. Find user by role
        Optional<User> manager = service.findUserByRole("MANAGER");
        manager.ifPresent(u -> System.out.println("Manager: " + u));

        //  5. Throw custom exception if not found
        User admin = service.findUserById(1)
                .orElseThrow(() -> new RuntimeException("Admin not found"));
        System.out.println("Admin: " + admin);
    }
}