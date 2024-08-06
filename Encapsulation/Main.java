package Encapsulation;

public class Main {
    
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle("BMW", "M416", 2022);

        System.out.println(vehicle.getModel());
        System.out.println(vehicle.getName());
        System.out.println(vehicle.getYear());
        
        vehicle.setYear(2023);
        System.out.println(vehicle.getYear());
    }
}
