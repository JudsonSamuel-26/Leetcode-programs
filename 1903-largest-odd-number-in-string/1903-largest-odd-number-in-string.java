class Solution {
    public String largestOddNumber(String num) {
        String r="";
        for(int i=num.length()-1;i>=0;i--){
            int x=num.charAt(i);
            if(x%2==1){
                r=num.substring(0,i+1);
                break;

            }
        }
        return r;
        
    }
}