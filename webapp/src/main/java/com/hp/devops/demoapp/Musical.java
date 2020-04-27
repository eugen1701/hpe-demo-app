package com.hp.devops.demoapp;

public class Musical {
    public int id;
    public String name = "tom exception";
    public String PASSWORD = "password";
    public String PASSWORD2 = "password2";
    public String PASSWORD3 = "password3";
    public String PASSWORD4 = "password4";
    public String PASSWORD5 = "password5";
    public String PASSWORD6 = "password6";
    public int age;
    public int type1;
    public int type3;
    public int type2;
    public int type4;
    public int type5;
    public int type7;
    public int type8;
    public int type9;
    public int type10;
    public Musical() {
        System.out.println("not   important      constructor");
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(PASSWORD4);
        System.out.println(PASSWORD6);
        System.out.println(PASSWORD7);
    }


    public void setMusical() throws ExceptionInInitializerError {
        throw new ExceptionInInitializerError("some customize   exception with the name of " + name  + age + type10 + PASSWORD7 + PASSWORD6 + type9 + type8 + type2 + type3 + type4 + type5 + PASSWORD5);
    }

}
