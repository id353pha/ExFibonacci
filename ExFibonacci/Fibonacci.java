package ExFibonacci;
import java.math.*;

public class Fibonacci {

    public static void main(String[] args) {
        BigInteger fib1 = new BigInteger("1");
        BigInteger fib0 = new BigInteger("1");
        BigInteger sum;
        int Counter= 2;
        while (true) {
            sum = fib0.add(fib1);
            fib0 = fib1;
            fib1 = sum;
            //Controllo se il numero ha 1000 cifre
            if (CountDigits(sum) == 1000) {
                System.out.println("il primo numero della sequenza con 1000 cifre e': " + ++Counter );
                break;
            }
            ++Counter;
        }
    }
    public static int CountDigits(BigInteger sum){
        String s = "" + sum;
        return s.length();
    }
}