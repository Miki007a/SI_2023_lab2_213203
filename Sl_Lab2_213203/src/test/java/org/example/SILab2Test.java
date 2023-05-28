package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private final SILab2 silab2=new SILab2();

    @Test
    void EveryBranch(){
        RuntimeException ex;
        ex= assertThrows(RuntimeException.class,()->silab2.function(null,null));
    assertTrue(ex.getMessage().contains("Mandatory information missing!"));//1

List<User> users=new ArrayList<>();
users.add(new User("Darko","pas","Darko@yahoo.com"));
users.add(new User("Marko","das","Marko@yahoo.com"));
assertFalse(silab2.function(new User("Darko", "das", "Darko@yahoo.com"), users));//2

assertFalse(silab2.function(new User("Darko", "filo>zofija", "Darko"), users));//3

assertFalse(silab2.function(new User("Darko", "filozofija", "Darko"), users));//4

assertFalse(silab2.function(new User("Darko", "filoz ofija", "Darko"), users));//5
    }
    @Test void MultipleConditions(){
        RuntimeException ex2;
        ex2= assertThrows(RuntimeException.class,()->silab2.function(null,null));
        assertTrue(ex2.getMessage().contains("Mandatory information missing!"));//1

        ex2= assertThrows(RuntimeException.class,()->silab2.function(new User(null,"pas",null),null));
        assertTrue(ex2.getMessage().contains("Mandatory information missing!"));//2

        ex2= assertThrows(RuntimeException.class,()->silab2.function(new User(null,null,"mail"),null));
        assertTrue(ex2.getMessage().contains("Mandatory information missing!"));//3

        assertDoesNotThrow(()->silab2.function(new User("username","password","email"),null));//4



    }


}