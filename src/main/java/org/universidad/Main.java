package org.universidad;

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numeroAlum;
        int idTeacherAssociate;
        int ageS;
        int opt;
        int idAsociateS;
        int studentId;
        int teacherId;
        int subjectId;
        int showSubject;
        int subjStud;
        String nameS;
        String lsNameS;
        int StudentID, SubjectID;

        int numeroTeach;
        //int idT;
        String nameT;
        String lsNameT;
        double salaryT;
        int isFullTime;

        int numeroSubj;
        //int idSj=0;
        int totalCurso;
        String nameSj="";
        String classRoom="";

        Student arrayStudent = new Student();
        Teacher arrayTeacher = new Teacher();
        Subject arraySubject = new Subject();
        Subject arraySubject2 = new Subject();

        Subject[] c =new Subject[10];

        //Inicializar clases
        //Subject JavaClass = new Subject(1000, "Java programming","A12",30,100);
        //Subject pythonClass = new Subject(1001, "Poo Python","B12",25,101);
        //Subject javaScriptClass = new Subject(1002, "Java Script class","B12",25,102);
        //Subject AndroidClass = new Subject(1003, "Android class","B12",25,103);

        arraySubject.createSubject(new Subject(1000, "Java programming","A12",30,100));
        arraySubject.createSubject(new Subject(1001, "Poo Python","B12",25,101));
        arraySubject.createSubject(new Subject(1002, "Java Script class","B12",25,102));
        arraySubject.createSubject(new Subject(1003, "Android class","B12",25,103));


        //Inicializar Estudiantes
        arrayStudent.createStudent(new Student (1,"Charholo","Holguin",31));
        arrayStudent.createStudent(new Student (2,"Lizfer","Rios",34));
        arrayStudent.createStudent(new Student (3,"Cesar","Ramirez",22));
        arrayStudent.createStudent(new Student (4,"Jaime","Arias",36));
        arrayStudent.createStudent(new Student (5,"Luisa","Montes",19));
        arrayStudent.createStudent(new Student (6,"Fernanda","Rios",21));


        Student student1 = new Student (1,"Charholo","Holguin",31);

        //Inicializar Teachers
        arrayTeacher.createTeacher(new Teacher (10,"Felipe","Jiménez",4000,1));
        arrayTeacher.createTeacher(new Teacher (11,"Santiago","Ponce de Leon",3800,0));





        //Teacher teacher1 = new Teacher(100,"Felipe","Jiménez",4000,true);
        //Teacher teacher2 = new Teacher(101,"Santiago","Ponce de Leon",4000,false);

        //Add students to class Java
        //JavaClass.addStudent(student1);
        //JavaClass.addStudent(student2);
        //JavaClass.addStudent(student3);

        //Add students to class Python
        //pythonClass.addStudent(student4);
        //pythonClass.addStudent(student5);
        //pythonClass.addStudent(student6);


        //Mostrar estudiantes de las clases
        //JavaClass.displayStudents();
        //pythonClass.displayStudents();

        //Mostrar teachers
        arrayTeacher.displayTeachers();

        //Mostrar sudents
        arrayStudent.displayStudens();



        /////
        do{
            //Student arrayStudent = new Student();
            System.out.println("\n");
            System.out.println("**** Wellcome to the University **** \n");
            System.out.println("1: Create a new student and add it to an existing class");
            System.out.println("2: Create a new Teacher and add it to an existing class");
            System.out.println("3: Create a new class and add an existing teacher ");
            System.out.println("4: Print all the professors and Students with its data");
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
                    System.out.println("Option 1");


                    //Crear Alumno y asociarlo a una Materia
                    System.out.println("How many students do you need register?");
                    numeroAlum = leer.nextInt();


                    for (int i = 1; i <= numeroAlum; i ++){

                        System.out.println("\n");
                        //System.out.println("Enter ID of student " + i);
                        //idS = leer.nextInt();

                        Random numAleatorioS = new Random();
                        int idS = numAleatorioS.nextInt(700-500+1) + 500;
                        System.out.println(idS + " Automatical ID" + " to Student "  + i);
                        System.out.println("Enter NAME of student "+ i);
                        nameS = leer.next();
                        System.out.println("Enter LASTNAME of student " + i);
                        lsNameS = leer.next();
                        System.out.println("Enter AGE of student" + i);
                        ageS = leer.nextInt();

                        arrayStudent.createStudent(new Student(idS, nameS, lsNameS, ageS));
                        //JavaClass.addStudent(new Student(idS, nameS, lsNameS, ageS));

                        //Crrar bucle para asociar studiantes
                        //System.out.println("Este es el objeto para subect para asociarle" + arraySubject.seekSubjectById(1002));

                        //Show all subjects
                        arraySubject.displaySubject();
                        System.out.println(" ");
                        System.out.println("Select one available subject id to asociate Student " + i);
                        idAsociateS = leer.nextInt();
                        arraySubject.seekSubjectById(idAsociateS).addStudent(new Student(idS, nameS, lsNameS, ageS));

                        System.out.println("Process to asociate was correct " + i);
                        arraySubject.seekSubjectById(idAsociateS).displayStudents();


                       //pilas aca //pythonClass.addStudent(new Student(idS, nameS, lsNameS, ageS));


                    }
                    System.out.println(" ");
                    System.out.println(+ arrayStudent.countStudent() + " Students added successfully");
                    break;

                case 2:
                    System.out.println("Option 2");
                    //Crear teacher
                    System.out.println("¿Cuantos Teacher desea crear e Inscribir en el sistema?");
                    numeroTeach = leer.nextInt();

                    for (int t = 1; t <= numeroTeach; t ++){

                        //System.out.println("Enter ID of teacher " + t);
                        //idT = leer.nextInt();
                        Random numAleatorio = new Random();
                        int idT = numAleatorio.nextInt(200-100+1) + 200;
                        System.out.println(idT + " Automatical ID" + " to teacher "  + t);
                        System.out.println("Enter NAME of teacher "+ t);
                        nameT = leer.next();
                        System.out.println("Enter LASTNAME of teacher " + t);
                        lsNameT = leer.next();
                        System.out.println("Enter SALARY of teacher" + t);
                        salaryT = leer.nextDouble();
                        System.out.println("¿The Teacher working full time? Enter value '1' to TRUE or value '2' to FALSE " + t);
                        isFullTime = leer.nextInt();


                        Teacher calcSalary = new Teacher();

                        double finalSalary = calcSalary.calcSalaryteacher(salaryT,isFullTime);
                        arrayTeacher.createTeacher(new Teacher(idT, nameT, lsNameT, finalSalary ,isFullTime));
                    }

                    System.out.println("Numero de elementos: " + arrayTeacher.countTeacher());
                    break;

                case 3:
                    System.out.println("Option 3");

                    /////////Subject

                    //Crear subject
                    System.out.println("¿Cuantas Subjects desea crear e Inscribir en el sistema?");
                    numeroSubj = leer.nextInt();


                    for (int sj = 1; sj <= numeroSubj; sj ++){ //Recorrer las Materias

                        //System.out.println("Enter ID of Subject " + sj);
                        //idSj = leer.nextInt();

                        Random numAleatorioSb = new Random();
                        int idSj = numAleatorioSb.nextInt(900-800+1) + 800;
                        System.out.println(idSj + " Automatical ID" + " to Subject "  + sj);
                        System.out.println("Enter NAME of Subject "+ sj);
                        nameSj = leer.next();
                        System.out.println("Enter ClassRoom of teacher " + sj);
                        classRoom = leer.next();
                        System.out.println("Enter Numero de TotalCursos " + sj);
                        totalCurso = leer.nextInt();


                        do {
                            System.out.println("Enter correct id teacher to asociate");
                            idTeacherAssociate = leer.nextInt();
                        }while (arrayTeacher.seekTeacherById(idTeacherAssociate) == null);


                        //System.out.println("Enter Students Ids" + sj);
                        //subjStud = leer.nextInt();


                        //Objeto que lleva todos los datos Subject
                        arraySubject.createSubject(new Subject(idSj, nameSj, classRoom, totalCurso,idTeacherAssociate));

                        do {
                            //Asociate student with Subject
                            System.out.println("Enter correct Student to add in subject: " + nameSj);
                            studentId = leer.nextInt();
                        }while (arrayStudent.seekStudentById(studentId) == null);
                        Student eS = arrayStudent.seekStudentById(studentId);
                        arraySubject.seekSubjectById(idSj).addStudent(eS);

                    }

                    System.out.println("Alumnos+CLASES: " + arraySubject2.countSubject2());
                    System.out.println(arraySubject2.getId());
                    System.out.println("Numero de elementos: " + arraySubject.countSubject());



                    break;

                case 4:
                    System.out.println("Option 4");
                    arrayTeacher.displayTeachers();
                    arrayStudent.displayStudens();


                    //point B
                    arraySubject.displaySubject();
                    System.out.println(" ");
                    System.out.println("Please enter id of Subject to display information of class");
                    showSubject = leer.nextInt();

                    if (arraySubject.seekSubjectById(showSubject) == null){
                        System.out.println("Materia no encontrada");
                    }else{
                        arraySubject.seekSubjectById(showSubject).displayStudents();
                    }








                    break;

                case 5:
                    System.out.println("Option 5");
                    System.out.println("Seek Alumno ID de alumno");
                    studentId = leer.nextInt();
                    Student eS = arrayStudent.seekStudentById(studentId);
                    if (eS == null){
                        System.out.println("Id doesn't exist");
                    }else{
                        System.out.println("Student found: " + eS);

                        System.out.println(eS.getId());
                    }

                    break;

                case 6:
                    System.out.println("Option 6");

                    //Subject sss = arraySubject.displayIdsSubject();

                    System.out.println("SubjectID");
                    SubjectID = leer.nextInt();

                    System.out.println("StudentID");
                    StudentID = leer.nextInt();
                   // necesito recorrer el array de subjects para hacer la busqueda materia por materia
                    arraySubject.seekSubjectById(SubjectID).displayStudentsCH(StudentID);





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
                        System.out.println("Id doesn't exist ");
                    }else{
                        System.out.println("Subject  found MenuCase8: " + sJ);
                    }
                    break;


                case 9:
                    System.out.println("Program Finish!!!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Unavailable option!");
                    System.out.println("¿Return to menu?");
                    System.out.println("0 = Yes or 7 = No");
                    opt = leer.nextInt();
                    break;
            }
        }
        while(opt!=9);
    }

}
