package com.company;

public class DocWidgetFactory {
    public void HighResWidget()
    {
        Widget widget = Widget.getInstance();
        System.out.println(widget.HighResDisplay());
    }
    public void LowResWidget()
    {
        Widget widget = Widget.getInstance();
        System.out.println(widget.LowResDisplay());
    }
    public void HighResDoc()
    {
        Document document = Document.getInstance();
        System.out.println(document.HighResPrint());
    }
    public void LowResDoc()
    {
        Document document = Document.getInstance();
        System.out.println(document.LowResPrint());
    }
}
