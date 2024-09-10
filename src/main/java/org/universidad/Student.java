package org.universidad;

public class Student extends Person {

    private int age;

    public Student(int id, String name, String lastName, int age){
        super(id, name, lastName);
        this.age = age;
    }

    @Override
    public void listPerson(){
        System.out.println("Muestra el Student : " + age);
    }

}
