package Facade;

public class Main {


    public static void main(String[] args) {

        BinOperation binOperation = new BinOperation();

        System.out.println("The sum is: "  +binOperation.sum("1101001", "110011"));
        System.out.println("The composition is: "  +binOperation.mult("1101001", "110011"));
    }




}
