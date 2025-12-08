class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0)
            return new ArrayList<>();
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result=new ArrayList<>();
        backtrack(0,digits,new StringBuilder(),map,result);
        return result;
    }
    private void backtrack(int index,String digits,StringBuilder path,String[] map,List<String> result){
        if(index==digits.length()){
            result.add(path.toString());
            return;
        }
        String letters=map[digits.charAt(index)-'0'];
        for(char ch : letters.toCharArray()){
            path.append(ch);  //choose
            backtrack(index+1,digits,path,map,result);
            path.deleteCharAt(path.length()-1); //undo choose
        }
    }
}