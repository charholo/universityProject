package org.universidad;

public class Teacher extends Person{

    private double salary;


    public Teacher (int id, String name, String lastName, double salary){
        super(id, name, lastName);
        this.salary= salary;
    }

    @Override
    public void listPerson(){
        System.out.println("Muestra el Teacher : " + salary);
    }

}
