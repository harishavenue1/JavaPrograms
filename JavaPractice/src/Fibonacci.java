// tip: each public class is put in its own file
import java.util.stream.*;

public class Fibonacci
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        printFibonacci(Integer.valueOf(args[0]));
    }

    public static void printFibonacci(int tLen) {
        if (tLen<=2)
            IntStream.range(0,tLen).forEach(e->System.out.print(e +","));
        else {
            IntStream.range(0,2).forEach(e->System.out.print(e +","));
            int a=0, temp=0, b=1;
            for (int i=1; i<=tLen-2; i++) {
                temp = a;
                a = b;
                b = b + temp;
                System.out.print(b+",");
            }
        }
        
    }
}