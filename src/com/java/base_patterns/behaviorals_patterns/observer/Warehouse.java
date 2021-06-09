package com.java.base_patterns.behaviorals_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements Observed{

    List<String> goods = new ArrayList<>();

    List<Observer> managers = new ArrayList<>();

    public void addGoods(String good) {
        this.goods.add(good);
        notifyObservers();
    }

    public void removeGoods(String good) {
        this.goods.remove(good);
        notifyObservers();
    }


    @Override
    public void addObserver(Observer observer) {
        this.managers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.managers.add(observer);
    }

    @Override
    public void notifyObservers() {

        for (Observer observer : managers) {
            observer.handleEvent(this.goods);
        }
    }
}
