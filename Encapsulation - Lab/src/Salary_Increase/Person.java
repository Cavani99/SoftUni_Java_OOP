package Salary_Increase;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    private int age;

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

    public Person(String firstName, String lastName, int age, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva.",
                this.getFirstName(),
                this.getLastName(),
                this.getSalary());
    }

    public void increaseSalary(double percentage){
        if (this.getAge() < 30){
            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 200));
        } else {
            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 100));
        }
    }
}
