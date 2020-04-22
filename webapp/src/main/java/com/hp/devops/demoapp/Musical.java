package com.hp.devops.demoapp;

public class Musical {
    public int id;
    public String name = "tom exception";
    public String PASSWORD = "password";
    public String PASSWORD2 = "password2";
    public int age;
    public int type1;
    public int type3;
    public int type2;
    public int type4;
    public int type5;
    public Musical() {
        System.out.println("not   important      constructor");
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(PASSWORD2);
    }


    public void setMusical() throws ExceptionInInitializerError {
        throw new ExceptionInInitializerError("some customize   exception with the name of " + name  + age + type1 + type2 + type3 + type4 + type5 + PASSWORD);
    }

}
