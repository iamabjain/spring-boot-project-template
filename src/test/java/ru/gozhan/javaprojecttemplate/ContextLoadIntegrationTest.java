package ru.gozhan.javaprojecttemplate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

class ContextLoadIntegrationTest extends AbstractIntegrationTest {

    @Test
    void contextLoads() {
        Assertions.assertNotNull(ApplicationContext.class);
    }

}
