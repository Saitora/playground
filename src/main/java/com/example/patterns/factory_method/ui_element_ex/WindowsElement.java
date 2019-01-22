package com.example.patterns.factory_method.ui_element_ex;

public abstract class WindowsElement implements Element {

    @Override
    public String toString() {
        return "Windows";
    }

    static class WindowsButton extends WindowsElement {

        @Override
        public String toString() {
            return super.toString() + "Button";
        }
    }

    static class WindowsTextEdit extends WindowsElement {

        @Override
        public String toString() {
            return super.toString() + "TextEdit";
        }
    }

}
