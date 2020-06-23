package com.company;

public class Widget {
    private volatile static Widget uniqueInstance;

    private Widget() {}

    public static Widget getInstance()
    {
        if(uniqueInstance == null)
        {
            synchronized(Widget.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Widget();
                }
            }
        }
        return uniqueInstance;
    }
    public String HighResDisplay()
    {
        return "Drawing a widget using a HighResDisplayDriver.";
    }
    public String LowResDisplay()
    {
        return "Drawing a widget using a LowResDisplayDriver.";
    }
}
