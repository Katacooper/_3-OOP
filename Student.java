package javaoop.exercises._3;

public class Student {
    private String name = null;
    private String surname = null;
    private int age = 0;
    private boolean genderMale = false;
    private boolean genderFemale = false;

    public Student(String name, int age)
    {
        System.out.println("Constructing...");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");
    }

   public Student(String name)
    {
        this.name = name;
        System.out.println("Constructor 1");
    }

    public Student(int age) {
        this.age = age;
        System.out.println("Constructor 2");
    }

    public Student() {
       // System.out.println("Constructor 3");
    }

    public void setName(String name) {
        if(name == null) {
            System.out.println("The value is wrong!!");
        }
        else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("The value is wrong!!");
        }
        else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setGenderFemale(boolean genderFemale) {
        this.genderFemale = genderFemale;
    }

    public void setGenderMale(boolean genderMale) {
        this.genderMale = genderMale;
    }

    public void setSurname(String surname) {
        if(surname == null){
            System.out.println("The value is wrong!!");
        }
        else {
            this.surname = surname;
        }
    }

    public boolean isGenderFemale() {
        return genderFemale;
    }

    public boolean isGenderMale() {
        return genderMale;
    }

    public String getSurname() {
        return surname;
    }

}
