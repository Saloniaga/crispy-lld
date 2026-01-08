package org.example.LiskovSubstitutionPrinciple.second.liskov;

public class Rectangle implements Shape{
    int length;
    int width;
    public Rectangle(int length, int width){
        this.width=width;
        this.length=length;
    }
    @Override
    public int getArea(){
        return width*length;
    }
}
