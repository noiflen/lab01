package ru.university.lab1.strings;

public class Task04TextProcessing {
    public void run() {
        System.out.println("1. Палиндром: " + isPalindrome("А роза упала на лапу Азора"));
        System.out.println("2. Разворот слов: " + reverseWords("кот съел мышь"));
        countChars("Hello World 123!");
        String encrypted = caesarCipher("Hello", 3);
        System.out.println("4. Шифр Цезаря (сдвиг 3): " + encrypted);
        System.out.println("   Расшифровка: " + caesarDecipher(encrypted, 3));
        System.out.println("5. Самое длинное слово: " + longestWord("раз два тринадцать"));
    }

    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            char l = str.charAt(left), r = str.charAt(right);
            if (!Character.isLetterOrDigit(l)) { left++; continue; }
            if (!Character.isLetterOrDigit(r)) { right--; continue; }
            if (Character.toLowerCase(l) != Character.toLowerCase(r)) return false;
            left++; right--;
        }
        return true;
    }

    private String reverseWords(String str) {
        char[] chars = str.toCharArray();
        reverseRange(chars, 0, chars.length - 1);
        int start = 0;
        for (int i = 0; i <= chars.length; i++) {
            if (i == chars.length || chars[i] == ' ') {
                reverseRange(chars, start, i - 1);
                start = i + 1;
            }
        }
        return new String(chars);
    }

    private void reverseRange(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++; right--;
        }
    }

    private void countChars(String str) {
        int v = 0, c = 0, d = 0, s = 0;
        String vowels = "aeiouyаеёиоуыэюя";
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) >= 0) v++; else c++;
            } else if (Character.isDigit(ch)) {
                d++;
            } else if (ch == ' ') {
                s++;
            }
        }
        System.out.println("3. Гласных: " + v + ", согласных: " + c + ", цифр: " + d + ", пробелов: " + s);
    }

    private String caesarCipher(String str, int shift) {
        char[] res = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') res[i] = (char) ('a' + (c - 'a' + shift) % 26);
            else if (c >= 'A' && c <= 'Z') res[i] = (char) ('A' + (c - 'A' + shift) % 26);
            else res[i] = c;
        }
        return new String(res);
    }

    private String caesarDecipher(String str, int shift) {
        return caesarCipher(str, -shift);
    }

    private String longestWord(String str) {
        int maxLen = 0, maxStart = 0, curLen = 0, curStart = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (curLen == 0) curStart = i;
                curLen++;
            } else {
                if (curLen > maxLen) { maxLen = curLen; maxStart = curStart; }
                curLen = 0;
            }
        }
        if (curLen > maxLen) { maxLen = curLen; maxStart = curStart; }
        return str.substring(maxStart, maxStart + maxLen);
    }
}