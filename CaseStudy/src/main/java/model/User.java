package model;

import javax.management.relation.Role;

public class User {
    private int id;
    private String username;
    private String password;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private Role role;

    public User(String username, String password, Role role) {
    }

    public User(int id, String username, String password, String name, String phoneNumber, String email, String address, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.role = role;
    }

}
