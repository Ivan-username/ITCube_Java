package IT_Cube;

import java.io.IOException;
import java.util.*;

public class Tester {
    static Random random = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        ex_1();
//        ex_2();
//        ex_3();
//        ex_4();
//        ex_5();
//        ex_6();
//        ex_7();
//        ex_8();
    }

    static void ex_1() {
    }

    static void ex_2() {
        final int a = 5;
        final int b = 34;
        final int output = a * b;
        System.out.printf("Плошадь: %d", output);
    }

    static void ex_3() {
        int a = random.ints(-10, 10).findFirst().getAsInt();
        if (a == 0) {
            System.out.print("число равно нулю");
        } else {
            if (a > 0) {
                if (a % 2 == 0) {
                    System.out.println("положительное четное число");
                } else {
                    System.out.println("положительное нечетное число");
                }
            } else {
                if (a % 2 == 0) {
                    System.out.println("положительное четное число");
                } else {
                    System.out.println("положительное нечетное число");
                }
            }
        }
    }

    static void ex_4() {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a == b || a == c || b == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static void ex_5() {
        int n = scan.nextInt();
        if (n % 100 == 0) {
            System.out.println(n / 100);
        } else {
            System.out.println(n / 100 + 1);
        }
    }

    static void ex_6() {
    }

    static void ex_7() {
        int a = 100;
        int b = 30;
        int c = 45;
        int n = a;
        a = b;
        b = c;
        c = n;
        System.out.printf("%d   %d   %d", a, b, c);
    }

    static void ex_8() {
        int number = scan.nextInt();
        int sum = 0;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        System.out.println(sum);
    }
}
