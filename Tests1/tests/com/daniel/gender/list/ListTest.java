package com.daniel.gender.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {
    @Test
    public void onlyWomanInList(){
        //Defining the list
        List<Person> peopleList = new ArrayList<>();

        //Registering a person in the list
        String informedName = "Ana";
        String informedGender = "fem";

        Person personRegistered = new Person(informedName, informedGender);
        peopleList.add(personRegistered);

        //Filtering only womens
        List<Person> womensList = peopleList.stream()
                .filter(person -> person.getGender().equals("fem"))
                .collect(Collectors.toList());

        //Testing if all the members in the list is womens
        boolean onlyWomans = false;

        for (Person person : womensList){
            if(person.getGender() != "fem"){
                onlyWomans = false;
                break;
            }

            onlyWomans = true;
        }

        Assert.assertTrue(onlyWomans);
    }
}
