package Lesson1;

public class Lesson1 {
    //2.	Создать переменные всех пройденных типов данных и инициализировать их значения.
    public static void allVars() {
        byte а = 1;
        short b = 200;
        int c = 400;
        long d = 250L;
        float e = 3.14f;
        double f = -6.28;
        char g = '*';
        boolean some = true;
    }

    //3.	Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – аргументы этого метода, имеющие тип float.

    public static float calc(float a1, float b1, float c1, float d1) {
        //float a1, b1, c1, d1;

        //float res;
        float res = a1 * (b1 + (c1 / d1));
        System.out.println("res=" + res);
        return res;

        /* public static void calc(String args[]) {
            float a1, b1, c1, d1;
            a1=10.1f;
            b1=10.2f;
            c1=10.3f;
            d1=10.4f;
            float res;
            res = a1 * (b1 + (c1 / d1));
            System.out.println("res="+res);
            //return res; */

    }

    //4.	Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
    public static boolean range(int a2, int b2) {
        //a2 = 13;
        //b2 = 4;
        int sum = a2 + b2;
        if (sum >= 10 && sum <= 20) {
            System.out.println("summary in range");
            return true;
        } else {
            System.out.println("summary out of range");
            return false;
        }
    }

    //5.	Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void posOrNeg(int k) {
        //k = 7;
        if (k >=0) {
            System.out.println("This is positive");
        } else {
            System.out.println("This is negative");
        }
    }

    //6.	Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean antipositive(int l) {
        //l= -6;
        if (l >= 0) {
            return false;
        } else {
            return true;
        }
    }

    //7.	Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void yourName(String name) {
        //name = "Влад";
        System.out.println("Привет, " + name);
    }
}

