package com.finalproject.Widget;

import com.finalproject.java.SurfaceColor;


public abstract class AbstractWidget implements Widget {

    private SurfaceColor color;
    protected String serialNumber;

    public AbstractWidget(SurfaceColor color) {
        this.color = color;
    }

    public SurfaceColor getColor() {
        return color;
    }

    @Override
    public String getSerialNumber() {
        return serialNumber;
    }
}
