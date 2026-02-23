class Solution {
    public boolean hasAllCodes(String s, int k) {
        int len = s.length();
        if(len < k) return false;
        Set<String> set = new HashSet<>();
        
        for(int i = 0;i <= len-k;i++){
            set.add(s.substring(i, i+k));
        }
        
        return set.size() == (int) Math.pow(2, k);
    }
}