class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(words.length!=pattern.length()) return false ;
        
        ArrayList<Integer> patList = new ArrayList();
        ArrayList<Integer> wordList = new ArrayList();
        
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
        
            int patInd = pattern.indexOf(ch);
             int wordIndex = Arrays.asList(words).indexOf(words[i]);
        
             patList.add(patInd);
             wordList.add(wordIndex);
        
        }
        return patList.equals(wordList);
    }
}