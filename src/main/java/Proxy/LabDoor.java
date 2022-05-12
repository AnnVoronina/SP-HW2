package Proxy;

public class LabDoor implements Door{



    @Override
    public void open() {
        System.out.println("The door open");
    }

    @Override
    public void close() {
        System.out.println("The door close");
    }
}
