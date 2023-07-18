package cal;

public class Cal {

  public void getUserInput(String userInput){
      // user input method
      System.out.println("User Input");
  }


  public String calculate(String value1, String value2, String operator){
      String returnVal;
      float calculate;
      try {
          float val1 = convert(value1);
          float val2 = convert(value2);

          switch (operator){
              case "-":
                  calculate = val1 - val2;
                  returnVal = String.valueOf(calculate);
                  break;
              case "+":
                  calculate = val1 + val2;
                  returnVal = String.valueOf(calculate);
                  break;
              case "/":
                  calculate = val1 / val2;
                  returnVal = String.valueOf(calculate);
                  break;
              case "*":
                  calculate = val1 * val2;
                  returnVal = String.valueOf(calculate);
                  break;
              default:
                  returnVal = "Invalid Value";
          }

      }catch (NumberFormatException ex){
          returnVal = "Invalid Value";
      }
      return  returnVal;
  }

  public String sqrt(String value){
      try{
          float val  = convert(value);
          return String.valueOf(Math.sqrt(val));
      }catch (NumberFormatException ex){
          return "Invalid Value";
      }
  }

  private  float convert(String value) throws NumberFormatException{
      Float aFloat = Float.valueOf(value);
      return aFloat;
  }


}

class Test{
    public static void main(String[] args) {
        Cal ca = new Cal();
        String value = ca.calculate("20","0","/");
        System.out.println(value);

        String val2 = ca.sqrt("10");
        System.out.println(val2);

    }
}


