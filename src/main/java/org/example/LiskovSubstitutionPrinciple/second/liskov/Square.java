package org.example.LiskovSubstitutionPrinciple.second.liskov;

public class Square implements Shape{
    int length;
    public Square(int length){
        this.length=length;
    }
    @Override
    public int getArea(){
        return length*length;
    }
}