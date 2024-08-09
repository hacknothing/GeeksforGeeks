package GeeksforGeeks;

public class Geeks2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,5};
        System.out.println(missingNumber(5,nums));
    }

    static int missingNumber(int n, int arr[]) {

        // Your Code Here
        int sum = 0;
        for(int num:arr)
        {
            sum+=num;
        }
        int total = (n*(n+1))/2;

        return total - sum;
    }
}

