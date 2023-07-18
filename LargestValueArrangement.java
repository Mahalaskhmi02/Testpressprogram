import java.util.Arrays;
import java.util.Comparator;

public class LargestValueArrangement {
    public static void main(String[] args) {
        int[] arr = {54, 546, 548, 60};
        String largestValue = arrangeLargestValue(arr);
        System.out.println(largestValue);
    }

    public static String arrangeLargestValue(int[] arr) {
        String[] strArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(strArr, new LargestValueComparator());
        StringBuilder largestValue = new StringBuilder();
        for (String str : strArr) {
            largestValue.append(str);
        }

        return largestValue.toString();
    }

    static class LargestValueComparator implements Comparator<String> {
        public int compare(String str1, String str2) {
            String s1 = str1 + str2;
            String s2 = str2 + str1;
            return s2.compareTo(s1); 
        }
    }
}
