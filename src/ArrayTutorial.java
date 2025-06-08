import java.util.*;
import java.util.stream.DoubleStream;

public class ArrayTutorial {

    public static void main(String args[]){
        int[] arr = new int[10];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
            System.out.println(arr[i]);
        }
//        Convert all elements of array to another datatype like double
        double[] doubleArray = Arrays.stream(arr).asDoubleStream().toArray();
        for(double i : doubleArray){
            System.out.println(i);
        }

//        To find the maximum in an array there are 2 ways, one is to traverse linearly and do it,
//        The other is to use streams
        int maxLinear = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) maxLinear = Math.max(maxLinear, arr[i]);
        int minLinear = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) minLinear = Math.min(minLinear, arr[i]);

        int maxStream = Arrays.stream(arr).max().getAsInt();
        int minStream = Arrays.stream(arr).min().getAsInt();

        System.out.println("Max using stream: " + maxStream);
        System.out.println("Min using stream: " + minStream);
        System.out.println("Max using Linear Search: " + maxLinear);
        System.out.println("Min using Linear Search: " + minLinear);

        double avgLinear = 0.0d;
        for(int i = 0; i < arr.length; i++) avgLinear += arr[i];
        System.out.println("Avg using Linear Search: " + avgLinear / arr.length);

        double avgStream = Arrays.stream(arr).average().getAsDouble();

        System.out.println("Avg using stream: " + avgStream);

        System.out.println("Let us try for-each loop in java");
        for(int i : arr){
            System.out.println(i);
            i *= 2;
            System.out.println(i);
            System.out.println("------------------------------");
        }
        System.out.println("---------\nOriginal Array:");
        for(int i : arr){
            System.out.println(i);
        }
    }
}