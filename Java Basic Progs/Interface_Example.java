interface Camera {
    void takeSnap();
    void RecordVideo();
    default void Record4k() {
        Greet();
        System.out.println("Recording In 4k...");
    }
    private void Greet() {
        System.out.println("Good Morning");
    }
}
interface Wifi{
    String[] getNetworks();
    default void ConnectToNetworks() {
        System.out.println("Connecting To Networks...");
    }
}
class CellPhone{
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void PickCall() {
        System.out.println("Connecting...");
    }
}
class SmartPhone extends CellPhone implements Camera , Wifi {
    public void takeSnap() {
        System.out.println("Taking Snap...");
    }
    public void RecordVideo() {
        System.out.println("Recording Video...");
    }
    public void ConnectToNetworks() {
        System.out.println("Connecting To Network In SmartPhone...");
    }
    public String[] getNetworks() {
        System.out.println("Getting Network List...");
        String[] str = {"Amit","Jatin","Hardik"};
        return str;
    }
    public void Features() {
        System.out.println("This Is Feature Of Smartphone...");
    }
}
public class Interface_Example {
    public static void main(String[] args) {
        SmartPhone ms = new SmartPhone();
        String[] str = ms.getNetworks();
        for(String i : str) {
            System.out.println(i);
        }
        ms.Record4k();
        ms.ConnectToNetworks();
        Camera cam = new SmartPhone();
        cam.takeSnap();
        cam.RecordVideo();
    }
}
