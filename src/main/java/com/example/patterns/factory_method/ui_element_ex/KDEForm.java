package com.example.patterns.factory_method.ui_element_ex;


public class KDEForm implements Form {
    @Override
    public Element getElement(Element.Type elType) {
        Element element = null;
        switch (elType) {
            case Button:
                element = new KDEElement.KDEButton();
                break;
            case TextEdit:
                element = new KDEElement.KDETextEdit();
                break;
            default:
                assert(false);
        }
        return element;
    }
}
