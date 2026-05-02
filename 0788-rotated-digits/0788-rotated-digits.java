class Solution {
    public int rotatedDigits(int n) {
        if(n<=1){
            return 0;
        }
        int count=0;
        String s;
        for(int i=2;i<=n;i++){
            s=String.valueOf(i);
            if(s.contains("3") || s.contains("4") || s.contains("7")){
                continue;
            }
            else if(s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9")){
                count++;
            }
            else{
                int len=0;
                for(int j=0;j<s.length();j++){
                    char c=s.charAt(j);
                    if(c=='0' || c=='1' || c=='8'){
                        len++;
                    }
                }
                if(len == s.length()){
                    continue;
                }else{
                    count++;
                }
            }
        }
        return count;
    }
}