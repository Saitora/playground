package com.example.patterns.factory_method.ui_element_ex;


public class GnomeForm implements Form {
    @Override
    public Element getElement(Element.Type elType) {
        Element element = null;
        switch (elType) {
            case Button:
                element = new GnomeElement.GnomeButton();
                break;
            case TextEdit:
                element = new GnomeElement.GnomeTextEdit();
                break;
            default:
                assert(false);
        }
        return element;
    }
}
