import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        final  int val;
        val  = 10;


            m();

    }

    public static void m()  {



         try {
             int val1 = 0;
             int val2 = 20;

             int cal = (val2 / val1);


             System.out.println(cal);

         }catch (ArithmeticException ex){
             System.out.println("none");
         }

        System.out.println("thank you");



    }
}