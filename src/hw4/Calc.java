package hw4;

public class Calc {
    public Integer division(int var1, int var2){
        try{
            int result = var1 / var2;
            return result;
        } catch (Exception e){
            System.out.println("Error: " + e);
            return 777;
        }
    }
// https://stackoverflow.com/questions/14137989/java-division-by-zero-doesnt-throw-an-arithmeticexception-why
    //
    public Double division(double var1, double var2){
        try{
            double result = var1 / var2;
            return result;
        } catch (Exception e){
            System.out.println("Error: " + e);
            return 777.0;
        }
    }
}
