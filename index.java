public class index
{
    public static void main(String a[]) {
       ScientificCalculator obj = new ScientificCalculator();
       int result1 = obj.add(4, 5);
       int result2 = obj.sub(10,7); 
       int result3 = obj.multiply(5, 7);
       int result4 = obj.divide(100, 10);
       double result5 = obj.power(6, 2);

       System.out.println(result1);
       System.out.println(result2);
       System.out.println(result3);
       System.out.println(result4);
       System.out.println(result5);
    }
}