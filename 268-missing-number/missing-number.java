class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // for(int i=0;i<=n;i++){
        //     boolean found=false;
        //     for(int j=0;j<n;j++){
        //         if(nums[j]==i){
        //             found=true;
        //             break;
        //         }
        //     }
        //      if(!found) return i;
        // }
        int n=nums.length;
        HashSet<Integer> h=new HashSet<>(n+1);
        for(int num:nums){
         h.add(num);
        }
        for(int i=0;i<=n;i++){
            if(!h.contains(i)){
                return i;
            }
        }
        return -1;
    }
}