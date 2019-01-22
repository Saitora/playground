package com.example.patterns.factory_method.product_ex;

public class ConcreteCreatorB implements Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
