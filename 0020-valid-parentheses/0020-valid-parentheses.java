class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans=new Stack<>();
        char a,b;
	    for(int i=0;i<s.length();i++){
	        a=s.charAt(i);
            b=' ';
            if(!ans.isEmpty()){
                b=ans.peek();
            }
	        if(a=='{' || a=='[' || a=='('){
	            ans.push(a);
	        }
	        else if((a=='}' && b=='{') || (a==']' && b=='[') || (a==')' && b=='(')){
                if(!ans.isEmpty()){
                    ans.pop();
                }
            }
            else{
                ans.push(a);
            }
	    }
        if(ans.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}