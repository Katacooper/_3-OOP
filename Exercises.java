package javaoop.exercises._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
    }

    /**
     ** 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        Student student = new Student();
        String name = "Francesco";
        String surname = "Iliceto";
        int age = 20;
        boolean isMale = true;
        boolean isFemale = false;

        student.setAge(age);
        student.setName(name);
        student.setSurname(surname);
        student.setGenderMale(isMale);
        student.setGenderFemale(isFemale);

        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("Age: " + student.getAge());
        System.out.println("Is male?: " + student.isGenderMale());
        System.out.println("Is female?: " + student.isGenderFemale());
        // Write and use your 5 getters and setters!
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
    }

}
