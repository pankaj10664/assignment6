class LargestSubArray2 
{
    int min(int x, int y) 
    {
        return (x < y) ? x : y;
    }
 
    int max(int x, int y) 
    {
        return (x > y) ? x : y;
    }
 
    int findLength(int a[], int n) 
    {
        int max_len = 1; 
        for (int i = 0; i < n - 1; i++) 
        {
            int mn = a[i], mx = a[i];
 
           
            for (int j = i + 1; j < n; j++) 
            {
                mn = min(mn, a[j]);
                mx = max(mx, a[j]);
 
                if ((mx - mn) == j - i)
                    max_len = max(max_len, mx - mn + 1);
            }
        }
        return max_len;
	}
    }
	class Don
	{
 
    public static void main(String[] args) 
    {
        LargestSubArray2 large = new LargestSubArray2();
        int a[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        int n = a.length;
        System.out.println("Length of the longest contiguous subarray is "+ large.findLength(a, n));
    }
}