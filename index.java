import java.util.*;
class CPU
{
    float price;
    class Processor
    {
        int no_of_cores;
        String manufacturer;
    }
    static class RAM
    {
        float memory;
        String manufacturer;
    }
}
public class index
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        CPU obj = new CPU();
        CPU.Processor p =obj.new Processor();
        CPU.RAM r= new CPU.RAM();
        System.out.println("Enter the price,no of ocres,manufacturer name, memory and ram manufacture name");
        obj.price=s.nextFloat();
        p.no_of_cores=s.nextInt();
        p.manufacturer=s.next();
        r.memory=s.nextFloat();
        r.manufacturer=s.next();
        System.out.println("Product details");
        System.out.println(obj.price);
        System.out.println(p.no_of_cores);
        System.out.println(p.manufacturer);
        System.out.println(r.memory);
        System.out.println(r.manufacturer);
       
    }
}