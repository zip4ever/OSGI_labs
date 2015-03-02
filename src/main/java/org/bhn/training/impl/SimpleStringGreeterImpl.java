package org.bhn.training.impl;

import org.bhn.training.api.Greeter;

/**
 * Created by KDAAU95 on 2/03/2015.
 */
public class SimpleStringGreeterImpl implements Greeter {
    @Override
    public String greet() {
        return "Hello, world!";
    }
}
