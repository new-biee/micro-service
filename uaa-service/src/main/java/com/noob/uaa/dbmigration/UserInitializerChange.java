package com.noob.uaa.dbmigration;
import com.noob.uaa.entity.Role;
import com.noob.uaa.entity.User;
import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ChangeUnit(id="user-initializer", order = "1", author = "admin")
public class UserInitializerChange {

    private final MongoTemplate mongoTemplate;

    public UserInitializerChange(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Execution
    public void changeSet() {
        List<Role> roles = new ArrayList<>();
        Role roleUser = new Role("ROLE_USER", Instant.now());
        Role roleAdmin = new Role("ROLE_ADMIN", Instant.now());
        roles.add(roleUser);
        roles.add(roleAdmin);
        mongoTemplate.insertAll(roles);

        User user = new User();
        user.setUsername("admin");
        user.setEmail("admin@gmail.com");
        user.setCreatedAt(Instant.now());
        user.setRoles(roles.stream().collect(Collectors.toSet()));
        user.setPassword("$2a$10$H9y5ljrP5sovdnrgyo4XCunGRe4ZKLY0wWTWQteu5RXn9fFgNoGLO");

        mongoTemplate.save(user);
    }

    @RollbackExecution
    public void rollback() {
        mongoTemplate.dropCollection("users");
        mongoTemplate.dropCollection("roles");
    }
}