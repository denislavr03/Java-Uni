import javax.annotation.processing.SupportedSourceVersion;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//zadacha 1
/*public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print ("Enter Element "+(i+1)+": ");
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}*/

//zadacha 2 i 3
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int sumO = 0;
        int sumE = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element "+(i+1)+": ");
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
                if(arr[i]%2==0){
                    sumE += arr[i];
                }
                else sumO += arr[i];
            }
        }
        System.out.println("Even sum: "+sumE);
        System.out.println("Odd sum: "+sumO);
    }
}*/


//zadacha 4
/*public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int temp = 0;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}*/

//zadacha 5
/*public class Main{
    public static void main(String[] args) {
        int[] arr = {1,2,7,4,5};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}*/

//zadacha 6
/*public class Main {
    public static void main(String[] args) {
        int[][] arr = {{6,2},{7,34}};
        int sum = (arr[0][0]+arr[1][1])+(arr[0][1]+arr[1][0]);
        System.out.println(sum);
    }
}*/

//zadacha 7 i 8
/*public class Main {
    public static void main(String[] args) {
        int[][] arr = {{7,2},{3,4}};
        int sumFirst = arr[0][0]+arr[0][1];
        int sumSecond = arr[1][0]+arr[1][1];
        System.out.println(sumFirst);
        System.out.println(sumSecond);
    }
}*/

//zadacha 9
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter n: ");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        }
        else System.out.println("Odd");
    }
}*/

//zadacha 10
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter n: ");
        n = sc.nextInt();
        if(n<0){
            System.out.println("Negative");
        }
        else System.out.println("Positive");
    }
}*/

//zadacha 11 i 13
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        if(n>10) System.out.println("Bigger than 10");
        else System.out.println("Smaller or equal to 10");
        int i = 2;
        int index = 0;
        while (index <= n / 2) {
            if (n % i == 0 || n == 1) {
                System.out.println("Number is not prime");
            } else System.out.println("Number is prime");{
            i++;
            index++;
            break;}
        }
    }
}*/

//zadacha 12
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0,m=0;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.print("Enter m: ");
        m = sc.nextInt();

        if (n == m) System.out.println("Equal");
        else System.out.println("Not equal");
    }
}*/

//zadacha 14
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

//zadacha 15
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/



