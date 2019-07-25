package com.finalproject.java;

import com.finalproject.LargeGadget.Gadget;

import java.util.ArrayList;
import java.util.List;

public class SalesClerk {
    private List<Gadget> gadgetList;

    public void beginOrder() {
        gadgetList = new ArrayList<>();

        System.out.println("Welcome to the Wag Corporation. ");
        addToOrder();
        TransactionReceipt myReceipt = new TransactionReceipt(gadgetList);
        myReceipt.printTranscationReceipt();

    }

    private void addToOrder() {
        Scanner in = new Scanner(System.in);
        System.out.println("What type of Gadget would you like?");
        System.out.println("(L)arge, (M)edium or (s)mall");
        String valueType = in.nextLine();

        System.out.println("What Surface would you like?");
        System.out.println(" 1 for Plain, 2 Painted or 3 for Plated");
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

    private Gadget valueGadgetInput(String value, SurfaceColor color) {
        switch (value.toUpperCase()) {
            case "L":
            case "Large":
                return newLargeGadget(color);
            case "M":
            case "Medium":
                return newMediumGadget(color);
            case "S":
            case "Small":
                return newSmallGadget(color);
            default:
                return null;
        }
    }

    private SurfaceColor validateSurfaceColorInput(String value) {
        switch (value.toUpperCase()) {
            case "1":
                return SurfaceColor.PLAIN;
            case "2":
                return SurfaceColor.PAINTED;
            case "3":
                return SurfaceColor.PLATED;
            default:
                return SurfaceColor.PLAIN;

        }
    }
}
