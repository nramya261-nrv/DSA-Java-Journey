class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        int ans=0;
        for(int i=0;i<sentences.length;i++)
        {
            count=0;
            for(int j=0;j<sentences[i].length();j++){
            char ch=sentences[i].charAt(j);
            if(ch==' ')
            count++;
            }
            if(ans<count+1)
            {
                ans=count+1;
            }
        }
        
        return ans;
    }
}
