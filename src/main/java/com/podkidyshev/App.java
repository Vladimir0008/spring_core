package com.podkidyshev;

import com.podkidyshev.spring.CartConsoleController;
import com.podkidyshev.spring.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        CartConsoleController cartConsoleController =context.getBean(CartConsoleController.class);
        cartConsoleController.run();

    }
}
