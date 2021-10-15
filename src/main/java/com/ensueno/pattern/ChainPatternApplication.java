package com.ensueno.pattern;

import com.ensueno.pattern.config.ApplicationConfig;

import com.ensueno.pattern.protocol.SenderProcessor;
import com.ensueno.pattern.protocol.SenderProcessor2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;


@SpringBootApplication
public class ChainPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChainPatternApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("type", "A");

        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("type", "B");

        SenderProcessor senderProcessor = (SenderProcessor) context.getBean("senderProcessor");
        boolean b = senderProcessor.fieldProcessing(map);
        System.out.println(b);

        SenderProcessor2 senderProcessor2 = (SenderProcessor2) context.getBean("senderProcessor2");
        b = senderProcessor2.fieldProcessing(map2);
        System.out.println(b);

    }

}
