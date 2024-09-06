package com.daniel.gender.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {
    @Test
    public void onlyWomanInList(){
        List<Person> peopleList = new ArrayList<>();

        List<Person> womensList = peopleList.stream()
                .filter(person -> person.getGender().equals("fem"))
                .collect(Collectors.toList());

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
