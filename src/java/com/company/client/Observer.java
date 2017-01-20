package com.company.client;

import com.company.SystemEvent;

/**
 * Created by parf on 20.1.17.
 */
public interface Observer {
    public void process(SystemEvent event);
}
