package com.healthi.family.service;


import com.healthi.family.model.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FamilyServiceTest {

    FamilyService familyService;
    Person person;


    @Test
    public void testGetDaughters(){
        List<Person> expecedActual = null;
        System.out.println("Testing get daughter");
        List<Person> daughterActual = familyService.getDaughters(person);
        
        assertEquals(expecedActual,daughterActual);
    }


    @Before
    public void init() {
        System.out.println("Instantiating service ");


       person = new Person("King Shan", "male",
                null, null, null, null);

       familyService = new FamilyService();
    }



}
