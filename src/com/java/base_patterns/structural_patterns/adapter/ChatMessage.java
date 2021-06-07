package com.java.base_patterns.structural_patterns.adapter;

public class ChatMessage {

    public void sendMessage() {
        System.out.println("Sending message\n");
    }

    public void waitAnswerMessage() {
        System.out.println("Waiting for an answer\n");
    }

    public void receiveMessage() {
        System.out.println("Receiving a message\n");
    }

    public void readMessage() {
        System.out.println("Reading message\n");
    }
}
