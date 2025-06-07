package com.springboot.websocket;

import io.awspring.cloud.sqs.annotation.SqsListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySqsMessageListener {

    @Autowired
    private MyWebSocketHandler myWebSocketHandler;

    @SqsListener("test-queue")
    public void receiveMessage(String message) {
        System.out.println("Received SQS message: " + message);
        this.myWebSocketHandler.broadcast(message);
    }

}
