class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    
   public static void main(String[] args){
     Solution obj = new Solution();
     System.out.println(obj.strStr("sadbutsad","sad"));

    }
}
