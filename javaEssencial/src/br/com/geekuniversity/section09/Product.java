package br.com.geekuniversity.section09;

/**
 * Class
 */

public class Product {
    String name;
    float price;
    float discount;

    void increase_price(float value) {
        this.price = this.price + value;
    }
}
