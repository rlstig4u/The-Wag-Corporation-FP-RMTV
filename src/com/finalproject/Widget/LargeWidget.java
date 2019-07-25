package com.finalproject.Widget;

import com.finalproject.java.ProductType;
import com.finalproject.java.SerialNumber;
import com.finalproject.java.SurfaceColor;

public class LargeWidget extends AbstractWidget {
    public LargeWidget(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial (ProductType.LargeWidget);
    }
    @Override
    public String getGears() {
        return "9 Gears";
    }
    @Override
    public String getSprings() {
        return "4 Springs";
    }

    @Override
    public String getLevers() {
        return "2 Lever";
    }
}
