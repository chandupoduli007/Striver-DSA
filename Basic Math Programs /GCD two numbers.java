class Solution {
    public int GCD(int n1, int n2) {
        int n = Math.min(n1,n2);
        int highest = 0;
        for(int i=1;i<=n;i++){
            if(n1%i ==0 && n2%i==0){
                highest = i;
            }
        }
        return highest;
    }
}