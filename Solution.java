class Solution {
    public int missingNumber(int[] nums) {
        int[] n=nums;

        Arrays.sort(n);
        for(int i=0;i<n.length;i++){
            if(i!=n[i])
            return i;
        } 
        return n.length;    
    }
}
