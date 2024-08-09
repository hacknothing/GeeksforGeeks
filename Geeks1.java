package GeeksforGeeks;

public class Geeks1 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(maximizeArray(nums));
    }

    static int maximizeArray(int[] nums)
    {
        int MOD = 1000000007;

        int j= 0;
        long sum = 0;

        for(int n:nums)
        {
            sum= (sum+(long)(n*j++))%MOD;
        }

        return (int) sum;
    }
}
