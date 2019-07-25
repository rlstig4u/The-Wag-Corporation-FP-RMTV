package com.finalproject.java;

public class SerialNumber {

    private static SerialNumber instance;
    private String serialPrefix;
    private int count;

    public synchronized static SerialNumber getInstance(){
        if(instance ==null) {
            instance = new SerialNumber();
        }
            return instance;
    }
    private SerialNumber(){}

    public synchronized String getNextSerial(ProductType type) {
        int value;
        switch (type) {
            case LargeGadget:
                serialPrefix = "06LRG";
                count = 3467;
                value = ++count;
                return serialPrefix + value;
            case MediumGadget:
                serialPrefix = "04MED";
                count = 2356;
                value = ++count;
                return serialPrefix + value;
            case SmallGadget:
                serialPrefix = "02SML";
                count = 1245;
                value = ++count;
                return serialPrefix + value;
            case LargeWidget:
                serialPrefix = "66LRG";
                count = 3568;
                value = ++count;
                return serialPrefix + value;
            case MediumWidget:
                serialPrefix = "44MED";
                count = 2457;
                value = ++count;
                return serialPrefix + value;
            case SmallWidget:
                serialPrefix = "22SML";
                count = 1346;
                value = ++count;
                return serialPrefix + value;

                default:
                    return "no type specified";


        } // switch

    } // method

    } // class








