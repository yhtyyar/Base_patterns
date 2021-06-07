package com.java.base_patterns.structural_patterns.bridge.cargo;

import com.java.base_patterns.structural_patterns.bridge.transports.Transport;

public class Food extends Logistic {

    public Food(Transport transport) {
        super(transport);
    }

    @Override
    public void transportLogistic() {
        System.out.println("The vehicle for food will be a ");
        transport.transportCargo();
    }
}
