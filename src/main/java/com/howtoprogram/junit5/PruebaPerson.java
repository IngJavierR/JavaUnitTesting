package com.howtoprogram.junit5;

import com.howtoprogram.junit5.product.Person;

public class PruebaPerson implements IPredicate<Person> {
    @Override
    public boolean test(Person person) {
        if(person.getAge() == 25){
            return true;
        }
        return false;
    }
}
