package Proxy;

public class Main {
    public static void main(String[] args) {
        Security security = new Security(new LabDoor());
        security.open("invalid");

        security.open("open");
    }


}
