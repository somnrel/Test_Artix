package main;

import Factory.Factory;
import Transport.Transport;
import Transport.Scooter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        for(String type:args){
            Transport transport = factory.createTransport(type); // Фабрика по созданию объектов
            transport.printParam(); //Выводим параметры каждого из объектов
            System.out.println();
        }
    }
}
