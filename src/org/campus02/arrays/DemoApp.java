package org.campus02.arrays;

import java.util.Arrays;

public class DemoApp {
    public static void main(String[] args) {
        int[][] arr = {{0, 1 ,9 }, {1, 0, 2}};
        System.out.println("Arrays.toString(getFlatArray(arr)) = "
                + Arrays.toString(NumberHelper.getFlatArray(arr)));
    }
}
