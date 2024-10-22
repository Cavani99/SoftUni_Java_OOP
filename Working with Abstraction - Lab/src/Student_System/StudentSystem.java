package Student_System;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem()
    {
        this.students = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.students;
    }

    public void addStudent(String name, int age, double grade){
        if (!students.containsKey(name)) {
            Student student = new Student(name, age, grade);

            students.put(name,student);
        }
    }

    public void showStudent(String name){
        if (students.containsKey(name)) {
            Student student = students.get(name);

            System.out.println(student.toString());
        }
    }

}
