package com.java.base_patterns.structural_patterns.bridge;

import com.java.base_patterns.structural_patterns.bridge.cargo.*;
import com.java.base_patterns.structural_patterns.bridge.transports.CargoAirplane;
import com.java.base_patterns.structural_patterns.bridge.transports.Tanker;
import com.java.base_patterns.structural_patterns.bridge.transports.Train;
import com.java.base_patterns.structural_patterns.bridge.transports.Truck;

public class CreateTransportLogistics {
    public static void main(String[] args) {

        Logistic[] logistics = {
                new Appliances(new Tanker()),
                new Food(new Truck()),
                new Letters(new CargoAirplane()),
                new MedicalEquipment(new Train())
        };

        for (Logistic logistic : logistics) {
            logistic.transportLogistic();
        }
    }
}
