class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String[]> res=new ArrayList<>();
        int n=code.length;
        int count=0;
        for(int i=0;i<n;i++){
            String s=businessLine[i];
            if(isActive[i]==true && (s.equals("electronics") || s.equals("grocery") || s.equals("pharmacy") || s.equals("restaurant"))){
                String t=code[i];
                if(t.length() <= 0){
                    continue;
                }
                else{
                    count=0;
                    for(int j=0;j<t.length();j++){
                        int a=(int)t.charAt(j);
                        if((a>=65 && a<=90) || (a>=97 && a<=122) || (a>=48 && a<=57) || (t.charAt(j)=='_')){
                            count++;
                        }
                        else{
                            break;
                        }
                    }
                    if(count==t.length()){
                        res.add(new String[]{t,s});
                    }
                }
            }
        }
        Map<String,Integer> priority=new HashMap<>();
        priority.put("electronics",0);
        priority.put("grocery",1);
        priority.put("pharmacy",2);
        priority.put("restaurant",3);

        Collections.sort(res, (a,b) -> {
            int p1=priority.get(a[1]);
            int p2=priority.get(b[1]);
            if(p1!=p2){
                return p1-p2;  //It will return to the Collections.sort.This concept is same as of compareTo() method.
            }
            return a[0].compareTo(b[0]);
        });
        List<String> result=new ArrayList<>();
        for(String[] pair: res){
            result.add(pair[0]);
        }
        return result;
    }
}