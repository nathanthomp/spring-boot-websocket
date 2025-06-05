package com.springboot.websocket;

import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyWebSocketHandler extends TextWebSocketHandler {

    private CopyOnWriteArrayList<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("WebSocket Connection Established: " + session.getId());
        sessions.add(session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        System.out.println("Websocket Message Recieved: " + message.getPayload());
        this.broadcast(message);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("WebSocket Connection Closed: " + session.getId());
        sessions.remove(session);
    }

    public void broadcast(TextMessage message) throws Exception {
        for (WebSocketSession session : sessions) {

            try {
                session.sendMessage(message);
            } catch (Exception e) {
                System.out.println("Could not send message to " + session.getId());
            }

        }
    }

}
