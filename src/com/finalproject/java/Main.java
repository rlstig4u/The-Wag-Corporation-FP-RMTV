package com.finalproject.java;

import com.finalproject.LargeGadget.Gadget;
import com.finalproject.LargeGadget.LargeGadget;
import com.finalproject.MediumGadget.MediumGadget;
import com.finalproject.SmallGadget.SmallGadget;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Run Simulation
        //simulation();
       SalesClerk clerk = new SalesClerk();
       clerk.beginOrder();

    }

    //Simulation for testing
        private static void simulation() {
            List<Gadget> gadgetList = gadgetList = new ArrayList<>();
            gadgetList.add(new LargeGadget());
            gadgetList.add(new LargeGadget());
            gadgetList.add(new MediumGadget(SurfaceColor.PLATINUM));
            gadgetList.add(new SmallGadget(SurfaceColor.GOLD));

            //TODO: send it to a receipt class.
            TransactionReceipt rec = new TransactionReceipt(gadgetList);
            rec.printTranscationReceipt();

    }

    }
