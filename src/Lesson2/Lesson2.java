package Lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson2 {
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invMass() {
        System.out.println("dz 2.1:");
        int[] binaryArray = {1,0,1,0,1,1,1,1,0,0};
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i] + ", ");
        }
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 1) {
                binaryArray[i] = 0;
            } else {
                binaryArray[i] = 1;
            }
        }

        System.out.println();
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i] + ", ");
        }
        System.out.println();
    }

    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void arr8(int[] array8) {
        System.out.println("dz 2.2:");
        for (int i=0; i < array8.length; i++) {
            array8[i] = i*3;
         }
        System.out.println(Arrays.toString(array8));
        System.out.println();
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void less6(int[] arr6_2) {
        System.out.println("dz 2.3:");
        System.out.println("original: " + Arrays.toString(arr6_2));
        for (int i=0; i <arr6_2.length; i++) {
            if (arr6_2[i]<6) {
                arr6_2[i] *=2;
            }
        }
        System.out.println("new: " + Arrays.toString(arr6_2));
        System.out.println();
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и
    // столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
    // элементы единицами;
    public static void diagOne(int[][] massDiag) {
        System.out.println("dz 2.4:");
        for (int i=0; i<massDiag.length; i++) {
            for (int j=0; j<massDiag.length; j++) {
                massDiag[i][j]=i;
                System.out.print(massDiag[i][j] + "\t");
            }
            System.out.println();
        } //конец оригинала
        System.out.println();
        for (int i=0; i<massDiag.length; i++) {
            for (int j=0; j<massDiag.length; j++) {
                if (i==j) {
                    massDiag[i][j] = 1;
                } else if (j==(massDiag.length-1)-i) {
                    massDiag[i][j] = 1;
                } else {
                    massDiag[i][j]=99;
                }
                System.out.print(massDiag[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void minMax(int[] array) {
        System.out.println("dz 2.5:");
        //arr6_2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}
        int min  = array[0];
        int max  = array[0];
        for (int i=0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println();
        //результат массива взялся из конечного результата в задании 2.3 (задача с удвоением),
        // поэтому на экран у min вывелась не 1, а 2.
    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
    // части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.
    public static boolean checkBalance(int[] arr7) {
        System.out.println("dz 2.6:");
        Random num = new Random();
        int sum = 0;
        int leftSum = 0;
        for (int i = 0; i < arr7.length; i++) {
            arr7[i] = (num.nextInt(30) - 15);
            System.out.print(arr7[i] + "; ");
            sum += arr7[i];
        }
        System.out.println();
        System.out.println("sum = " + sum);
        for (int i=0; i < arr7.length; i++) {
            leftSum += arr7[i];
            sum = sum - arr7[i];
            if (sum==leftSum) {
                //System.out.println(i);
                return true;
            }
        }
        return false;
    }

    //7. **** Написать метод, которому на вход подается одномерный массив и
    // число n (может быть положительным, или отрицательным), при этом метод должен
    // сместить все элементы массива на n позиций. Для усложнения задачи нельзя
    // пользоваться вспомогательными массивами.
    public static void shiftingN (int[] shiftArr, int value) {
        System.out.println();
        System.out.println("dz 2.7:");
        System.out.println("original: " + Arrays.toString(shiftArr));
        /* Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0; i < shiftArr.length; i++) {
            shiftArr[i] = shiftArr[i+n];
            //System.out.println("new: " + Arrays.toString(shiftArr));
        }
        System.out.println("new: " + Arrays.toString(shiftArr)); */

        boolean flag;
        if (value < 0) {
            flag = true;
            value = -value;
        } else {
            flag = false;
        }
        int lastindex = shiftArr.length - 1;
        for (int i=0; i < value; i++) {
            int temp = 0;
//            if (flag) {
//                temp = shiftArr[lastindex];
//            }
            for (int j=0; j < lastindex; j++) {
                if (flag) {
                    shiftArr[j] = shiftArr[j+1];
                } else {
                    shiftArr[lastindex - j] = shiftArr[lastindex - j -1];
                }
            }
            if (flag) {
                shiftArr[lastindex] = temp;
            } else {
                shiftArr[0] = temp;
            }
        }
        System.out.println("new shifted: " + Arrays.toString(shiftArr));
    }
}
