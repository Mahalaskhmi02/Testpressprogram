public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {54, 546, 548, 60};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }        
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
