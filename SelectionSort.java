import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] number = new int[k];
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            int min = number[i];
            int min_i = i;
            for (int j = i + 1; j < number.length; j++) {
                if (number[j] < min) {
                    min = number[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = number[i];
                number[i] = number[min_i];
                number[min_i] = tmp;
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}