public class Lesson {

   public Lesson(String s){
       System.out.println(s);
   }
   public  Lesson(){

   }
   public  Lesson(int i){

   }



}

class A {
    public static void main(String[] args) {
        Lesson l = new Lesson();
        Lesson l2  = new Lesson("test");
        Lesson l3  = new Lesson(10);

    }
}
