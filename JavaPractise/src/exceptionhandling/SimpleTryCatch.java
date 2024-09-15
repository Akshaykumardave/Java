package exceptionhandling;

public class SimpleTryCatch {
    public static void main(String[] args) {
        try{
            String val = null;
            System.out.println("String uppercase is: " + val.toUpperCase());
            int divideByZero = 5 / 0;
            System.out.println("Result is: " + divideByZero);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception details: " +e.getMessage());
        } catch (Exception e) {
            System.out.println("Other exception details: " +e.getMessage());
        }
    }

}
