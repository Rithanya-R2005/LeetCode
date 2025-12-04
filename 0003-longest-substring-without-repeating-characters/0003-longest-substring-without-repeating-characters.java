class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,max=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                l=Math.max(l,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-l+1);
            System.out.println(s.substring(l,i+1));
        }
        return max;
    }
}