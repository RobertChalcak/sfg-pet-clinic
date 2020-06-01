package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}
