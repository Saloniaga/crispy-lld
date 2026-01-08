package org.example.Decorator;

public class SugarDecorator extends BaseDecorator{
    public SugarDecorator(BaseComponent comp) {
        super(comp);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", sugar";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+20;
    }
}
