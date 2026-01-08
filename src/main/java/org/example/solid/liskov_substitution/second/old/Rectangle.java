package org.example.solid.liskov_substitution.second.old;

class Rectangle {
    public int height;
    protected int width;
    public void setHeight(int h){
        height = h;
    }
    public void setWidth(int w){
        this.width = w;
    }
    public int getArea(){
        return width*height;
    }
}

class Square extends Rectangle{
    @Override
    public void setHeight(int h){
        height = h;
        width = h;
    }
    @Override
    public void setWidth(int w){
        this.width = w;
        this.height = w;
    }
}

