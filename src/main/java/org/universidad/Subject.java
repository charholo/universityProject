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
    private ArrayList<Teacher> classTeacherList;

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

    ///Setters Getters

    //Add student to the class
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Adding: " + student.getName() + " to class: " + name);
    }



    public void displayStudents(){
        System.out.println("           ");
        System.out.println("Estudiantes en la clase: " + name +" are");
        for (Student student: students){
            System.out.println(student);
        }
    }
    public void setTotalCurso (int totalCurso){
        this.totalCurso = totalCurso;
    }

    public int getTotalCurso(){
        return totalCurso;
    }


    public void setId (int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public int getIdTeacher(){
        return idTeacher;
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

    public ArrayList<Subject> getArrayRoom(){
        System.out.println("Charlews ---" + classStudentList);
        return classStudentList;
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

    //Metodo de Agregar estudiantes a una materia
    public void addStudentsToSubject (Subject csl){
        this.classStudentList.add(csl);
    }

    public String mostro (){
        String msn = "";
        for (int i = 0; i < classStudentList.size();i++){
            System.out.println(classStudentList.get(i));
            msn = "EncontroooCH";
        }

        System.out. println(msn);
        return msn;
    }

    public void displaySubject(){
        System.out.println("           ");
        System.out.println("Available Subjects: ");
        for (Subject subjects: subjectList){
            System.out.println(subjects);
        }
    }

    //Metodo buscar subject
    public Subject seekSubjectById(int idSSubject){
        Subject subjectFound = null;
        for (Subject sub: subjectList ){
            if (sub.getId() == idSSubject) {
                System.out.println("<subject> seekSubjectById found: " + sub.getId());
                subjectFound = sub;
                return subjectFound;
            }
        }
        return subjectFound;
    }
}
