package com.java.base_patterns.behaviorals_patterns.iterator;

public class DisplayingListDrugs {
    public static void main(String[] args) {

        String [] drugListPainkillers = {"Paracetamol", "Ibuprofen", "Aspirin", "Panadol", "Pentalgin", "Nurofen"};
        String [] drugListVitamins = {"Vitamin C", "Thiamine", "Riboflavin", "Nicotic acid"};

        Drugs drugs1 = new Drugs("Painkillers", drugListPainkillers);

        Iterator iterator1 = drugs1.getIterator();

        System.out.println("Group: " + drugs1.getName());
        System.out.print("Drugs name: " );

        while (iterator1.hasNext()) {
            System.out.print(iterator1.next().toString() + " ");
        }

        System.out.println("\n=================================================\n");
        Drugs drugs2 = new Drugs("Vitamins", drugListVitamins);

        Iterator iterator2 = drugs2.getIterator();

        System.out.println("Group: " + drugs2.getName());
        System.out.print("Drugs name: " );

        while (iterator2.hasNext()) {
            System.out.print(iterator2.next().toString() + " ");
        }

    }
}
