package com.java.base_patterns.behaviorals_patterns.iterator;

public class Drugs implements List{

    private String name;
    private String [] drugList;

    public Drugs(String name, String[] drugList) {
        this.name = name;
        this.drugList = drugList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDrugList() {
        return drugList;
    }

    public void setDrugList(String[] drugList) {
        this.drugList = drugList;
    }

    @Override
    public Iterator getIterator() {
        return new DrugListIterator();
    }

    private class DrugListIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < drugList.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            return drugList[index++];
        }
    }

}
