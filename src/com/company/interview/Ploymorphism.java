package com.company.interview;

public class Ploymorphism {

    public static void main(String[] args) {
        Father a = new Son();
        a.eating();

    }

}

class Father {

    String name="father";

    public void eating() {

    }

}


class Son extends Father {

    String name = "Son";

    @Override
    public void eating() {
        System.out.println(name);
        System.out.println(super.name);
        // do specific fo son
    }

}




