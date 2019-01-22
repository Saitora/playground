package com.example.patterns.factory_method.ui_element_ex;

public abstract class KDEElement implements Element {

    @Override
    public String toString() {
        return "KDE";
    }

    static class KDEButton extends KDEElement {

        @Override
        public String toString() {
            return super.toString() + "Button";
        }
    }

    static class KDETextEdit extends KDEElement {

        @Override
        public String toString() {
            return super.toString() + "TextEdit";
        }
    }

}
