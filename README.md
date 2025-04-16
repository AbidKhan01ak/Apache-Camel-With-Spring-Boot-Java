## 📦 Project Dependencies Breakdown


---

### ✅ Spring Boot Starter Web
- **Group ID:** `org.springframework.boot`
- **Artifact ID:** `spring-boot-starter-web`
- **Version:** Managed by parent (`3.4.4`)
- **Purpose:** Provides core web functionalities and sets up a basic Spring Boot application. Used here mainly to initialize the application context and handle application lifecycle.

---

### ✅ Apache Camel Spring Boot Starter
- **Group ID:** `org.apache.camel.springboot`
- **Artifact ID:** `camel-spring-boot-starter`
- **Version:** `4.11.0`
- **Purpose:** Integrates Apache Camel into Spring Boot, allowing you to build routing and mediation rules with Camel in a Spring-friendly way.

---

### ✅ Jakarta JAXB API
- **Group ID:** `jakarta.xml.bind`
- **Artifact ID:** `jakarta.xml.bind-api`
- **Version:** `3.0.1`
- **Purpose:** Defines the JAXB API used for mapping XML to Java objects (unmarshalling). Required for processing XML files into Java classes.

---

### ✅ JAXB Runtime (GlassFish Implementation)
- **Group ID:** `org.glassfish.jaxb`
- **Artifact ID:** `jaxb-runtime`
- **Version:** `3.0.1`
- **Purpose:** Provides runtime implementations for JAXB API. Required to correctly unmarshal and marshal XML in modern Java versions (Java 9+ removed built-in JAXB).

---

### ✅ Apache Camel Core
- **Group ID:** `org.apache.camel`
- **Artifact ID:** `camel-core`
- **Version:** `4.11.0`
- **Purpose:** The core engine of Camel that provides routing, mediation, and transformation capabilities. This is the backbone of all Camel operations.

---

### ✅ Apache Camel File Component
- **Group ID:** `org.apache.camel`
- **Artifact ID:** `camel-file`
- **Version:** `4.11.0`
- **Purpose:** Allows file-based routing and processing. Used to pick up XML files from a specified `input` directory and write JSON to an `output` directory.

---

### ✅ Apache Camel JAXB Starter
- **Group ID:** `org.apache.camel.springboot`
- **Artifact ID:** `camel-jaxb-starter`
- **Version:** `4.11.0`
- **Purpose:** Enables JAXB-based unmarshalling (XML → Java). Works in conjunction with the JAXB API and model classes to handle XML conversion.

---

### ✅ Apache Camel Jackson
- **Group ID:** `org.apache.camel`
- **Artifact ID:** `camel-jackson`
- **Version:** `4.11.0`
- **Purpose:** Enables JSON marshalling and unmarshalling using Jackson. Used to convert Java objects into JSON strings.

---

## ⚙️ Build Configuration

### ✅ Spring Boot Maven Plugin
- **Group ID:** `org.springframework.boot`
- **Artifact ID:** `spring-boot-maven-plugin`
- **Purpose:** Used to build and run the Spring Boot application with a simple `mvn spring-boot:run` command.

---

### ✅ Resources Configuration
```xml
<resource>
  <directory>src/main/java</directory>
  <includes>
    <include>**/*.properties</include>
    <include>**/jaxb.index</include>
  </includes>
</resource>

```
**Purpose:** Explicitly includes the `jaxb.index` file as a resource so that JAXB can find the classes to bind during unmarshalling.
