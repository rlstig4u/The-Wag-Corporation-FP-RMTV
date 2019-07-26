package com.finalproject.java;


import com.finalproject.LargeGadget.Gadget;

public abstract class AbstractGadget implements Gadget {

    private SurfaceColor color;
    protected String serialNumber;

    public AbstractGadget() {
        this(SurfaceColor.GOLD);
    }

    public AbstractGadget(SurfaceColor color) {
        this.color = color;

    }

    public SurfaceColor getColor() {
        return color;

    }

    @Override
    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "was added to the order";
    }
}




