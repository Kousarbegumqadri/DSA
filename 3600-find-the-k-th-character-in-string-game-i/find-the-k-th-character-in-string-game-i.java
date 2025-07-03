class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        while(sb.length()<k){
            int n=sb.length();
            for(int i=0;i<n;i++){
                 char ch=sb.charAt(i)=='z'?'a':(char)(sb.charAt(i)+1);
                sb.append(ch);
                
            }
        }
        return sb.charAt(k-1);
    }
}