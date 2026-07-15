class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        
        String current = "1";
        
        for (int i = 2; i <= n; i++) {
            StringBuilder nextSequence = new StringBuilder();
            int length = current.length();
            int count = 1;
            
            for (int j = 1; j < length; j++) {
                if (current.charAt(j) == current.charAt(j - 1)) {
                    count++;
                } else {
                    nextSequence.append(count).append(current.charAt(j - 1));
                    count = 1;
                }
            }
            nextSequence.append(count).append(current.charAt(length - 1));
            current = nextSequence.toString();
        }
        
        return current;
    }
}
