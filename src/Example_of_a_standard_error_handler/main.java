package Example_of_a_standard_error_handler;

class Main {
   public static void main(String[] args) {
     int a = 4;
     try {
       System.out.println(a/0);
     } catch (ArithmeticException e) {
       System.out.println("Произошла недопустимая арифметическая операция");
     }
   }
}