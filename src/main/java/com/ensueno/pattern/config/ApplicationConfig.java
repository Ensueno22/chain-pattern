package com.ensueno.pattern.config;

import com.ensueno.pattern.protocol.Sender;
import com.ensueno.pattern.protocol.Sender2;
import com.ensueno.pattern.protocol.SenderProcessor;
import com.ensueno.pattern.protocol.SenderProcessor2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfig {

    @Bean(initMethod = "init")
    public SenderProcessor senderProcessor(){
        return new SenderProcessor();
    }

    @Bean(initMethod = "init")
    public SenderProcessor2 senderProcessor2(){
        return new SenderProcessor2();
    }

    @Bean
    @Scope("prototype")
    public Sender sender(){
        return new Sender();
    }

    @Bean
    @Scope("prototype")
    public Sender2 sender2(){
        return new Sender2();
    }

}
