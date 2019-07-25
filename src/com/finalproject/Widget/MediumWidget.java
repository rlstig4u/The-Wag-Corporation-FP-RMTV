package com.finalproject.Widget;

import com.finalproject.java.ProductType;
import com.finalproject.java.SerialNumber;
import com.finalproject.java.SurfaceColor;

public class MediumWidget  extends AbstractWidget{

    public MediumWidget(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial (ProductType.LargeWidget);
    }
    @Override
    public String getGears() {
        return "4 Gears";
    }
    @Override
    public String getSprings() {
        return "5 Springs";
    }

    @Override
    public String getLevers() {
        return "3 Lever";
    }
}







