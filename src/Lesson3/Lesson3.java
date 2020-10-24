package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
   /* 2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
   "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
   "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
    компьютер показывает буквы которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно, можно пользоваться:
    String str = "apple";
    str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово
    Используем только маленькие буквы */
   public static void guessWord(String[] words) {
       System.out.println("dz 3.2:");
       System.out.println("words: " + Arrays.toString(words));
       System.out.println("Кол-во слов: " + words.length);
       Random value = new Random();
       int index = value.nextInt(words.length - 1);
       Boolean isGuess = false;
       char[] wordField = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
       System.out.println("Я загадало слово: " + words[index]);

       Scanner input = new Scanner(System.in);
       for (char letter: wordField) {
           System.out.print(letter);
       }
       System.out.println();
       while (!isGuess) {
           String word = input.nextLine();
           System.out.println();
           isGuess = compareWords(word, words[index], wordField);
           for (char letter: wordField) {
               System.out.print(letter);
           }
           System.out.println();
           if (isGuess) {
               System.out.println();
               System.out.println("Congratulation, you win!!");
               break;
           } else {
               continue;
           }
       }

   }
    public static boolean compareWords(String word, String randomWord, char[] wordField) {
        Integer count = 0;
        for(Integer i = 0; i < word.length(); i++) {
            if (i == randomWord.length()) {
                break;
            }
            if (word.charAt(i) == randomWord.charAt(i)) {
                wordField[i] = word.charAt(i);
                count++;
            } else {
                wordField[i] = '#';
            }
        }
        return count == randomWord.length();
    }
}
