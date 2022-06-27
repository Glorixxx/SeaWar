package oldFiles;

import java.util.Random;
import java.util.Scanner;

public class TheGameSeaWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j;
        System.out.println("Введите размерную сетку игры Морской бой");
        i = scanner.nextInt();
        j = scanner.nextInt();
        int[][] game = new int[i][j];
        enterArray(i, j, game);
        printArray(i, j, game);
        hits(game);
        // дома разобрать почему выводит 10, если с клавиатуры ввести 10 и 9
    }

    //функция заполнения массива
    public static void enterArray(int a, int b, int[][] game) {

        Random random = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                game[i][j] = random.nextInt(2);
            }
        }
    }

    //функция вывода массива на экран
    public static void printArray(int a, int b, int[][] game) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(game[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void hits(int[][] game) {
        int command;
        Scanner scanner = new Scanner(System.in);
        command = scanner.nextInt();
        while (true) {
            if (command == 1) {
                if (game[0][0] == 1) {
                    System.out.println("Ранил");
                    game[0][0] = 0;
                } else {
                    game[0][0] = 0;
                    System.out.println("Промах");
                }
            }
            if (command == 2) {
                if (game[0][1] == 1) {
                    System.out.println("Ранил");
                    game[0][1] = 0;
                } else {
                    game[0][1] = 0;
                    System.out.println("Промах");
                }
            }
            if (command == 3) {
                if (game[0][2] == 1) {
                    System.out.println("Ранил");
                    game[0][2] = 0;
                } else {
                    game[0][2] = 0;
                    System.out.println("Промах");
                }
            }
            if (command == 4) {
                if (game[1][0] == 1) {
                    System.out.println("Ранил");
                    game[1][0] = 0;
                } else {
                    game[1][0] = 0;
                    System.out.println("Промах");
                }
            }
            if (command == 5) {
                if (game[1][1] == 1) {
                    System.out.println("Ранил");
                    game[1][1] = 0;
                } else {
                    game[1][1] = 0;
                    System.out.println("Промах");
                }
            }
            if (command == 6) {
                if (game[1][2] == 1) {
                    System.out.println("Ранил");
                    game[1][2] = 0;
                } else {
                    game[1][2] = 0;
                    System.out.println("Промах");
                }
            }
            if (command == 7) {
                if (game[2][0] == 1) {
                    System.out.println("Ранил");
                    game[2][0] = 0;
                } else {
                    game[2][0] = 0;
                    System.out.println("Промах");
                }
            }
            if (command == 8) {
                if (game[2][1] == 1) {
                    System.out.println("Ранил");
                    game[2][1] = 0;
                } else {
                    game[2][1] = 0;
                    System.out.println("Промах");
                }
            }
            if (command == 9) {
                if (game[2][2] == 1) {
                    System.out.println("Ранил");
                    game[2][2] = 0;
                } else {
                    game[2][2] = 0;
                    System.out.println("Промах");
                }
            }
      break;}
    }
}