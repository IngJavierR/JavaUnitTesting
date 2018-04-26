package com.howtoprogram.junit5;

import com.howtoprogram.junit5.product.Product;

public class PruebaProduct implements IPredicate<Product> {
    @Override
    public boolean test(Product product) {
        if(product.getId() == 1){
            return true;
        }
        return false;
    }
}
