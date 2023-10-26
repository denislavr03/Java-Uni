import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;
//zadacha 7
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum=0,sumO=0,sumE=0,max=arr[0],min=999,temp;
        boolean isPrime=false;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + (i) + ": ");
            arr[i] = sc.nextInt();
            int index = 0;
            int del = 2;
            while(index <= arr[i]/2) {
                if (arr[i] % del == 0) {
                    System.out.println(arr[i] + " is not a prime number.");
                    del++;
                    index++;
                    break;
                } else {
                    System.out.println(arr[i] + " is a prime number.");
                    del++;
                    index++;
                    break;
                }
            }
        }
        for (int j : arr) {
            sum += j;

            if (j % 2 == 0) sumE += j;
            else sumO += j;

            if (max < j) max = j;
            if (j < min) min = j;
        }
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        System.out.println("Sum: "+sum);
        System.out.println("Even Sum: "+sumE);
        System.out.println("Odd Sum: "+sumO);
        System.out.println(Arrays.toString(arr));
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}*/

//zadacha 6
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/

//zadacha 5
public class Main {
    public  static void main(String[] args) {
        int[][] arr = new int[3][3];
        int sumWo5 = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j || i+j == 2) {
                    sumWo5 += arr[i][j];
                }
            }
        }
        int sum = sumWo5 + arr[1][1];
        System.out.println("Sum: " + sum);
        System.out.print("Sum Without: " + sumWo5);
    }
}