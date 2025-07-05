class Solution {
    public int findLucky(int[] arr) {
      int n=arr.length;
      //int freq=1;
      int maxLucky=-1;
      for(int i=0;i<n;i++){
        int freq=0;
       for(int j=0;j<n;j++){
        if(arr[i]==arr[j]){
            freq++;
        }
       } 
       if(arr[i]==freq){
        maxLucky=Math.max(maxLucky,arr[i]);
       } 
    }
    return maxLucky;
}
}