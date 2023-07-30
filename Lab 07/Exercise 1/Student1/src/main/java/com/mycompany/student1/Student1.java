package com.mycompany.student1;
final class Student1 { 

final int marks = 100;

final void display();

class Undergraduate extends Student1{}

// Why :- The Student class is marked as final, which means it cannot be subclassed. The class also has a final method display() without an implementation. This is not allowed, as final methods must have a body (an actual implementation).
// The Undergraduate class attempts to extend the Student class, but since the Student class is marked as final, it cannot be extended. This will cause a compilation error.
