package com.company;

public class Document {
    private volatile static Document uniqueInstance;

    private Document() {}

    public static Document getInstance()
    {
        if(uniqueInstance == null)
        {
            synchronized(Document.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Document();
                }
            }
        }
        return uniqueInstance;
    }
    public String HighResPrint()
    {
        return "Printing a document using a HighResPrintDriver.";
    }
    public String LowResPrint()
    {
        return "Printing a document using a LowResPrintDriver.";
    }
}
