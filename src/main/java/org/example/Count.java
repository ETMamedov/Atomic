package org.example;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Count {
    AtomicInteger countThreeLenght = new AtomicInteger(0);
    AtomicInteger countFourLenght = new AtomicInteger(0);
    AtomicInteger countFiveLenght = new AtomicInteger(0);


    public void beautyLenght3(String[] texts) {
        for (int i = 0; i < texts.length; i++) {
            if (texts[i].length() == 3) {
                if (new StringBuilder(texts[i]).reverse().toString().equals(texts[i])) {
                    countThreeLenght.addAndGet(1);
                    continue;
                }
                char[] nickName = texts[i].toCharArray();
                Arrays.sort(nickName);
                String s = String.valueOf(nickName);
                if (s.equals(texts[i])) {
                    countThreeLenght.addAndGet(1);
                    continue;
                }

                int tempCount = 0;
                for (int j = 0; j < texts[i].length() - 1; j++) {
                    if (texts[i].charAt(j) == texts[i].charAt(j + 1)) {
                        tempCount++;
                    }
                    if (tempCount == 2) {
                        countThreeLenght.addAndGet(1);
                    }
                }
            }
        }
    }

    public void beautyLenght4(String[] texts) {
        for (int i = 0; i < texts.length; i++) {
            if (texts[i].length() == 4) {
                if (new StringBuilder(texts[i]).reverse().toString().equals(texts[i])) {
                    countFourLenght.addAndGet(1);
                    continue;
                }
                char[] nickName = texts[i].toCharArray();
                Arrays.sort(nickName);
                String s = String.valueOf(nickName);
                if (s.equals(texts[i])) {
                    countFourLenght.addAndGet(1);
                    continue;
                }

                int tempCount = 0;
                for (int j = 0; j < texts[i].length() - 1; j++) {
                    if (texts[i].charAt(j) == texts[i].charAt(j + 1)) {
                        tempCount++;
                    }
                    if (tempCount == 2) {
                        countFourLenght.addAndGet(1);
                    }
                }
            }
        }
    }


    public void beautyLenght5(String[] texts) {
        for (int i = 0; i < texts.length; i++) {
            if (texts[i].length() == 5) {
                if (new StringBuilder(texts[i]).reverse().toString().equals(texts[i])) {
                    countFiveLenght.addAndGet(1);
                    continue;
                }
                char[] nickName = texts[i].toCharArray();
                Arrays.sort(nickName);
                String s = String.valueOf(nickName);
                if (s.equals(texts[i])) {
                    countFiveLenght.addAndGet(1);
                    continue;
                }

                int tempCount = 0;
                for (int j = 0; j < texts[i].length() - 1; j++) {
                    if (texts[i].charAt(j) == texts[i].charAt(j + 1)) {
                        tempCount++;
                    }
                    if (tempCount == 2) {
                        countFiveLenght.addAndGet(1);
                    }
                }
            }
        }
    }
}
