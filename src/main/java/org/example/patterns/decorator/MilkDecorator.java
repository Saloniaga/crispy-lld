package org.example.patterns.decorator;

public class MilkDecorator extends BaseDecorator{

    public MilkDecorator(BaseComponent comp) {
        super(comp);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", milk";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 50;
    }
}
