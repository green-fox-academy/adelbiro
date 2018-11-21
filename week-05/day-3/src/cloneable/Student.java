package cloneable;

public class Student extends Person implements Cloneable {
  String previousOrganization;
  int skippedDays;

  public Student() {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from "
        + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  public Student clone() {
    Student clone = new Student(this.name, this.age, this.gender, this.previousOrganization);
    return clone;
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

}
