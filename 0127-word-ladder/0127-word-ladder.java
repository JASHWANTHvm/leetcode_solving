class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> s = new HashSet<>();
        int f = 0;
        Queue<String> q = new LinkedList<>();
        for(String word : wordList)
        {
            if(word.compareTo(endWord)==0)
               f=1;
               s.add(word);
        }
        if(f==0)
        return 0;
        q.add(beginWord);
        int level=0;
        while(!q.isEmpty())
        {
            level++;
            int size = q.size();
            while(size>0)
            {
            String curr = q.poll();
            for(int i=0;i<curr.length();i++)
            {
                StringBuffer temp = new StringBuffer(curr);
                for(char ch='a';ch<='z';ch++)
                {
                    temp.setCharAt(i,ch);
                    String temp1=temp.toString();
                    if(temp1.compareTo(curr) == 0)
                    continue;
                    if(temp1.compareTo(endWord) == 0)
                    return level+1;
                    if(s.contains(temp1))
                    {
                        q.add(temp1);
                        s.remove(temp1);
                    }
                }
            }
            size--;
            }
        }
        return 0 ;
    }
}