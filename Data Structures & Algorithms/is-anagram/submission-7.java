class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> lm= new HashMap();
        HashMap<Character, Integer> kl= new HashMap();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(lm.containsKey(ch)){
                lm.computeIfPresent(ch, (key, oldValue) -> oldValue + 1);
            }
            else{
            lm.put(ch, 1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(kl.containsKey(ch)){
                kl.computeIfPresent(ch, (key, oldValue) -> oldValue + 1);
            }
            else{
            kl.put(ch, 1);
            }
        }
        for (Character key: lm.keySet()){
            if(!kl.containsKey(key))
                return false;

            else if(!kl.get(key).equals(lm.get(key)))  
                return false;
        }
        if(lm.size()!=kl.size()){
            return false;
        }
        else{
            return true;
        }
        
    }
}
