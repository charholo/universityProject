package org.universidad;

import java.util.ArrayList;


public class Subject {

    private String studentClass;

    private int id;
    private String name;
    private String classRoom;
    private int estuuu;
    private ArrayList<Subject> subjectList;
    private ArrayList<Subject> classStudentList;
    private ArrayList<Teacher> classTeacherList;

    private int totalCurso;
    private Subject[] curso;




    public Subject (){
        this.subjectList = new ArrayList<>();
        this.classStudentList = new ArrayList<>();

    }
    public Subject (int estuuu){
        this.estuuu= estuuu;


    }

    public Subject(int id, String name, String classRoom, int totalCurso){

        this.id = id;
        this.name = name;
        this.classRoom = classRoom;
        this.totalCurso = totalCurso;
        this.subjectList = new ArrayList<>();



    }

    ///Setters Getters



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
        /*return "Id=" + getId() +
                ", Name='" + getName() + '\'' +
                ", ClassRoom=" + getClassRoom() +
                ", SubStudent=" + subjectList +
                '}';
          */
        String s = "Id=" + getId() +
                ", Name='" + getName() + '\'' +
                ", ClassRoom=" + getClassRoom();
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

    //Recibe un arreglo de todos los cursos del estudiante
    public void agregarCurso (Subject[] cs){
        //Copia toda la información del Subject [] al arreglo Curso de nuestra clase Subject
        System.arraycopy(cs, 0,this.curso, 0, cs.length);

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


    //Metodo buscar subject
    public Subject seekSubjectById(int idSSubject){
        Subject subjectFound = null;
        for (Subject sub: subjectList ){
            //System.out.println("Mostrar lista ch: " + sub);
            //System.out.println("Mostrar lista ch2: " + subjectList);
            //System.out.println("Iteración del sub id : " + sub.getId() );

            //System.out.println("Conteooooooo");
            if (sub.getId() == idSSubject) {
                System.out.println("<subject> found: " + sub.getId());
                subjectFound = sub;
                return subjectFound;
            }
        }
        return subjectFound;
    }

}
