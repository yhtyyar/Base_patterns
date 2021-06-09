package com.java.base_patterns.behaviorals_patterns.observer;

public class TrackingApplication {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        warehouse.addGoods("Pepsi-cola");
        warehouse.addGoods("Lays");
        warehouse.addGoods("Cheetos");
        warehouse.addGoods("BonAqua");
        warehouse.addGoods("Sprite");

        Observer salesManager = new Manager("Maria");
        Observer purchasingManager = new Manager("Nikita");

        warehouse.addObserver(salesManager);
        warehouse.addObserver(purchasingManager);


        warehouse.addGoods("J7");
        warehouse.addGoods("Coca-cola");

        warehouse.removeGoods("Lays");

    }
}
