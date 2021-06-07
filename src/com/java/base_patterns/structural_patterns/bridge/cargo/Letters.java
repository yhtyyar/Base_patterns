package com.java.base_patterns.structural_patterns.bridge.cargo;

import com.java.base_patterns.structural_patterns.bridge.transports.Transport;

public class Letters extends Logistic {

    public Letters(Transport transport) {
        super(transport);
    }

    @Override
    public void transportLogistic() {
        System.out.println("The vehicle for letters will be a ");
        transport.transportCargo();
    }
}
