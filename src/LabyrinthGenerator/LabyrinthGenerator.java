package LabyrinthGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LabyrinthGenerator {

    private Random random = new Random(System.currentTimeMillis());

    private List<String> directions = new ArrayList<>();

    private void dig(boolean[][] labyrinth, int x, int y){
        //losujemy kierunek (sposrod mozliwych kierunkow)
        //kopiemy w tym kierunku (czyli odznaczamy 2 boole w tablicy w tym kierunku)
        //wykonujemy dig na aktualnym labiryncie z pocz wsp takimi jak wybralismy
        //calosc powtarzamy az w aktualnej komnacie nie mozemy przekopac sie juz w zadnym keirunku
    }

    public boolean[][] generate(int sx, int sy){
        boolean[][] labyrinth = new boolean[sx*2 + 1][sy*2 + 1];
        dig(labyrinth, random.nextInt(sx)*2 + 1, random.nextInt(sy)*2 + 1);
        return  labyrinth;
    }

    public static void main(String[] args){
        int[][] a = new int[4][6];
        a[3][2] = 9;
    }
}
