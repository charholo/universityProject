package org.universidad;

public class Teacher extends Person{

    private double salary;
    private boolean isFullTime;


    public Teacher (double salary, boolean isFullTime){
        this.salary= salary;
        this.isFullTime=isFullTime;
    }

    @Override
    public void listPerson(){
        //System.out.println("Muestra el Teacher : \n"  + " Cod: " + getId() + "\n Name: "+ getName() + "\n LastName: " + getLastName() + "\n $" +salary + "\n fullTime: " + isFullTime);
    }

}
