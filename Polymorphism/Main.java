package Polymorphism;

public class Main {
    
    public static void main(String[] args) {
        
    Bike bike = new Bike();
    Boat boat = new Boat();

    Vehicle[] racing = {bike , boat};
    
    for(Vehicle x : racing){

        x.go();
    }

    }

}
