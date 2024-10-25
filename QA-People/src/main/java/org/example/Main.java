package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<People> peopleStore = new ArrayList<>();

        People newPerson = PeopleUtil.addPeople("firstName", "lastName", "1990-01-01");

        peopleStore.add(newPerson);

        PeopleUtil.printPeople(peopleStore);






        }
    }
