package org.universidad;

import java.util.ArrayList;
import java.util.List;


public class Subject {

    private String studentClass;

    private int id;
    private String name;
    private String classRoom;
    private int idTeacher;
    private List<Student> students;
    private ArrayList<Subject> subjectList;
    private ArrayList<Subject> classStudentList;
    private int totalCurso;


    //Constructores
    public Subject (){
        this.students = new ArrayList<>();
        this.subjectList = new ArrayList<>();
        this.classStudentList = new ArrayList<>();

    }

    public Subject(int id, String name, String classRoom, int totalCurso, int idTeacher){

        this.id = id;
        this.name = name;
        this.classRoom = classRoom;
        this.totalCurso = totalCurso;
        this.idTeacher = idTeacher;
        this.students = new ArrayList<>();
        this.subjectList = new ArrayList<>();
    }

    //Add student to the class
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Adding: " + student.getName() + " to class: " + name);
    }
    public void displayStudents(){
        System.out.println("           ");
        System.out.println("Subject: " + name + " With id: " + getId() + " Room: "+getClassRoom() + " Ncourse: " + getTotalCurso() + " Teacher: " + getIdTeacher() + " has students: " );
        for (Student student: students){
            System.out.println(student);
        }
    }

    //////
    public void displayStudentsCH(int searchById){
        System.out.println("           ");
         for (Student student: students){
            if (student.getId() == searchById){
                System.out.println("Id: " + id + " Subject: " + name + " With id: " + getId() + " Room: "+getClassRoom() + " Ncourse: " + getTotalCurso() + " Teacher: " + getIdTeacher() + " has students: " );
                System.out.println(" ");
                System.out.println(student);
            }
        }
    }

  /////


    public void setTotalCurso (int totalCurso){
        this.totalCurso = totalCurso;
    }

    public int getTotalCurso(){
        return totalCurso;
    }
    public int getId(){
        return id;
    }
    public int getIdTeacher(){
        return idTeacher;
    }
    public String getName(){
        return name;
    }
    public String getClassRoom(){
        return classRoom;
    }

    @Override
    public String toString() {
        String s = "Id=" + getId() +
                ", Name='" + getName() + '\'' +
                ", ClassRoom=" + getClassRoom() +
                ", total cursos=" + getTotalCurso() +
                ", Id Teacher=" + getIdTeacher();
                for (Subject curso : this.subjectList){
                    s += curso.toString();
                }
                return s;

    }

    //Metodo de crear Subjects
    public void createSubject (Subject s){
        this.subjectList.add(s);

    }

    //Count
    public int countSubject(){
        return subjectList.size();
    }

    public int countSubject2(){
        return classStudentList.size();
    }

    public void displaySubject(){
        System.out.println("           ");
        //System.out.println("Available Subjects: ");
        for (Subject subjects: subjectList){
            System.out.println(subjects);
        }
    }
    public void subjectByStudentId(int StudentID){
        System.out.println("           ");
        for (Subject subjects: subjectList){
            seekSubjectById(subjects.getId()).displayStudentsCH(StudentID);
        }
    }

    //Metodo buscar subject
    public Subject seekSubjectById(int idSSubject){
        Subject subjectFound = null;
        for (Subject sub: subjectList ){
            if (sub.getId() == idSSubject) {
                //System.out.println("<subject> seekSubjectById found: " + sub.getId());
                subjectFound = sub;
                return subjectFound;
            }
        }
        return subjectFound;
    }
}
