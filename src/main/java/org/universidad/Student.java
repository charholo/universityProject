package org.universidad;

import java.util.ArrayList;

public class Student extends Person {


    private int id;
    private String name;
    private String lastName;
    private int age;
    private int totalSubject;
    private Subject[] subject;
    private ArrayList<Student> studentList;

    public Student (){
        this.studentList = new ArrayList<>();
    }

    public Student(int id, String name, String lastName, int age){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.subject = new Subject[totalSubject];

    }

    public void setSubject(Subject[] subject){
        this.subject = subject;
    }

    public Subject[] getSubject(){
        return subject;
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
    public int getAge(){
        return age;
    }

    @Override
    public void listPerson(){
        System.out.println("Muestra el Student:\n " + "age:" + age + "\n cod: " + getId() + "\n Name: "+ getName() +"\n lastName: " + getLastName() );
    }

    @Override
    public String toString() {
        return "Id=" + getId() +
                ", Name='" + getName() + '\'' +
                ", lastname=" + getLastName() +
                ", age=" + getAge() +
                '}';
    }

    //Metodo de crear estudiantes
    public void createStudent (Student e){
        this.studentList.add(e);
    }
    //Count
    public int countStudent(){
        return studentList.size();
    }

    public void displayStudens(){
        System.out.println("           ");
        System.out.println("total students : ");
        for (Student students: studentList){
            System.out.println(students);
        }
    }


    //Metodo buscar estudiante
    public Student seekStudentById(int idStudent){
        Student studentFound = null;
        for (Student stu: studentList ){
            //System.out.println("Conteooooooo");
            if (stu.getId() == idStudent) {
                //System.out.println("Student found");
                studentFound = stu;
                return studentFound;
            }
        }
        return studentFound;
    }
}
