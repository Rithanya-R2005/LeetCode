class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        int max=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                if(max < st.size()){
                    max=st.size();
                }
            }
            else if(s.charAt(i)==')'){
                st.pop();
            }
        }
        return max;
    }
}