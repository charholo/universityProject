package org.universidad;

abstract class Person {

    private int id;
    private String name;
    private String lastName;

    public void setId (int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }


    public abstract void listPerson();

}
