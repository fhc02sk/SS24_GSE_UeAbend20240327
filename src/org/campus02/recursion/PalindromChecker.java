package org.campus02.recursion;

import java.util.ArrayList;

public class PalindromChecker {

    public static boolean checkPalindrom(ArrayList<Character> chars) {
        /*
        a - b - c = false
        a - b - a = true
        a - a - a = true
        a - a = true
        a = true
        a - b - c - b - a
        */

        if (chars.size() <= 1)
            return true;

        if (chars.size() == 2
                && Character.toLowerCase(chars.get(0)) == Character.toLowerCase(chars.get(1)))
            return true;

        if (Character.toLowerCase(chars.get(0)) !=
                Character.toLowerCase(chars.get(chars.size() - 1)))
            return false;

        chars.remove(chars.size() - 1);
        chars.remove(0);

        return checkPalindrom(chars);
    }

    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add(' ');
        chars.add('c');
        chars.add('d');
        chars.add(' ');
        chars.add('a');

        System.out.println("checkPalindrom(chars) = " + checkPalindrom(chars));
    }
}
