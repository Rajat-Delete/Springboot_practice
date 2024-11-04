package com.example.LearnSpringboot;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String Text) throws IllegalArgumentException{
        System.out.println("Inside this");
        setValue(Text.trim().toLowerCase());
    }
}
