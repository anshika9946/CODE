import java.util.HashMap;
import java.util.Map;

public class maxE {
    public static int maximizeEqualNumbers(int[] a, int k) {
        int maxCount = 0;
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : a) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : a) {
            int count = 0;

            for (int x = -k; x <= k; x++) {
                int transformedNum = num + x;
                count += frequencyMap.getOrDefault(transformedNum, 0);
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] a = {1,  5, 6};
        int k = 2;

        int maxLength = maximizeEqualNumbers(a, k);
        System.out.println(maxLength);
    }
}
