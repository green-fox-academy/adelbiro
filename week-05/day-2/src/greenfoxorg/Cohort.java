package greenfoxorg;

import java.util.ArrayList;

public class Cohort {
  String name;
  ArrayList<Student> students;
  ArrayList<Mentor> mentors;

  public void addStudent(Student studentToAdd) {
    students.add(studentToAdd);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }

  Cohort(String name) {
    this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();

  }
}
