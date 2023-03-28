import java.util.Scanner;


//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
  //      Ввод:5
    //    Треугольное число 1 + 2 + 3 + 4 + 5 = 15
      //  n! 1 * 2 * 3 * 4 * 5 = 120
public class dz1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int number = sc.nextInt();
        int number_s = 0;
        int number_f = 1;

        for (int i = 1; i <= number ; i++) {
            number_s = number_s + i;
            number_f = number_f * i;
                sc.close();

        }
        System.out.println(number_s);
        System.out.println(number_f);
    }
}