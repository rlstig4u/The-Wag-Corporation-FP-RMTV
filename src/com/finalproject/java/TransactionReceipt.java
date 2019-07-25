package com.finalproject.java;

import com.finalproject.LargeGadget.Gadget;
import com.finalproject.Widget.Widget;

import java.util.ArrayList;
import java.util.List;

public class TransactionReceipt {
    private List<Gadget> gadgetList;
    private List<Widget> largeWidgetList;
    private List<Widget> mediumWidgetList;
    private List<Widget> smallWidgetList;
    private float priceTotal;

    public TransactionReceipt(List<Gadget> gadgetList) {
        this.gadgetList = new ArrayList<>();
        this.gadgetList = gadgetList;
        getWidgetList();

    }

    void printTranscationReceipt() {
        System.out.println();
        System.out.println();
        System.out.println("Wag Corporation");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Gadget");
        printGadgets();
        System.out.println();
        printWidgets();
        System.out.println();
        printAccessories();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println(String.format("%-20s", priceTotal));

    }

    private void getWidgetList() {
        List<Widget> widgetList = new ArrayList<>();
        largeWidgetList = new ArrayList<>();
        mediumWidgetList = new ArrayList<>();
        smallWidgetList = new ArrayList<>();

        for (Gadget aGadgetList : gadgetList) {
            widgetList.addAll(aGadgetList
                    .getWidget(aGadgetList.getColor()));
        }
        for (int i = 0; i < widgetList.size(); i++) {

            if (widgetList.get(i).getClass().getSimpleName().equals("WidgetLarge")) {
                largeWidgetList.add(widgetList.get(i));

            }
            if (widgetList.get(i).getClass().getSimpleName().equals("WidgetMedium")) {
                mediumWidgetList.add(widgetList.get(i));

            }
            if (widgetList.get(i).getClass().getSimpleName().equals("WidgetSmall")) {
                smallWidgetList.add(widgetList.get(i));
            }
        }

    }

    private void printGadgets() {
        for (Gadget aGadgetList : gadgetList) {
            String type = aGadgetList.getClass().getSimpleName();
            String color = aGadgetList.getColor().toString();
            float price = aGadgetList.getPrice();
            priceTotal += price;
            System.out.println(String.format("%s %-20s $%s", color, type, price));
        }
    }

    private void printWidgets() {
        System.out.println("Widgets");
        System.out.println("(" + largeWidgetList.size() + ") Large Widgets");
        System.out.println("(" + mediumWidgetList.size() + ") Medium Widgets");
        System.out.println("(" + smallWidgetList.size() + ") Small Widget");

    }

    private void printAccessories() {
        System.out.println("Accessories");
        if (getLights() > 0) {
            System.out.println("(" + getLights() + ") Lights");
        }
        System.out.println("(" + getSwitches() + ") Switches");
        System.out.println("(" + getButtons() + ") Buttons");
        for (Gadget aGadgetList : gadgetList) {
            String powersource = aGadgetList.getPowerSource();
            System.out.println(powersource);
        }
    }

    private int getLights() {
        int totalLights = 0;
        for (Gadget aGadgetList : gadgetList) {
            totalLights += aGadgetList.getLights();

        }
        return totalLights;
    }

    private int getButtons() {
        int totalButtons = 0;
        for (Gadget aGadgetList : gadgetList) {
            totalButtons += aGadgetList.getLights();

        }
        return totalButtons;
    }

    private int getSwitches() {
        int totalSwitches = 0;
        for (Gadget aGadgetList : gadgetList) {
            totalSwitches += aGadgetList.getLights();
        }
        return totalSwitches;
    }
}










}
