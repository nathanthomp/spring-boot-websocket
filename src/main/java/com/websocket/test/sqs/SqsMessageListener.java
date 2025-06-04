package com.websocket.test.sqs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;

@Component
public class SqsMessageListener {

    @Autowired
    private WebSocketHandler webSocketHandler;

    @SqsListener("your-queue-name")
    public void receiveMessage(String message) {
        System.out.println("Received message from SQS: " + message);
        // Process the message (e.g., push it to WebSocket)
        this.webSocketHandler.broadcast();
    }


}
