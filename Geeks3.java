package GeeksforGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class Geeks3 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(subarraySum(nums,5,8)));
    }

// This algortihm takes more time complexity
//
//
//
//    public static int[] subarraySum(int[] arr, int n, int s) {
//        int sum= 0;
//
//        int start=0;
//        int end =0;
//
//
//        while(start<arr.length)
//        {
//            sum+=arr[end];
//            if(sum==s)
//            {
//                return new int[]{start,end};
//            }
//            else if (sum<s && end+1<arr.length) {
//                end++;
//            }
//            else if (sum>s) {
//                start++;
//                end=start;
//                sum=0;
//            }
//        }
//        return new int[]{};
//    }

    public static int[] subarraySum(int[] arr, int n, int s) {

        int start = 0;
        int end = 0;
        int sum = 0;
        while (end < arr.length) {
            sum += arr[end];
            while (sum > s && start < end) {
                sum -= arr[start];
                start++;

            }
            if (sum == s) {

                return new int[]{start+1,end+1};

            }
            end++;

        }


        return new int[]{-1};
    }

}
