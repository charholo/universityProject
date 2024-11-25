package org.universidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numeroAlum;
        int idS;
        int ageS;
        int opt;
        int studentId;
        int teacherId;
        int subjectId;
        int subjStud;
        String nameS;
        String lsNameS;

        int numeroTeach;
        int idT;
        String nameT;
        String lsNameT;
        double salaryT;
        boolean isFullTime;

        int numeroSubj;
        int idSj=0;
        int totalCurso;
        String nameSj="";
        String classRoom="";

        Student arrayStudent = new Student();
        Teacher arrayTeacher = new Teacher();
        Subject arraySubject = new Subject();
        Subject arraySubject2 = new Subject();

        Subject[] c =new Subject[10];

        //Inicializar clases
        Subject programmingJavaClass = new Subject(100, "Java programming","A12",30);

        //Inicializar Estudiantes
        Student student1 = new Student (1,"Charholo","Holguin",31);
        Student student2 = new Student (2,"Lizfer","Rios",34);
        Student student3 = new Student (3,"Cesar","Ramirez",22);
        Student student4 = new Student (4,"Jaime","Arias",36);
        Student student5 = new Student (5,"Luisa","Montes",19);
        Student student6 = new Student (6,"Fernanda","Rios",21);

        programmingJavaClass.addStudent(student1);
        programmingJavaClass.addStudent(student2);
        programmingJavaClass.addStudent(student3);

        programmingJavaClass.displayStudents();


        /////
        do{
            //Student arrayStudent = new Student();
            System.out.println("\n");
            System.out.println("**** Wellcome to the University **** \n");
            System.out.println("1: Create a new student and add it to an existing class");
            System.out.println("2: Create a new Teacher and add it to an existing class");
            System.out.println("3: Create a new class and add an existing teacher ");
            System.out.println("4: Print all the professors with its data");
            System.out.println("5: Print all the classes and a submenu ");
            System.out.println("6: Seek Student by ID");
            System.out.println("7: Seek Teacher by ID");
            System.out.println("8: Seek Subject by ID");
            System.out.println("9: Exit");
            System.out.print("To continue select any option: ");
            opt = leer.nextInt();

            Subject arraySubject3 = new Subject();

            switch (opt) {

                case 1:
                    System.out.println("Opcion 1");


                    //Crear Alumno y asociarlo a una Materia
                    System.out.println("¿Cuantos Alumnos desea crear e Inscribir en el sistema?");
                    numeroAlum = leer.nextInt();


                    for (int i = 1; i <= numeroAlum; i ++){

                        System.out.println("\n");
                        System.out.println("Enter ID of student " + i);
                        idS = leer.nextInt();
                        System.out.println("Enter NAME of student "+ i);
                        nameS = leer.next();
                        System.out.println("Enter LASTNAME of student " + i);
                        lsNameS = leer.next();
                        System.out.println("Enter AGE of student" + i);
                        ageS = leer.nextInt();

                        arrayStudent.createStudent(new Student(idS, nameS, lsNameS, ageS));

                    }

                    System.out.println(+ arrayStudent.countStudent() + " Students added successfully");

                    //System.out.println("Numero de elementos: " + arrayStudent.countStudent());

                    //Busqueda variable Student
                    /*
                    Student eS = arrayStudent.seekStudentById(19);
                    if (eS == null){
                        System.out.println("Id doesn't exist");
                    }else{
                        System.out.println("Student found: " + eS);
                    }
                    */
                    break;

                case 2:
                    System.out.println("Opcion 2");


                    /////////TEACHERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR

                    //Crear teacher y asociarlo a una Materia
                    System.out.println("¿Cuantos Teacher desea crear e Inscribir en el sistema?");
                    numeroTeach = leer.nextInt();


                    for (int t = 1; t <= numeroTeach; t ++){

                        System.out.println("Enter ID of teacher " + t);
                        idT = leer.nextInt();
                        System.out.println("Enter NAME of teacher "+ t);
                        nameT = leer.next();
                        System.out.println("Enter LASTNAME of teacher " + t);
                        lsNameT = leer.next();
                        System.out.println("Enter SALARY of teacher" + t);
                        salaryT = leer.nextDouble();
                        System.out.println("Enter iSFullTime of teacher" + t);
                        isFullTime = leer.nextBoolean();

                        arrayTeacher.createTeacher(new Teacher(idT, nameT, lsNameT, salaryT,isFullTime));
                    }

                    System.out.println("Numero de elementos: " + arrayTeacher.countTeacher());




                    break;

                case 3:
                    System.out.println("Opcion 3");

                    /////////Subject




                    //Crear subject
                    System.out.println("¿Cuantas Subjects desea crear e Inscribir en el sistema?");
                    numeroSubj = leer.nextInt();


                    for (int sj = 1; sj <= numeroSubj; sj ++){ //Recorrer las Materias

                        System.out.println("Enter ID of Subject " + sj);
                        idSj = leer.nextInt();
                        System.out.println("Enter NAME of Subject "+ sj);
                        nameSj = leer.next();
                        System.out.println("Enter ClassRoom of teacher " + sj);
                        classRoom = leer.next();
                        System.out.println("Enter Numero de TotalCursos " + sj);
                        totalCurso = leer.nextInt();


                        System.out.println("Enter Students Ids" + sj);
                        subjStud = leer.nextInt();

                        arraySubject2.addStudentsToSubject(new Subject(subjStud));


                        for (int j=0; j<totalCurso;j ++ ){ //Recorrer los Cursos
                            Subject curso = new Subject();
                            c[j] = curso;

                        }

                        //Objeto que lleva todos los datos
                        arraySubject.createSubject(new Subject(idSj, nameSj, classRoom, totalCurso));//Objeto Primer materia


                    }


                    //System.out.println("  " + arraySubject2.getdisplayNames());


                    System.out.println("Alumnos+CLASES: " + arraySubject2.countSubject2());
                    System.out.println(arraySubject2.getId());
                    System.out.println("Numero de elementos: " + arraySubject.countSubject());



                    break;

                case 4:
                    System.out.println("Opcion 4");
                    System.out.println("Numero de elementos: " + arrayStudent.countStudent());
                    break;

                case 5:
                    System.out.println("Opcion 5");
                    System.out.println("Seek Alumno ID de alumno");
                    studentId = leer.nextInt();
                    Student eS = arrayStudent.seekStudentById(studentId);
                    if (eS == null){
                        System.out.println("Id doesn't exist");
                    }else{
                        System.out.println("Student found: " + eS);
                    }

                    break;

                case 6:
                    System.out.println("Opcion 6");

                    break;

                case 7:
                    //Busqueda variable Teacher

                    System.out.println("Seek Teacher ID");
                    teacherId = leer.nextInt();
                    Teacher tE = arrayTeacher.seekTeacherById(teacherId);
                    if (tE == null){
                        System.out.println("Id doesn't exist");
                    }else{
                        System.out.println("Teacher found: " + tE);
                    }
                    break;

                case 8:
                    //Busqueda ID  Subject

                    System.out.println("Seek Subject ID");
                    subjectId = leer.nextInt();
                    Subject sJ = arraySubject.seekSubjectById(subjectId);
                    if (sJ == null){
                        System.out.println("Id doesn't exist validar");
                    }else{
                        System.out.println("Subject  found MenuCase8: " + sJ);
                    }
                    break;


                case 9:
                    System.out.println("Ejecucion terminada....");
                    System.exit(0);

                    break;

                default:
                    System.out.println("Opcion no disponible:/");
                    System.out.println("¿Desea volver al menu?");
                    System.out.println("0 = si o 7 = no");
                    opt = leer.nextInt();
                    break;
            }

        }while(opt!=9);//fin while


////////










    }

}
