package org.example;

import java.util.Random;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        String[] texts = new String[100000];
        for (int i = 0; i < texts.length; i++) {
            texts[i] = generateText("abc", 3 + random.nextInt(3));
        }

        Count count = new Count();

        Thread thread1 = new Thread(null, () -> count.beautyLenght3(texts));
        Thread thread2 = new Thread(null, () -> count.beautyLenght4(texts));
        Thread thread3 = new Thread(null, () -> count.beautyLenght5(texts));

        thread1.start();
        thread2.start();
        thread3.start();

        thread3.join();
        thread2.join();
        thread1.join();

        System.out.println("Красивых слов с длиной 3: " + count.countThreeLenght.get()
                + "\nКрасивых слов с длиной 4: " + count.countFourLenght.get()
                + "\nКрасивых слов с длиной 5: " + count.countFiveLenght.get());
    }

    public static String generateText(String letters, int length) {
        Random random = new Random();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < length; i++) {
            text.append(letters.charAt(random.nextInt(letters.length())));
        }
        return text.toString();
    }
}