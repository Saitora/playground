package com.example.patterns.factory_method.ui_element_ex;


public class WindowsForm implements Form {
    @Override
    public Element getElement(Element.Type elType) {
        Element element = null;
        switch (elType) {
            case Button:
                element = new WindowsElement.WindowsButton();
                break;
            case TextEdit:
                element = new WindowsElement.WindowsTextEdit();
                break;
            default:
                assert(false);
        }
        return element;
    }
}
