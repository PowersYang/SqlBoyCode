package com.sqlboy.factory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        String productType = "PJ";
        Product product = SimpleFactory.createProduct(productType);
        product.play();
        product.music();
    }
}

class SimpleFactory {
    public static Product createProduct(String productType) {
        Product product;

        if (productType.equals("TV")) {
            product = new Television();
        } else if (productType.equals("PJ")) {
            product = new Projector();
        } else {
            throw new IllegalArgumentException();
        }

        return product;
    }
}
