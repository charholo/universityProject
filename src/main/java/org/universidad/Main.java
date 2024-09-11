package org.universidad;

public class Main {
    public static void main(String[] args) {

        Student p1 = new Student (41);
        p1.setId(1001);
        p1.setName("Charles");
        p1.setLastName("Holguín");
        p1.listPerson();

        Teacher t1 = new Teacher(9000000, true);
        t1.setId(5001);
        t1.setName("Charholo");
        t1.setLastName("Ordoñez");
        t1.listPerson();


        }

        public static void listPerson (Person p){
            p.listPerson();

        }


    }
