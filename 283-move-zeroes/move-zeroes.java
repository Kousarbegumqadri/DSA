class Solution {
     public void swap(int arr[],int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    public void moveZeroes(int[] nums) {
        // int n=nums.length;
        // int j=0;
        // int temp[]=new int[n];
        // for(int i=0;i<n;i++){
        //     if(nums[i]!=0){
        //     temp[j]=nums[i];
        //     j++;
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     nums[i]=temp[i];
        // }
        int n=nums.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        

    }
}