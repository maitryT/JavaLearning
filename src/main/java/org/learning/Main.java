package org.learning;

import org.learning.designPattern.Singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


        System.out.println("Singleton Instance : ");
        Singleton.getInstance().print();

    }
}
