package com.example.patterns.factory_method.ui_element_ex;

public class App {

    public static void main(String[] args) {
        Form form;

        form = new WindowsForm();
        System.out.println(form.getElement(Element.Type.Button));
        System.out.println(form.getElement(Element.Type.TextEdit));

        form = new KDEForm();
        System.out.println(form.getElement(Element.Type.Button));
        System.out.println(form.getElement(Element.Type.TextEdit));

        form = new GnomeForm();
        System.out.println(form.getElement(Element.Type.Button));
        System.out.println(form.getElement(Element.Type.TextEdit));
    }

}
