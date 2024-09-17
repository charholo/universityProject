package org.universidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numeroAlum;
        int idA;
        int ageA;
        String nameA;
        String lsNameA;

        ArrayList<Student> studentch = new ArrayList<>();

        //Crear Alumno y asociarlo a una Materia
        System.out.println("¿Cuantos Alumnos desea crear e Inscribir en el sistema?");
        numeroAlum = leer.nextInt();

        for (int i = 1; i <= numeroAlum; i ++){

            System.out.println("Enter ID of student " + i);
            idA = leer.nextInt();
            System.out.println("Enter NAME of student "+ i);
            nameA = leer.next();
            System.out.println("Enter LASTNAME of student " + i);
            lsNameA = leer.next();
            System.out.println("Enter AGE of student" + i);
            ageA = leer.nextInt();

            studentch.add(new Student ( idA, nameA, lsNameA, ageA));

        }

        /*
        for (int i = 0; i< studentch.size(); i++){
            System.out.println(studentch);
        }
        */

        for (Student student : studentch){
            if (student.getName() == "Charholo1") {
                System.out.println("es el unoooooooooooooo");
            }
            System.out.println(student.getId() + " + " +student.getName() + " " + student.getLastName() + " " + student.getAge() );

        }



    }

}
