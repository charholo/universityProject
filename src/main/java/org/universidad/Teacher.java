package org.universidad;

import java.util.ArrayList;

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

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
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
            //System.out.println("Conteooooooo");
            if (tech.getId() == idTeacher) {
                //System.out.println("Teacher found");
                teacherFound = tech;
                return teacherFound;
            }
        }
        return teacherFound;
    }

    public double calcSalaryteacher (double salary, int isFullTime){
        double finalSalary = 0;
        if (isFullTime == 1){
            return  (salary * (10 * 1.1)); //10 years of experiences
        } else if (isFullTime == 2) {
            return (salary * (30 * 0.1));// 30 hours per week
        }else
            return finalSalary;
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
        System.out.println("Muestra el Teacher : \n"  + " Cod: " + getId() + "\n Name: "+ getName() + "\n LastName: " + getLastName() + "\n $" +salary + "\n fullTime: " + isFullTime);
    }

}
