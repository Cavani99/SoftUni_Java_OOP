package Student_System;
public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        String commentary = "";

        if (getGrade() >= 5.00)
            commentary = "Excellent student.";
        else if (getGrade() < 5.00 && getGrade() >= 3.50)
            commentary = "Average student.";
        else
            commentary = "Very nice person.";


        return String.format("%s is %d years old. %s", getName(), getAge(), commentary);
    }
}
