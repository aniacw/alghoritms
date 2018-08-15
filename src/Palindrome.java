public class Palindrome {

    public boolean isPalidrome(String word) {
        int length = word.length();
        int halfLength = 0;

        if (length % 2 == 1)
            halfLength = length / 2 + 1;
        else {
            halfLength = length / 2;
        }

        for (int i = 0; i < halfLength; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
           // length--;
        }
        return true;
    }


    public static void main(String[] args) {

        Palindrome p = new Palindrome();
        p.isPalidrome("cherry");
    }
}

//Napisz funckję, która sprawdza czy słowo jest palindromem.