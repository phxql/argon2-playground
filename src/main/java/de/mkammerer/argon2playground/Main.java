package de.mkammerer.argon2playground;

import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        int saltLength = 128 / 8;
        int hashLength = 256 / 8;
        int parallelism = 1;
        int memoryInKb = 10 * 1024;
        int iterations = 10;
        Argon2PasswordEncoder passwordEncoder = new Argon2PasswordEncoder(saltLength, hashLength, parallelism, memoryInKb, iterations);

        long start = System.nanoTime();
        String hashed = passwordEncoder.encode("foobar");
        long took = System.nanoTime() - start;

        System.out.println(hashed);
        System.out.println("Took " + Duration.ofNanos(took));

        start = System.nanoTime();
        boolean matches = passwordEncoder.matches("foobar", hashed);
        took = System.nanoTime() - start;
        System.out.println("Took " + Duration.ofNanos(took));

        if (matches) {
            System.out.println("Matches!");
        } else {
            System.out.println("Does NOT match!");
        }
    }
}