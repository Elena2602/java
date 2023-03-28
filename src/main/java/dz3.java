import java.util.Scanner;
//Реализовать простой калькулятор (+ - / *)
//        Ввод числа ->
//        Ввод знака ->
//        Ввод числа ->
public class dz3 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Ввод числа: ");
        int num1 = in.nextInt();

        System.out.print("Ввод знака: ");
        String zn = in.next();

        System.out.print("Ввод числа: ");
        int num2 = in.nextInt();

        if (zn.equals("+")) {
            System.out.println(num1 + num2);
        }
        if (zn.equals("-")) {
            System.out.println(num1 - num2);
        }
        if (zn.equals("*")) {
            System.out.println(num1 * num2);
        }
        if (zn.equals("/")) {
            System.out.println(num1 / num2);
        }

        in.close();

        }
    }
