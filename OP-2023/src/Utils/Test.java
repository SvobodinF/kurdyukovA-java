package Utils;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int num = 121421;
        //System.out.println("result = " + majorityElement(new int[]{8,8,7,7,7}));
        //System.out.println("Is Polindrome - " + (num == reverse(num, 0)));
        //System.out.println(Arrays.toString(sortedSquares(new int[]{-5,-3,-2,-1})));
       // rotate(new int[]{1,2,3,4,5,6,7 }, 3);
    }

    public static int removeElement(int[] nums, int val) {
        int removeCount = 0;
        int[] n = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                removeCount++;
            }
            else{
                n[index] = nums[i];
                index++;
            }
        }

        return n.length - removeCount;
    }
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int key = nums[i];

            if (map.containsKey(key)){
                int value = map.get(key) + 1;
                map.replace(key, value);
                System.out.println(key + " " + value);
                continue;
            }

            map.put(key, 1);
        }

        System.out.println(Debug(map));

        System.out.println("Size = " + map.size());
        int max = 0;
        int key = -1;

        for(Map.Entry<Integer, Integer> item : map.entrySet()){
            if (item.getValue() > max) {
                max = item.getValue();
                key = item.getKey();
            }
        }

        return key;
    }

    private static String Debug(Map<Integer, Integer> map){
        String result = "\n------------------\n";

        for(Map.Entry<Integer, Integer> item : map.entrySet()){
            result += "Key: " + item.getKey() + "Value: " + item.getValue() + "\n";
        }

        result += "\n------------------\n";

        return result;
    }

    public static int reverse(int n, int rev)
    {
        if (n == 0) {
            return rev;
        }

        rev = rev * 10 + (n % 10);
        rev = reverse(n / 10, rev);
        return rev;
    }

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] == target) {
                result = mid;
                break;
            }
        }

        return result;
    }

    /*public static int[] sortedSquares(int[] nums) {
        //[-4,-1,0,3,10]
        //left = 0, right = 4 | 16 < 100 | [-4,-1,0,3,10] -> [-4, -1, 0, 3, 100] #0 Iteration
        //left = 0, right = 3 | 16 > 9 | [-4,-1,0,3,10] -> [3, -1, 0, 16, 100] #1 Iteration
        //left = 0, right = 2 | 9 > 0 | [-4,-1,0,3,10] -> [0, -1, 9, 16, 100] #2 Iteration
        //left = 0, right = 1 | 0 < 1 | [-4,-1,0,3,10] -> [0, 1, 9, 16, 100] #3 Iteration
        //left = 0, right = 0 | 0 < 1 | [-4,-1,0,3,10] -> [0, 1, 9, 16, 100] #3 Iteration
        String input = Arrays.toString(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int valueLeft = nums[left];
            int valueRight = nums[right];
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq < rightSq){
                nums[right] = rightSq;
                right--;
            }
            else if (leftSq > rightSq){
                nums[left] = nums[right];
                nums[right] = leftSq;
                right--;
            }


            System.out.println("left = " + left + ", right = " + right
                    + " | " + valueLeft + "(" +leftSq + ")" + (leftSq > rightSq ? " > " : " < ")
                    + valueRight +"(" + rightSq + ")" + " | " + input + " -> " + Arrays.toString(nums));
        }

        nums[0] *= nums[0];
        return nums;
    }*/

    public static int[] sortedSquares(int[] nums) {
        int left=0;
        int right = nums.length-1;
        int res[]= new int[nums.length];
        int k=nums.length-1;
        while(left<=right){
            int max;//=(Math.abs(nums[left])<Math.abs(nums[right])? nums[right]: nums[left]);
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                max = nums[left];
                left++;
            } else {
                max = nums[right];
                right--;
            }

            res[k] = max * max;
            k--;
        }
        return res;
    }

    public static void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            int point = i + k;
            int index = point - (nums.length * (point / nums.length));

            result[index] = nums[i];
        }

        nums = result;
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(nums));
        //return result;
        //nums = result;
    }
}
