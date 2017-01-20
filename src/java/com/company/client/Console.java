package com.company.client;

import com.company.SystemEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by parf on 20.1.17.
 */
public class Console implements Observable {

    List<Observer> observers;

    public Console() {
        this.observers = new ArrayList<>();
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObserver(SystemEvent systemEvent) {
        for (Observer observer: observers) {
            observer.process(systemEvent);
        }
    }
}
