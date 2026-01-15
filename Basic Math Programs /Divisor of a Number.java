class Solution {
    public int[] divisors(int n) {
        int arr[] = new int[n];
        int count=0;

        for(int i=1;i<=n;i++){
            if(n%i == 0){
                arr[count++]=i;
            }
        }
        int ans[]= Arrays.copyOf(arr,count);
        return ans;
    }
}