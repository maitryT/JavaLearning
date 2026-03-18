package org.learning;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.learning.designPattern.Singleton;

import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // Design Patterns
        //1. Singleton class
        System.out.println("Singleton Instance : ");
        Singleton.getInstance().print();
    }
}
