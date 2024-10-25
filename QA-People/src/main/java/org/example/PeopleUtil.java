package org.example;

import java.time.LocalDate;
import java.util.ArrayList;


public class PeopleUtil {

    public static People addPeople(String firstName, String lastName, String DOB){
        LocalDate date = LocalDate.parse(DOB);
        return new People(firstName, lastName, date);
    }

    public static void printPeople(ArrayList<People> peopleStore){
        for (int i = 0 ; i < peopleStore.toArray().length ; i++){
            People person = peopleStore.get(i);
            System.out.println(
                    "\nFirst name: " + person.getFirstName() +
                            "\nLast name: " + person.getLastName() +
                            "\nDOB: " + person.getDOB() +
                            "\nAge: " + person.getAgeInt() + " years old" +
                            "\n=================================\n"

            );
        }

    }



}
