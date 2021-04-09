# Argon2 Playground

Uses Spring Security Crypto and BouncyCastle to do Argon2 password hashing on the JVM without the need for native
libraries.

Despite using Spring Security Crypto, the dependencies of this approach are lightweight (no dependency on Spring or
Spring Security):

```
de.mkammerer.argon2-playground:argon2-playground:jar:1.0-SNAPSHOT
+- org.springframework.security:spring-security-crypto:jar:5.4.5:compile
+- org.bouncycastle:bcprov-jdk15on:jar:1.68:runtime
+- ch.qos.logback:logback-classic:jar:1.2.3:runtime
|  +- ch.qos.logback:logback-core:jar:1.2.3:runtime
|  \- org.slf4j:slf4j-api:jar:1.7.25:runtime
\- org.slf4j:jcl-over-slf4j:jar:1.7.30:runtime
```

See the [main class](src/main/java/de/mkammerer/argon2playground/Main.java) for the password hashing code.

## License

[Unlicense](https://unlicense.org/)
