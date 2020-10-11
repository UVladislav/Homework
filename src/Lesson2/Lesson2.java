package Lesson2;

public class Lesson2 {
    public static void invMass() {
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

    }
    
}
