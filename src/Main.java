import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nacitaj dlzku hesla: ");
        int dlzkaHesla = sc.nextInt();
        boolean isValid = false;

        String[] pole = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "*", "/", "+", "%", "&", "@", "-", ":", "!", "#", "$", "="};

        String[] shuffledArray = new String[pole.length];
        String[] heslo = new String[dlzkaHesla];

        Random rand = new Random();

        for (int x = 0; x < dlzkaHesla ; x++) {
            List<String> strList = Arrays.asList(pole);
            Collections.shuffle(strList);
            shuffledArray = strList.toArray(new String[strList.size()]);
/*
            for (String y: shuffledArray) {
                System.out.print(y);
            }
            System.out.println("");*/

            int randomIndex = rand.nextInt(0, pole.length);
        //    System.out.println(randomIndex);
            heslo[x] = shuffledArray[randomIndex];
        }

        System.out.println("Heslo: ");
        for (String x: heslo) {
            System.out.print(x);
        }


        /*

        toto je second branch test
         */

        /*

        toto je  third branch test
         */


    }
}
