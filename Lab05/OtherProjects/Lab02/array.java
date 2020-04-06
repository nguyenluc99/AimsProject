import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] intArr = { 1, 3, 7, 2, 5, 8, 6, 4, 9 };
        int i, j, temp, sum = 0;
        for (i = 0; i < intArr.length; i++) {
            sum += intArr[i];
            for (j = 0; j < i; j++) {
                if (intArr[j] < intArr[i]) {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        System.out.println("average of " + Arrays.toString(intArr) + " is " + sum / intArr.length);
        System.exit(0);
    }
}