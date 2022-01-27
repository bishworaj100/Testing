package com.company;

import java.util.ArrayList;
import java.util.List;

public class OurWork {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Go Home");
        myList.add("Clean room");
        myList.add("Drink Water");
        myList.add("Sleep");
        myList.add("FInal");
        for(String item: myList){
            System.out.println(item);
        }
    }
}
