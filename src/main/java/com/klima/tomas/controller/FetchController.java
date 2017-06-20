package com.klima.tomas.controller;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FetchController {
    private String type;
    private Value value;

    public FetchController() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
