import java.util.ArrayList;
import java.util.List;

// 2. Вывести все простые числа от 1 до 1000

public class dz2 {
    public static void main(String[] args) {
        int num = 1000;
        boolean Num = true;
        List <Integer> primes = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    Num = false;
                }
            }
            if (Num) {
                primes.add(i);
            }
            else Num = true;
        }
        System.out.println("Простые числа от 1 до 1000:\n " + primes);
    }


}
