package Alg1;

//Napisz program "automat z napojami". Maszyna przechowuje informacje o tym
//        jakie monety ma w sobie. Monety mogą mieć nominały: 0.01, 0.02, 0.05, 0.10, 0.20, 0.50, 1.00, 2.00, 5.00.
//        Maszyna po wrzuceniu monety i wybraniu napoju o danej cenie wydaje resztę najmniejszą możliwą ilością monet.
//        Przykład:
//        moneta: 2.00
//        napój: 1.25
//        liczy ile reszty wydać: 0.75
//        sprawdza wszystkie monety od góry czy może je wydać:
//        5.00, 2.00, 1.00 - nie może
//        wydaje 0.50 - zostało 0.25
//        wydaje 0.20 - zostało 0.05
//        0.10 - nie może
//        wydaje 0.05 - koniec


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class VendingMachine {
    private static Integer[] possibleCoins = new Integer[]{1, 2, 5, 10, 20, 50, 100, 200, 500};
    private List<Integer> coins;

    public VendingMachine(int n) {
        this.coins = new ArrayList<>();
        Random random  = new Random();
        for (int i=0; i<n; ++i){
            coins.add(possibleCoins[random.nextInt(possibleCoins.length)]);
        }
    }

    public VendingMachine(List<Integer> coins) {
        this.coins = new ArrayList<>(coins);
    }

    private Integer removeCoin(Integer value){
        Iterator<Integer> i = coins.listIterator();
        while (i.hasNext()){
            Integer coin = i.next();
            if (coin.equals(value)){
                i.remove();
                return coin;
            }
        }
        return null;
    }

    public List<Integer> buy(Integer productValue, List<Integer> insertedCoins) throws Exception {
        Integer sum = 0;
        for (Integer i : insertedCoins)
            sum += i;
        if (sum < productValue)
            throw new Exception("Inserted coins value is too small");

        for (Integer i : insertedCoins)
            coins.add(i);

        if (sum.equals(productValue))
            return new ArrayList<>();
        else{
            List<Integer> changeCoins = new ArrayList<>();
            Integer change = sum - productValue;
            for (int i = 8; i >= 0; --i){
                Integer currentCoinValue = possibleCoins[i];
                while (currentCoinValue <= change) {
                    Integer removedCoin = removeCoin(currentCoinValue);
                    if (removedCoin == null)
                        break;
                    else {
                        change -= currentCoinValue;
                        changeCoins.add(currentCoinValue);
                        if (change == 0)
                            return changeCoins;
                    }
                }
            }
            return changeCoins;
        }
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "coins=" + coins +
                '}';
    }
}
