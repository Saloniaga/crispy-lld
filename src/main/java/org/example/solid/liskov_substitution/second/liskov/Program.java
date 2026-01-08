package org.example.solid.liskov_substitution.second.liskov;

public class Program {
    public static void main(String[] args) {
        Shape s1=new Rectangle(10, 12);
        Shape s2=new Square(10);
        System.out.println(s1.getArea());
        System.out.println(s2.getArea());
    }
}
