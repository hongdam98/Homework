import java.util.Scanner;

public class Week3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n * 2 - 1];

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        int prevIndex = 0;
        int lastIndex = n;
        while (n > 1) {
            prevIndex++;
            arr[lastIndex] = arr[prevIndex];
            lastIndex++;
            prevIndex++;
            n--;
        }

        System.out.println(arr[prevIndex]);
    }
}

