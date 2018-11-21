package cloneable;

//    Every Object has a clone() method, so all of your classes, even though the implementation is empty, it doesn't do anything
//    Get your Student class from the Greenfox Organization Exercise
//    Override and implement the clone() method, so it clones the student
//    Instantiate John, a 20 years old male from BME
//    Clone him into jonhTheClone

import com.sun.jmx.snmp.SnmpInt;

public class Main {
  public static void main(String[] args) {
    Student john = new Student("John", 20, "male", "BME");
    Student jonhTheClone = john.clone();
    john.introduce();
    System.out.println();
    jonhTheClone.introduce();
  }

}
