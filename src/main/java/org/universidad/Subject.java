package org.universidad;

import java.util.ArrayList;

public class Subject {

    private String studentClass;

    private int id;
    private String name;
    private String classRoom;
    private ArrayList<Subject> subjectList;
    private ArrayList<Student> classStudentList;
    private ArrayList<Teacher> classTeacherList;



    public Subject (){
        this.subjectList = new ArrayList<>();
    }

    public Subject(int id, String name, String classRoom){

        this.id = id;
        this.name = name;
        this.classRoom = classRoom;

    }

    ///Setters Getters

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

    public void setClassRoom(String classRoom){
        this.classRoom = classRoom;
    }

    public String getClassRoom(){
        return classRoom;
    }

    @Override
    public String toString() {
        return "Id=" + getId() +
                ", Name='" + getName() + '\'' +
                ", lastname=" + getClassRoom() +
                '}';
    }

    //Metodo de crear estudiantes
    public void createSubject (Subject s){
        this.subjectList.add(s);
    }
    //Count
    public int countSubject(){
        return subjectList.size();
    }


    //Metodo buscar estudiante
    public Subject seekSubjectById(int idSSubject){
        Subject subjectFound = null;
        for (Subject sub: subjectList ){
            System.out.println("Conteooooooo");
            if (sub.getId() == idSSubject) {
                System.out.println("<subject> found");
                subjectFound = sub;
                return subjectFound;
            }
        }
        return subjectFound;
    }

}
