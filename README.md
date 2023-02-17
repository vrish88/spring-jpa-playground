# Spring JPA Playground

This project provides some simple configuration so that you can focus on building a database through JPA.

Open up [`SpringJpaPlaygroundApplication.java`](src/main/java/com/example/demo/SpringJpaPlaygroundApplication.java) and write your "production code" in the ApplicationRunner bean.

```java
@Bean
ApplicationRunner playground(PostRepository postRepository) {
    return args -> {
        postRepository.save(new Post(1L));

        System.out.println(postRepository.findById(1L));
    };
}
```

## Configuration Explanation

```properties
spring.datasource.url=jdbc:h2:mem:mydb
```

This configures spring to use an in-memory database powered by H2 (as opposed to postgres). This way there are no
other dependencies needed locally. The database (data and schema) is destroyed whenever the application is shutdown.

---

```properties
spring.jpa.generate-ddl=true
```

This tells jpa to create the schema for the database creating tables and columns from the entities and their fields.

---

```properties
spring.jpa.hibernate.ddl-auto=create
```

This tells jpa to create the schema each time the application is started.