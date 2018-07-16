package Alg7;

public class Exe {

    static void drawFilledRectangle(int x, int y) {

        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void drawTriangle(int height) {

        int stars = 1;
        for (int i = 0; i < height; i++) {

            for (int j = height - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            stars += 2;
            System.out.println();
        }
    }

    static void drawRectangle(int x, int y) {

        for (int i = 1; i <= y; ) {
            for (int j = 1; j <= x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 2; i < y; i++) {
            System.out.print('*');
            for (int j = 2; j < x; j++) {
                System.out.print(' ');
            }
            System.out.print('*');
            System.out.println();
        }

        for (int i = y; ; ) {
            for (int j = x; ; )
                System.out.print('*');
        }
    }

    static void drawChristmasTree(int repeat) {
        int stars = 1;
        int height = 3;
        int topLine = 1;

        for (int i = 0; i < repeat; i++) {

            for (int j = height - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = topLine; j <= stars; j++) {
                System.out.print('*');
            }

            stars += 2;
            topLine += 2;
        }
    }

    static void drawX(int size) {
        int space = size - 2;

        while (size > 1) {
            for (int i = size; i > 0; i--) {
                System.out.print('*');
                for (int k = 1; k <= space; k++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                size -= 2;
                System.out.println();
            }
        }

        while (size == 1) {
            for (int i = size; i > 0; i++ ) {
                System.out.print('*');
                System.out.println();
                System.out.print('*');
                for (int k = 1; k <= space; k++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                size += 2;
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        drawFilledRectangle(4, 5);
        drawTriangle(5);
        drawRectangle(5, 6);
        drawChristmasTree(3);
    }
}
//    Stwórz klasê ConsoleDrawer i dodaj w niej metody:
//   void drawX(int size)
//        gdzie size to wysokoœæ i szerokoœæ
//
//        Przyk³ad: size: 5
//
//        #   #
//         # #
//          #
//         # #
//        #   #


//
//        void drawChristmassTree(int n)
//        gdzie n to iloœæ "trójk¹tów" w drzewie, coraz ni¿sze trójk¹ty s¹ szersze o 2 pola,
//        ka¿dy ma 3 poziomy: najwy¿szy trójk¹t: 1,3,5 elementów w rzêdzie, kolejny: 3,5,7, kolejny: 5,7,9 itd...
//
//        Przyk³ad: n: 3
//
//            #
//           ###
//          #####
//           ###
//          #####
//         #######
//          #####
//         #######
//        #########
//
//