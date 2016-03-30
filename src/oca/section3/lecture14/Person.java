package oca.section3.lecture14;
public class Person {
  Person neighbour;
  public static void main(String [] args) {
    Person p1 = new Person();
    Person p2 = new Person();
    p1.neighbour = p2;   // p1 refers to p2
    p2.neighbour = p1;   // p2 refers to p1
    p1 = null;
    p2 = null;
    // Perform your long-running operations
    // p1 and p2 are eligible for garbage collection
  }
}