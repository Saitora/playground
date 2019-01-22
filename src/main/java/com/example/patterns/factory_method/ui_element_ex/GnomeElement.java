package com.example.patterns.factory_method.ui_element_ex;

public abstract class GnomeElement implements Element {

    @Override
    public String toString() {
        return "Gnome";
    }

    static class GnomeButton extends GnomeElement {

        @Override
        public String toString() {
            return super.toString() + "Button";
        }
    }

    static class GnomeTextEdit extends GnomeElement {

        @Override
        public String toString() {
            return super.toString() + "TextEdit";
        }
    }

}
