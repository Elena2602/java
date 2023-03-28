import java.util.Scanner;
//Вывести все простые числа от 1 до 1000
public class dx2 {
      public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите простое число: ");

        int num = sc.nextInt();
        int n = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                //System.out.printf("%d,", i);
                n = 1;
                break;
            }
        }
        if (n == 0) {
            System.out.println("Простое");
        }else{
            System.out.println("Сложное");
        }

    }
}
