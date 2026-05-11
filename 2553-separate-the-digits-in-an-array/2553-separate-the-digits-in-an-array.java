class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int num: nums){
            String s=String.valueOf(num);
            for(int i=0;i<s.length();i++){
                list.add(Integer.parseInt(String.valueOf(s.charAt(i))));
            }
        }
        int[] arr=new int[list.size()];
        int i=0;
        for(int num:list){
            arr[i++]=num;
        }
        return arr;
    }
}