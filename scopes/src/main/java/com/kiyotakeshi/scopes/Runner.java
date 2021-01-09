package com.kiyotakeshi.scopes;

import com.kiyotakeshi.scopes.beans.Bean1;
import com.kiyotakeshi.scopes.beans.Bean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.registerShutdownHook();

        // Bean1 is Singleton bean(default settings)
        // so output the same bean three times
        System.out.println(context.getBean(Bean1.class));
        System.out.println(context.getBean(Bean1.class));
        System.out.println(context.getBean(Bean1.class));

        // Bean2 is Prototype bean
        // so output new instance each time bean is requested
        System.out.println(context.getBean(Bean2.class));
        System.out.println(context.getBean(Bean2.class));
        System.out.println(context.getBean(Bean2.class));
    }
}
