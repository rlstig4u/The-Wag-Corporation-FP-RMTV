package com.finalproject.java;

import com.finalproject.LargeGadget.Gadget;
import com.finalproject.LargeGadget.LargeGadget;
import com.finalproject.MediumGadget.MediumGadget;
import com.finalproject.SmallGadget.SmallGadget;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.finalproject.java.SurfaceColor.GOLD;


public class SalesClerk {
    private List<Gadget> gadgetList;

    public void beginOrder() {
        gadgetList = new ArrayList<>();

        System.out.println("Welcome to the VR International Innovations.");
        addToOrder();
        TransactionReceipt myReceipt = new TransactionReceipt(gadgetList);
        myReceipt.printTranscationReceipt();

    }

    private void addToOrder() {
        Scanner in = new Scanner(System.in);
        System.out.println("What type of Gadget would you like?");
        System.out.println("(L)arge, (M)edium or (S)mall");
        String valueType = in.nextLine();

        System.out.println("What Surface would you like?");
        System.out.println(" 1 for Gold, 2 Silver or 3 for Platinum");
        // Validate the number
        int valueNum = in.nextInt();
        in.nextLine();
        Gadget value = valueGadgetInput(valueType, validateSurfaceColorInput(String.valueOf(valueNum)));

        // Add Gadget to the list
        System.out.println("Does this complete your order? Yes or No");
        String order = in.nextLine();

        if (order.equals("No") || order.equals("no")) {
            gadgetList.add(value);
            this.addToOrder();
        } else {
            gadgetList.add(value);

        }
    }

    private Gadget valueGadgetInput(String value,SurfaceColor color) {
        switch (value.toUpperCase()) {
            case "L":
            case "l":
            case "Large":
                return new LargeGadget(color);
            case "M":
            case "m":
            case "Medium":
                return new MediumGadget(color);
            case "S":
            case "s":
            case "Small":
                return new SmallGadget(color);
            default:
                return null;
        }
    }

    private SurfaceColor validateSurfaceColorInput(String value) {
        switch (value.toUpperCase()) {
            case "1":
                return SurfaceColor.GOLD;
            case "2":
                return SurfaceColor.SILVER;
            case "3":
                return SurfaceColor.PLATINUM;
            default:
                return GOLD;

        }
    }
}
