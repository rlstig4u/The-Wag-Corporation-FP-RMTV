package com.finalproject.MediumGadget;

import com.finalproject.Widget.LargeWidget;
import com.finalproject.Widget.MediumWidget;
import com.finalproject.Widget.SmallWidget;
import com.finalproject.Widget.Widget;
import com.finalproject.java.AbstractGadget;
import com.finalproject.java.ProductType;
import com.finalproject.java.SerialNumber;
import com.finalproject.java.SurfaceColor;


import java.util.ArrayList;
import java.util.List;

public class MediumGadget extends AbstractGadget {
    public MediumGadget() {
        this(SurfaceColor.PAINTED);
    }

    public MediumGadget(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial(ProductType.MediumGadget);

    }

    @Override
    public List<Widget> getWidget(SurfaceColor color) {
        List<Widget> myList = new ArrayList<>();
        myList.add(new LargeWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new SmallWidget(color));
        myList.add(new SmallWidget(color));
        return myList;
    }


    @Override
    public int getSwitches() {
        return 1;
    }

    @Override
    public int getButtons() {
        return 2;

    }

    @Override
    public int getLights() {
        return 3;
    }

    @Override
    public String getPowerSource() {
        return "Solar";

    }

    @Override
    public float getPrice() {
        return 79.99F;

    }
}