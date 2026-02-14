# Auth Security Core

Libreria core per autenticazione e sicurezza con JWT.

## 📦 Pubblicazione su GitHub Packages

Questo progetto pubblica automaticamente su GitHub Packages tramite GitHub Actions.

### Come funziona

Ogni push sul branch `main` o `master` triggera automaticamente:
1. Build del progetto con Maven
2. Pubblicazione del package su GitHub Packages

### Utilizzare questo package in altri progetti

Aggiungi nel tuo `pom.xml`:

```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/TUO_USERNAME/auth-security-core</url>
    </repository>
</repositories>

<dependency>
    <groupId>it.auth.security</groupId>
    <artifactId>auth-security-core</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

E nel tuo `~/.m2/settings.xml`:

```xml
<servers>
    <server>
        <id>github</id>
        <username>TUO_USERNAME</username>
        <password>TUO_GITHUB_TOKEN</password>
    </server>
</servers>
```

## 🚀 Build locale

```bash
mvn clean package
```

## 📝 Tecnologie

- Java 21
- Spring Boot 4.0.2
- Spring Security
- JWT (JSON Web Tokens)
- JPA/Hibernate
- MySQL
- Lombok
- MapStruct

