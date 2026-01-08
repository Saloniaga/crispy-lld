package org.example.patterns.decorator;

public abstract class BaseDecorator implements BaseComponent{
    BaseComponent baseComponent;
    public BaseDecorator(BaseComponent comp){
        baseComponent = comp;
    }

    @Override
    public String getDescription() {
        return baseComponent.getDescription();
    }

    @Override
    public int getPrice() {
        return baseComponent.getPrice();
    }
}
