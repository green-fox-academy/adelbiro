package practice;

public class Sponsor {
  String name;
  int age;
  String gender;
  String company;
  int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    hiredStudents = 0;
    this.company = company;
  }

  public Sponsor() {
    name = "Jane Doe";
    age = 30;
    gender = "Female";
    hiredStudents = 0;
    company = "Google";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents "
        + company + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;
  }
}
