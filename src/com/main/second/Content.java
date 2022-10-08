package com.main.second;

public class Content {

    public static final String ANSI_GREEN = "\u001B[32m";
    private final String description;

    public Content(String description) {
        this.description = description;
    }

    void show() {
        System.out.println(ANSI_GREEN + this.description);
    }
}
