package org.universidad;

public class Student extends Person {


    private int id;
    private String name;
    private String lastName;
    private int age;
    private int totalSubject;
    private Subject[] subject;

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

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public void listPerson(){
        System.out.println("Muestra el Student:\n " + "age:" + age + "\n cod: " + getId() + "\n Name: "+ getName() +"\n lastName: " + getLastName() );
    }

    public void addSubject (Subject[] s){
        System.arraycopy(s , 0 , this.subject, 0, s.length);
    }

    @Override
    public String toString() {
        return "Id='" + getId() + '\'' +
                ", Name='" + getName() + '\'' +
                ", lastname=" + getLastName() +
                '}';
    }






}
