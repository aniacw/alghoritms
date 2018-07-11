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

    public static void main(String[] args) {
        drawFilledRectangle(4, 5);
        drawTriangle(5);
    }
}
//    Stwórz klasê ConsoleDrawer i dodaj w niej metody:
//
//void drawTriangle(int height)
//        gdzie height to wysokoœæ trójk¹ta
//
//        Przyk³ad: height: 4
//
//           #
//          ###
//         #####
//        #######

//        void drawRectangle(int x, int y)
//        gdzie x, y to rozmiary prostok¹ta
//
//        Przyk³ad: x:4, y:3
//
//        ####
//        #  #
//        ####
//
//        void drawFilledRectangle(int x, int y)
//        gdzie x, y to rozmiary prostok¹ta
//
//        Przyk³ad: x:6, y:3
//
//        ######
//        ######
//        ######
//
//
//
//        void drawChristmassTree(int n)
//        gdzie n to iloœæ "trójk¹tów" w drzewie, coraz ni¿sze trójk¹ty s¹ szersze o 2 pola,
//        ka¿dy ma 3 poziomy: najwy¿szy trójk¹t: 1,3,5 elementów w rzêdzie, kolejny: 3,5,7, kolejny: 5,7,9 itd...
//
//        Przyk³ad: n: 3
//
//        #
//        ###
//        #####
//        ###
//        #####
//        #######
//        #####
//        #######
//        #########
//
//        void drawX(int size)
//        gdzie size to wysokoœæ i szerokoœæ
//
//        Przyk³ad: size: 5
//
//        #   #
//         # #
//          #
//         # #
//        #   #
