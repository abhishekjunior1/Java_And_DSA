import java.util.Scanner;

public class pair 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int[] arr = new int[n];
        
        System.out.println("Please enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = arr[i] + arr[j];
                if (sum == 7) {
                    count++;
                }
            // }
        }
        
        System.out.println("Count of pairs with sum 7: " + count);
        sc.close();
    }
    }
}

