import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum = sum + arr[i];

        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
        int maxSumInDay =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxSumInDay) {
                maxSumInDay = arr[i];
            }
        }

        int minSumInDay = 202301203;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minSumInDay){

                minSumInDay=arr[i];
            }

        }
        System.out.println("Минимальная сумма трат за день составила "+minSumInDay+  " рублей. Максимальная сумма трат за день составила " +maxSumInDay+ " рублей");
        double midleSum = 0;
        midleSum = sum/arr.length;
        System.out.println("Средняя сумма трат за месяц составила "+midleSum+" рублей");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int n= reverseFullName.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = reverseFullName[n-i-1];
            reverseFullName[n-i-1] = reverseFullName[i];
            temp= reverseFullName[i];
        }
        System.out.println();
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);

        }

    }
}