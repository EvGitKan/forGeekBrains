//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static int SIZE;
    static int turnsCount;
    static int countTogether;
    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';
    static char[][] MAP;
    static final Scanner in;
    static final Random random;
    static final String SPACE_MAP = " ";
    public static final String HEADER_FIRST_SYMBOL = "♥";
    static int rowNumber;
    static int columnNumber;

    public TicTacToe() {
    }

    public static void turnGame() {
        do {
            System.out.println("\n\nИГРА НАЧИНАЕТСЯ!!!!");
            init();
            printMap();
            playGame();
        } while(isContinueGame());

        endGame();
    }

    private static void init() {
        initMap();
        turnsCountForWin();
    }

    private static void initMap() {
        System.out.print("Введите размер игрового поля формата size:size\n size = ");
        SIZE = in.nextInt();
        MAP = new char[SIZE][SIZE];
        for(int i = 0; i < SIZE; ++i) {
            for(int j = 0; j < SIZE; ++j) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void turnsCountForWin() {
        System.out.print("Введите количество фишек подряд для победы: ");
        countTogether = in.nextInt();
    }

    private static void printMap() {
        printMapHeader();
        printMapBody();
    }

    private static void printMapHeader() {
        System.out.print("♥ ");

        for(int i = 0; i < SIZE; ++i) {
            printMapNumber(i);
        }

        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.printf("%2d ", i + 1);
    }

    private static void printMapBody() {
        for(int i = 0; i < SIZE; ++i) {
            printMapNumber(i);

            for(int j = 0; j < SIZE; ++j) {
                System.out.printf(MAP[i][j] + "  ");
            }

            System.out.println();
        }

    }

    private static void playGame() {
        while(true) {
            humanTurn();
            printMap();
            if (!checkEnd('X')) {
                aiTurn();
                printMap();
                if (!checkEnd('O')) {
                    continue;
                }
            }

            return;
        }
    }

    private static void humanTurn() {
        System.out.println("ХОД ЧЕЛОВЕКА");

        while(true) {
            System.out.print("Введите координату строки: ");
            rowNumber = getValidNumberFromUser() - 1;
            System.out.print("Введите координату столбца: ");
            columnNumber = getValidNumberFromUser() - 1;
            if (isCellFree(rowNumber, columnNumber)) {
                MAP[rowNumber][columnNumber] = 'X';
                ++turnsCount;
                return;
            }

            System.out.printf("Ячейка с координатами %d:%d уже занята%n", rowNumber + 1, columnNumber + 1);
        }
    }

    private static int getValidNumberFromUser() {
        while(true) {
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n)) {
                    return n;
                }

                System.out.println("!!!Проверьте значение координаты. Должно быть от 1 до " + SIZE);
            } else {
                in.next();
                System.out.println("!!!Ввод допускает лишь целые числа");
            }
        }
    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= SIZE;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == 8226;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == 'X') {
                System.out.println("\nУРАААААААААААААААА! Вы победили!");
            } else {
                System.out.println("\nВосстание близко... ИИ победил...");
            }
            return true;
        } else if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkWin(char symbol) {
        return gorizontalWin(symbol) || verticalWin(symbol) || diagonalDeskWin(symbol) || diagonalAskWin(symbol);
    }

    private static boolean gorizontalWin(char symbol) {
        int count = 0;
        for (int i = 0; i < MAP[rowNumber].length; i++) {
            if (MAP[rowNumber][i] == symbol) {
                count++;
            } else count = 0;
            if (count >= countTogether) {
                break;
            }
        }
        return count >= countTogether;
    }

    private static boolean verticalWin(char symbol) {
        int count = 0;
        for (int i = 0; i < MAP.length; i++) {
            if (MAP[i][columnNumber] == symbol) {
                count++;
            } else count = 0;
            if (count >= countTogether) {
                break;
            }
        }
        return count >= countTogether;
    }

    private static boolean diagonalDeskWin(char symbol) {
        int count = 0;
        int temp = 0;
        int firstTurnRow, firstTurnColumn;
        do {
            firstTurnRow = rowNumber - temp;
            firstTurnColumn = columnNumber - temp;
            temp++;
        } while (firstTurnRow > 0 && firstTurnColumn > 0);

        for (int i = 0; i < MAP.length - firstTurnRow - firstTurnColumn; i++) {
            if (MAP[firstTurnRow + i][firstTurnColumn + i] == symbol) {
                count++;
            } else count = 0;
            if (count >= countTogether) {
                break;
            }
        }
        return count >= countTogether;
    }

    private static boolean diagonalAskWin(char symbol) {
        int count = 0;
        int temp = 0;
        int firstTurnRow, firstTurnColumn;
        do {
            firstTurnRow = rowNumber - temp;
            firstTurnColumn = columnNumber + temp;
            temp++;
        } while (firstTurnRow > 0 && firstTurnColumn < (MAP.length - 1));

        for (int i = 0; i < firstTurnColumn - firstTurnRow + 1; i++) {
            if (MAP[firstTurnRow + i][firstTurnColumn - i] == symbol) {
                count++;
            } else count = 0;
            if (count >= countTogether) {
                break;
            }
        }
        return count >= countTogether;
    }

    private static boolean checkDraw() {
        return turnsCount >= SIZE * SIZE;
    }

    private static void aiTurn() {
        System.out.println("ХОД КОМПЬЮТЕРА");

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while(!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = 'O';
        ++turnsCount;
    }

    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить? y\\n");
        return switch(in.next()) {
            case "y", "+", "да", "конечно" -> true;
            default -> false;
        };
    }



    private static void endGame() {
        in.close();
        System.out.println("Ты заходи, если что");
    }

    static {
        MAP = new char[SIZE][SIZE];
        in = new Scanner(System.in);
        random = new Random();
        turnsCount = 0;
    }
}
