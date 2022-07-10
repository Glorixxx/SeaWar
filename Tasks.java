 package oldFiles;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        int a, c;
        double b;
        double D;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите коэфициент a");
        a = scanner.nextInt();
        System.out.println(" Введите коэфициент b");
        b = scanner.nextInt();
        System.out.println(" Введите коэфициент c");
        c = scanner.nextInt();
        D = (b * b) - (4 * a * c);
        System.out.println(D);
        double x1, x2;
        if (D < 0) {
            System.out.println(" Уравнение корней не имеет");
        } else if (D == 0) {
            x1 = (-b)/(2 * a);
            System.out.println(x1);
        } else if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
