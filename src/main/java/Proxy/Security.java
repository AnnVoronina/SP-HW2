package Proxy;

public class Security {
    protected Door door;

    public Security(Door door) {
        this.door = door;
    }

    public void open(String password) {

        if (authenticate(password)) {
            door.open();
        } else {
            System.out.println("Open door impossible");
        }
    }
    public boolean authenticate(String password) {
        return password == "open";
    }

    public void close(){
        door.close();
    }
}
