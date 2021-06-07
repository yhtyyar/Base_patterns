package com.java.base_patterns.structural_patterns.adapter;

public class AdapterForSender extends ChatMessage implements Chat {


    @Override
    public void send() {
        System.out.print("Anna: ");
        sendMessage();

        System.out.print("Anna's friend: ");
        receiveMessage();
    }

    @Override
    public void waitAnswer() {
        System.out.print("Anna's friend: ");
        readMessage();


        System.out.print("Anna: ");
        waitAnswerMessage();
    }

    @Override
    public void receive() {
        System.out.print("Anna's friend: ");
        sendMessage();

        System.out.print("Anna: ");
        receiveMessage();
    }

    @Override
    public void read() {
        System.out.print("Anna: ");
        readMessage();

        System.out.print("Anna's friend: ");
        waitAnswerMessage();
    }
}
