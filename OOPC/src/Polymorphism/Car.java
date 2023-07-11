package Polymorphism;

import Inheritance.Vehicle;

public class Car extends Vehicle {
    private Window window;


    public  Car(Window window){
        this.window = window;
    }

    public  void windowFunction(){
       try {
           window.work();
       }catch (Exception ex){
           System.out.println("No windows to work");
       }

    }

    public void shift(){
        System.out.println("1-6");
    }

    public  void lights(String headLights){
        System.out.println("headLights");
    }
    public  void lights(String headLights,int inten){
        System.out.println("headLights inten " + inten);
    }



}

class Test{
    public static void main(String[] args) {
        Car car = new Car(new Window());

        car.windowFunction();
        car.drive();
        car.shift();

        car.lights("on",2);
        Vehicle car2 = new Car(new Window());
        Car car3 = (Car) car2;

        car3.drive();
        car3.windowFunction();


    }
}
