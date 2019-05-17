package com.polytech.Polynet;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Main {
    public static void main(String[] args) {
        String hash = new BCryptPasswordEncoder().encode("mdp");
        System.out.println(hash);
    }
}
