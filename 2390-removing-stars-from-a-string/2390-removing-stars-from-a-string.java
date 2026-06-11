class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='*'){
                st.pop();
            }
        }
        String s1="";
        while(!st.isEmpty()){
            s1+=st.pop();
        }
        return new StringBuilder(s1).reverse().toString(); 
    }
}