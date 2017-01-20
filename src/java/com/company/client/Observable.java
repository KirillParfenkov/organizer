package com.company.client;

import com.company.SystemEvent;

/**
 * Created by parf on 20.1.17.
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(SystemEvent event);
}
