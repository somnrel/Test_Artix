package main;

import Factory.Factory;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createTransport(args);

        System.out.println(Arrays.toString(args));
    }
}
