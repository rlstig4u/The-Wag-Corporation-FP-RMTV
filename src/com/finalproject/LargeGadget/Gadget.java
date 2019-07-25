package com.finalproject.LargeGadget;

import com.finalproject.Widget.Widget;
import com.finalproject.java.SurfaceColor;


import java.util.List;

public interface Gadget {
    public List<Widget> getWidget(SurfaceColor color);

    public int getSwitches();
    public int getButtons();
    public int getLights();
    public String getPowerSource();
    public String getSerialNumber();
    public float getPrice();
    public SurfaceColor getColor();

}
