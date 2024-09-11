package org.universidad;

public class Student extends Person {

    private int age;

    public Student(int age){
        this.age = age;
    }

    @Override
    public void listPerson(){
        System.out.println("Muestra el Student:\n " + "age:" + age + "\n cod: " + getId() + "\n Name: "+ getName());


    }

}
