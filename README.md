# Argon2 Playground

Uses Spring Security Crypto and BouncyCastle to do Argon2 hashing on the JVM without the need for native libraries.

Despite using Spring Security Crypto, the dependencies of this approach are lightweight:

```
de.mkammerer.argon2-playground:argon2-playground:jar:1.0-SNAPSHOT
+- org.springframework.security:spring-security-crypto:jar:5.4.5:compile
+- commons-logging:commons-logging:jar:1.2:runtime
\- org.bouncycastle:bcprov-jdk15on:jar:1.68:runtime
```

## License

[Unlicense](https://unlicense.org/)
