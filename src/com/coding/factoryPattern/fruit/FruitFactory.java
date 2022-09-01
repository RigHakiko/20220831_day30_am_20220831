package com.coding.factoryPattern.fruit;

public class FruitFactory {
    public Fruit createFruit(String message) {
        Fruit fruit = null;
        try {
            Class c = Class.forName(message);
            fruit = (Fruit) c.newInstance();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        return fruit;
    }
}
