package Adapter;

import Adapter.IntsCalculator.Ints;
import Adapter.IntsCalculator.IntsCalculator;

public class Main {

    public static void main(String[] args) {


        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.mult(7, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));
    }
}