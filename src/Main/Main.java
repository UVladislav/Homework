package Main;

import Lesson1.Lesson1;
import Lesson2.Lesson2;

public class Main {
    public static void main(String[] args) {
        // System.out.println("hello world");
       /* Lesson1.calc(10.1f, 10.2f,10.3f,10.4f);
        Lesson1.range(13,4);
        Lesson1.posOrNeg(7);
        Lesson1.antipositive(-6);
        Lesson1.yourName("Влад");
        System.out.println(); */

        System.out.println("Lesson 2 Homeworks:");

        Lesson2.invMass();
        System.out.println();
        int[] array8 = new int[8];
        Lesson2.arr8(array8);
        int[] arr6_2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Lesson2.less6(arr6_2);
        int[][] massDiag = new int[8][8];
        Lesson2.diagOne(massDiag);
        Lesson2.minMax(arr6_2);
        int[] arr7 = new int[12];
        System.out.println(Lesson2.checkBalance(arr7));
        Lesson2.shiftingN(arr7);
    }
}
