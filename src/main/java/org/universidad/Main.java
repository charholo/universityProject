package org.universidad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        //Student p1 = new Student (10, "Charles","Holguín", 41);
        //p1.listPerson();
        listPerson(new Student(5001, "Charles","Holguín", 41));
        listPerson(new Teacher(1001, "Charholo", "TeacherPoo", 6850000));

        }

        public static void listPerson (Person p){
            p.listPerson();
        }


    }
