import java.io.*;
import java.util.*;

class Arithmetic{
    public int add(int a,int b)
    {
        return a+b;
    }
}
class Adder extends Arithmetic{
    
}
public class JavaInheritence2 {

    public static void main(String[] args) {
        Adder ad=new Adder();
        System.out.println("My superclass is: Arithmetic");
        System.out.print(ad.add(41, 1)+" ");
        System.out.print(ad.add(12, 1)+" ");
        System.out.print(ad.add(19, 1)+" ");
    }
}
