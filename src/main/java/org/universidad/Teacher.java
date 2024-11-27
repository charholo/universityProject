package org.universidad;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;

public class Teacher extends Person{

    private int id;
    private String name;
    private String lastName;
    private double salary;
    private int isFullTime;
    private ArrayList<Teacher> teacherList;

    public Teacher (){
        this.teacherList = new ArrayList<>();
    }

    public Teacher(int id, String name, String lastName, double salary, int isFullTime){

        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    ///Setters Getters

    public void setTeacherId (int id){
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

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }
    public void setIsFullTine(int isFullTime){
        this.isFullTime = isFullTime;
    }

    public int getIsFullTime(){
        return isFullTime;
    }



    //Metodo de crear Teachers
    public void createTeacher (Teacher t){
        this.teacherList.add(t);
    }
    //Count
    public int countTeacher(){
        return teacherList.size();
    }

    public void displayTeachers(){
        System.out.println("           ");
        System.out.println("total teachers : ");
        for (Teacher teacher: teacherList){
            System.out.println(teacher);
        }
    }

    //Metodo buscar teacher
    public Teacher seekTeacherById(int idTeacher){
        Teacher teacherFound = null;
        for (Teacher tech: teacherList ){
            System.out.println("Conteooooooo");
            if (tech.getId() == idTeacher) {
                System.out.println("Teacher found");
                teacherFound = tech;
                return teacherFound;
            }
        }
        return teacherFound;
    }

    public double calcSalaryteacher (double salary, int isFullTime){
        double finalSalary;
        if (isFullTime == 1){
            return finalSalary = (salary * 2);
        } else if (isFullTime == 2) {
            return finalSalary = (salary * 1);
        }else
            return 0;
    }

    @Override
    public String toString() {
        return "Id=" + getId() +
                ", Name='" + getName() + '\'' +
                ", lastname=" + getLastName() +
                ", salary=" + getSalary() +
                ", isFullTine=" + getIsFullTime() +
                '}';
    }

    @Override
    public void listPerson(){
        //System.out.println("Muestra el Teacher : \n"  + " Cod: " + getId() + "\n Name: "+ getName() + "\n LastName: " + getLastName() + "\n $" +salary + "\n fullTime: " + isFullTime);
    }

}
