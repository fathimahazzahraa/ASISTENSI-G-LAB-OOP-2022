// Abstract class untuk Dog
abstract class Dog {
    int position;
    int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    abstract void move(); 
    abstract void describe();
}

// Interface untuk Smartphone
interface Smartphone {
    void move();
}

// Interface untuk Car
interface Car {
    void move();
}

class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Pitbull memiliki tubuh yang berotot dan gagah.");
    }

    @Override
    void move() {
        this.position += 3;
    }
    
}

class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Ras Siberian Husky adalah ras anjing yang lincah dan tahan dingin.");
    }

    @Override
    void move() {
        this.position += 2;
    }
}

class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Bulldog memiliki tubuh lebar, besar, moncong pesek, berkaki pendek dan memiliki ekstra kulit yang jatuh berlipat.");
    }

    @Override
    void move() {
        this.position += 1;
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Ras German Shepherd adalah ras anjing yang cerdas dan lincah.");
    }

    @Override
    void move() {
        this.position += 3;
    }
}

class Iphone implements Smartphone  {
    int price;
    String brand;

    public Iphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class BMW implements Car {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public BMW(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}

// Class Main
public class Main {
    public static void main(String[] args) {
        Smartphone iphone = new Iphone(23500000, "Iphone 14 Pro Max");
        iphone.move();

        Car bmw = new BMW(6, "White", 250);
        bmw.move();

        Dog siberianHusky = new SiberianHusky(0, 60);
        siberianHusky.move();
        siberianHusky.describe();
        System.out.println("Posisi SiberianHusky : " + siberianHusky.position);
    }
}

       
