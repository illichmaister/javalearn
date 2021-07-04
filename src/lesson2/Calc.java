package lesson2;

public class Calc {
    public Integer sum(int var1, String var2) {
        try {
            int result = var1 + Integer.parseInt(var2);
            return result;
        } catch (NumberFormatException e) {
            System.out.println(" Error: " + e);
            return 88888;
        } catch (Exception e) {
            System.out.println(" Error: " + e);
            return 99999;
        }
    }

    public Double sum(double var1, String var2) throws NumberFormatException {
        Double result = var1 + Double.parseDouble(var2);
        System.out.println(result);
        return result;
    }
}
