package org.universidad;

abstract class Person {

    private int id;
    private String name;
    private String lastName;


    public Person(int id, String name, String lastName ){
        this.id = id;
        this.name = name;
        this.lastName = lastName;

    }
    public abstract void listPerson();

}
