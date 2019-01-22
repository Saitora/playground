package com.example.patterns.factory_method.product_ex;

public class FactoryMethodExample {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreatorA();
        Product product = creator.factoryMethod();
        System.out.println(product);

        creator = new ConcreteCreatorB();
        product =  creator.factoryMethod();
        System.out.println(product);
    }

}
