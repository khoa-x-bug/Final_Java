import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Khoand - B19DCVT208
 */
public class Main {

    public static int[] getResult(int[] arr, int target) {
        //Khởi tạo HashMap trống <Key, Value>
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int element = target - arr[i];
            //if isset in HashMap, return new array
            if (indexMap.containsKey(element)) {
                return new int[]{indexMap.get(element), i};
            }
            //put Value and Key to HashMap
            indexMap.put(arr[i], i);
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();

        while (testCase -- > 0) {
            int countElement = sc.nextInt();
            int[] inputs = new int[countElement];
            for (int i = 0; i < countElement; i++) {
                inputs[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            int[] answer = getResult(inputs, target);

            if (answer != null) {
                System.out.println(answer[0] + " " + answer[1]);
            } else {
                System.out.println("Not found");
            }
        }
    }
}