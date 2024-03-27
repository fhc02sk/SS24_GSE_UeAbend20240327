package org.campus02.arrays;

import java.util.Arrays;

public class NumberHelper {
    
    public static int[] getFlatArray(int[][] numbers) {
        /*
        
         0 - 1 - 9
         6 - 3 - 2
         
         => 0 - 1 - 9 - 6 - 3 - 2     
         */
        
        int[] result = new int[numbers.length * numbers[0].length];
        for (int i = 0; i < result.length; i++)
            result[i] = -1;

        int index = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int newNumber = numbers[i][j];

                boolean found = false;
                for (int x = 0; x < index; x++) {
                    if (result[x] == newNumber) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    result[index] = newNumber;
                    index++;
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 1 ,9 }, {1, 0, 2}};
        System.out.println("Arrays.toString(getFlatArray(arr)) = "
                + Arrays.toString(getFlatArray(arr)));
    }
}
