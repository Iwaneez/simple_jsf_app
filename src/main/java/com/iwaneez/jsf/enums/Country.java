package com.iwaneez.jsf.enums;

public enum Country {

    Slovakia("Slovensko"),
    Czech_Republic("Česká Republika"),
    Poland("Poľsko"),
    Ukraine("Ukrajina"),
    Hungary("Maďarsko"),
    Austria("Rakúsko");

    private String label;

    private Country(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
