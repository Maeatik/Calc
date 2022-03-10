package com.example.calculator;

public class State {

    private String name;
    private String link;

    public State (String name, String link){
        this.name = name;
        this.link = link;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLink(){

        System.out.println(this.link);
        return this.link;
    }

    public void setLink(){
        this.link = link;
    }
}
