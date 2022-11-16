
class Solution {
    public static int beautySum(String s) {
        // code here
        int ans=0;
        int size=s.length();
        for(int window=3;window<=size;window++){
            int i=0;
            int j=window;
            int freq[] = new int[26];
            for (int k=i;k<j;k++){
                freq[s.charAt(k)-'a']++;
            }
            ans+=beauty(freq);
            while(j<size){
                freq[s.charAt(j)-'a']++ ;
                freq[s.charAt(i)-'a']--;
                ans+=beauty(freq);
                i++;
                j++;
            }
        }
        return ans;
    }
    public static int beauty(int freq[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                max=Math.max(max,freq[i]);
                min=Math.min(min,freq[i]);
            }
        }
        return max-min;
    }
}
        