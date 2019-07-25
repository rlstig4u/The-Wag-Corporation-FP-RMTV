package com.finalproject.LargeGadget;

import com.finalproject.Widget.LargeWidget;
import com.finalproject.Widget.MediumWidget;
import com.finalproject.Widget.SmallWidget;
import com.finalproject.Widget.Widget;
import com.finalproject.java.*;

import java.util.ArrayList;
import java.util.List;

public class LargeGadget extends AbstractGadget {
    public LargeGadget() {
        this(SurfaceColor.PAINTED);

    }

    public LargeGadget(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial(ProductType.LargeGadget);

    }

    @Override
    public List<Widget> getWidget(SurfaceColor color) {
        List<Widget> myList = new ArrayList<>();
        myList.add(new LargeWidget(color));
        myList.add(new LargeWidget(color));
        myList.add(new LargeWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new SmallWidget(color));
        myList.add(new SmallWidget(color));
        myList.add(new SmallWidget(color));
        return myList;
    }

    @Override
    public int getSwitches() {
        return 2;
    }

    @Override
    public int getButtons() {
        return 4;

    }

    @Override
    public int getLights() {
        return 5;
    }

    @Override
    public String getPowerSource() {
        return "Generator";

    }

    @Override
    public float getPrice() {
        return 84.99F;
    }
}

