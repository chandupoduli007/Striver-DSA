class Solution {
    public int LCM(int n1, int n2) {
        int start = Math.max(n1,n2);
        for(int i =start; ;i++){
            if(i%n1 ==0 && i%n2 ==0){
                return i;
            }
        }
    }
}