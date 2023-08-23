package homework2.ex3;

public class Car {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void Start (){
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("my " +  brand + " started");
    }

    private void startElectricity(){
        System.out.println("start Electricity system");
    }
    private void startCommand(){
        System.out.println("start system ");
    }
    private void startFuelSystem(){
        System.out.println("start Fuel system");
    }



}
