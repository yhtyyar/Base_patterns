package com.java.base_patterns.structural_patterns.adapter;

public class ChatRunner {
    public static void main(String[] args) {

        Chat sender = new AdapterForSender();

        sender.send();
        sender.waitAnswer();
        sender.receive();
        sender.read();




    }
}
