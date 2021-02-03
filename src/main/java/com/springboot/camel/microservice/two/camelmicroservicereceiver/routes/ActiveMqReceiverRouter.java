package com.springboot.camel.microservice.two.camelmicroservicereceiver.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        
        from("activemq:activemq-queue-one")
        .to("log:received-message-from-active-mq");

    }
    
}
