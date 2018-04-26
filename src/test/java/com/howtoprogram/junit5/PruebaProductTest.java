package com.howtoprogram.junit5;

import com.howtoprogram.junit5.product.Person;
import com.howtoprogram.junit5.product.Product;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PruebaProductTest {

    @Test
    @DisplayName("Test if true product")
    void pruebaTestGenerics(){
        IPredicate<Product> iPredicate = new PruebaProduct();
        boolean result = iPredicate.test(new Product(1,"",0.0));

        Assert.assertTrue(result);
    }

    @Test
    @DisplayName("Test if true person")
    void pruebaTestGenericsPerson(){
        IPredicate<Person> iPredicate = new PruebaPerson();
        boolean result = iPredicate.test(new Person(1,"",25));

        Assert.assertTrue(result);
    }
}
