import java.util.*;

class prefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int prefixSum[] = new int[5];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        prefixSum[0] = arr[0];
        for (int i = 1; i < 5; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        System.out.println("Prefix Sum:");
        for (int i = 0; i < 5; i++) {
            System.out.print(prefixSum[i] + " ");
        }

        sc.close();
    }
}
