package com.finalproject.SmallGadget;

import com.finalproject.Widget.MediumWidget;
import com.finalproject.Widget.SmallWidget;
import com.finalproject.Widget.Widget;
import com.finalproject.java.AbstractGadget;
import com.finalproject.java.ProductType;
import com.finalproject.java.SerialNumber;
import com.finalproject.java.SurfaceColor;

import java.util.ArrayList;
import java.util.List;

public class SmallGadget extends AbstractGadget {
    public SmallGadget() {
        this(SurfaceColor.PAINTED);
    }

    public SmallGadget(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial(ProductType.SmallGadget);

    }

@Override
public List<Widget> getWidget(SurfaceColor color) {
    List<Widget> myList = new ArrayList<>();
    myList.add(new MediumWidget(color));
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
        return 0;
    }

    public String  getPowerSource() {
        return "battery";
    }

    @Override
    public float getPrice() {
        return 49.95F;
    }

}
