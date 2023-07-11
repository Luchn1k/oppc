package CarFac;

public class Car extends   Vehicle  implements  A,B{
    @Override
    public void drive() {

    }
}

class Test{
    public static void main(String[] args) {
        Vehicle v = new Car();
    }
}
