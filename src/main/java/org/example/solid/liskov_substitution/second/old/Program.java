package org.example.solid.liskov_substitution.second.old;

public class Program {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setHeight(10);
        r.setWidth(10);
        System.out.println("area: " + r.getArea());
        Rectangle s = new Square();
        s.setWidth(5);
        s.setHeight(7);
        System.out.println("area: " + s.getArea());//wrong result here
        //because Square is constricting the functions of parent class.
        //Child class should only extend the functionality of parent class.
        //if we replace the super class object with the subclass object,
        // program functionality shouldn't change
    }
}
