package com.finalproject.Widget;

import com.finalproject.java.ProductType;
import com.finalproject.java.SerialNumber;
import com.finalproject.java.SurfaceColor;

public class SmallWidget extends AbstractWidget{

    public SmallWidget(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial (ProductType.SmallWidget);
    }
    @Override
    public String getGears() {
        return "2 Gears";
    }
    @Override
    public String getSprings() {
        return "3 Springs";
    }

    @Override
    public String getLevers() {
        return "1 Lever";
    }
}



