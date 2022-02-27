package com.example.hostelprojecthelper.messaging.consumer;

import com.example.hostelprojecthelper.config.RabbitMQConfig;
import com.example.hostelprojecthelper.model.Customer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(Customer customer) {
        System.out.println("Customer message received & consumed from queue : " + customer);
    }
}
