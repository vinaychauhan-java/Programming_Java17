package com.vinay.prg1.switchPatterMatching;

sealed interface MySealed permits ClassOne, ClassTwo {
    void greetings();
}

final class ClassOne implements MySealed {
    @Override
    public void greetings() {
        System.out.println("Hello World - 1");
    }
}

final class ClassTwo implements MySealed {
    @Override
    public void greetings() {
        System.out.println("Hello World - 2");
    }
}

public class VinayPrg5 {
    public static void main(String[] args) {
        MySealed mySealedClassObj = new ClassOne();
        new VinayPrg5().getGreetings(mySealedClassObj);
    }

    public void getGreetings(MySealed sealedClassObj) {
        switch (sealedClassObj) {
            case ClassOne classOne -> {
                System.out.println("Greetings from Class One :: ");
                classOne.greetings();
            }
            case ClassTwo classTwo -> {
                System.out.println("Greetings from Class Two :: ");
                classTwo.greetings();
            }
        }
    }
}
