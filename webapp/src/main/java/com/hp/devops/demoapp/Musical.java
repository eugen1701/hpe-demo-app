package com.hp.devops.demoapp;

public class Musical {
    public int id;
    public String name = "tom exception";
    public String PASSWORD = "password";
    public String PASSWORD6 = "password6";
    public String PASSWORD8 = "password8";
    public String PASSWORD9 = "password8";
    public int age;
    public int type1;
    public int type3;
    public int type2;
    public int type4;
    public int type11;
    public Musical() {
        System.out.println("not   important      constructor");
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(PASSWORD9);
    }


    public void setMusical() throws ExceptionInInitializerError {
        throw new ExceptionInInitializerError("some customize   exception with the name of " + name  + age + type2 + type11 + PASSWORD8);
    }

}
