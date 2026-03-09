class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        int min=Integer.MAX_VALUE,k=0;
        String res="";
        for(int i=0;i<strs.length;i++){
            if(strs[i].length() < min){
                min=strs[i].length();
            }
        }
        for(int i=0;i<min;i++){
            k=0;
            for(int j=1;j<strs.length;j++){
                if(strs[j-1].charAt(i) == strs[j].charAt(i)){
                    k++;
                    if(k==strs.length-1){
                        res+=strs[j].charAt(i);
                    }
                }
            }
            if(!(k==strs.length-1)){
                break;
            }
        }
        return res;
    }
}