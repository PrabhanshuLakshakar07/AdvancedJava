# 🚀 Advanced Java – Web Based Projects

Is repository me Advanced Java aur Spring ecosystem ke different topics par based mini-projects rakhe gaye hain — Hibernate se shuru karke Spring Boot, Spring MVC, Spring Data JPA aur Spring Rest Security tak. Har folder ek independent project hai jisme us specific topic ka hands-on implementation diya gaya hai.

## 📂 Project Structure

| Project Folder | Topic | Description |
|---|---|---|
| [`Hibernate_Project`](./Hibernate_Project) | Hibernate ORM | Hibernate framework ka use karke Java objects ko database tables ke saath map karna (ORM basics, Session Factory, HQL). |
| [`SpringProject`](./SpringProject) | Spring Boot | Spring Boot ke fundamentals — auto-configuration, dependency injection, aur basic Spring Boot application setup. |
| [`Spring_Mvc_Project`](./Spring_Mvc_Project) | Spring MVC | Logged-in user ki session ko `@SessionAttributes` annotation ke through manage karna, Spring MVC architecture ka practical implementation. |
| [`Spring_Rest_Data_Jpa_Project`](./Spring_Rest_Data_Jpa_Project) | Spring Data JPA | MySQL database ke saath CRUD operations (Create, Read, Update, Delete) Spring Data JPA repositories use karke. |
| [`Spring_Rest_Project`](./Spring_Rest_Project) | Spring REST + JPA | REST APIs banane ka complete flow, Spring Data JPA ke integration ke saath. |
| [`Spring_Rest_Security_Project`](./Spring_Rest_Security_Project) | Spring Security | REST APIs ko secure karna — authentication aur authorization implement karna Spring Security ke through. |
| [`Web_Project`](./Web_Project) | JSP | JSP (`getProperty`) ka use karke dynamic web pages banana, JavaBeans ke saath data binding. |

## 🛠️ Tech Stack

- **Language:** Java
- **Frameworks:** Spring Boot, Spring MVC, Spring Data JPA, Spring Security, Hibernate
- **Database:** MySQL
- **View Layer:** JSP
- **Build Tool:** Maven

## ▶️ How to Run Any Project

1. Repository clone karo:
   ```bash
   git clone https://github.com/PrabhanshuLakshakar07/<repo-name>.git
   ```
2. Jis project ko run karna hai uske folder me jao:
   ```bash
   cd <Project_Folder_Name>
   ```
3. `application.properties` ya `hibernate.cfg.xml` me apni MySQL database credentials update karo (jahan applicable ho).
4. Maven se build aur run karo:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## 📌 Purpose

This repository is created for personal learning and practice — understanding web-based concepts of Advanced Java by implementing them step-by-step. Each project covers a different topic so that the concepts remain clear and isolated.

## 🤝 Contributions

Yeh ek personal learning repository hai, lekin suggestions aur feedback ke liye issues/PRs open hain.

## 👤 Author

**Prabhanshu Lakshakar**
GitHub: [@PrabhanshuLakshakar07](https://github.com/PrabhanshuLakshakar07)

⭐ Agar yeh repository helpful lagi ho to star de dena!
