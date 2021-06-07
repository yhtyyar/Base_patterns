package com.java.base_patterns.structural_patterns.bridge.cargo;

import com.java.base_patterns.structural_patterns.bridge.transports.Transport;

public abstract class Logistic {

    protected Transport transport;

    protected Logistic(Transport transport) {
        this.transport = transport;
    }

    public abstract void transportLogistic();
}
