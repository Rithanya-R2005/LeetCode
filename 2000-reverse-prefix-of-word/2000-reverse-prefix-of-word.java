class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st=new Stack<>();
        int flag=0,i=0,n=word.length();
        for(i=0;i<n;i++){
            if(word.charAt(i)!=ch){
                st.push(word.charAt(i));
            }
            else if(word.charAt(i)==ch){
                st.push(word.charAt(i));
                flag=1;
                break;
            }
        }
        String res="";
        while(!st.isEmpty()){
            res+=st.pop();
        }
        for(int j=i+1;j<n;j++){
            res+=word.charAt(j);
        }
        return (flag==1) ? res : word;
    }
}