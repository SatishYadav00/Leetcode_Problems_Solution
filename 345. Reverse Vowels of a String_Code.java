class Solution {
    public String reverseVowels(String s) {
        char str[]=s.toCharArray();
        String Vowel="";
        int j=-1;
        for(int i=0;i<str.length;i++)
        {
             if(str[i]=='a'||str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A'||str[i]=='E' || str[i]=='O' || str[i]=='U' ||str[i]=='I')
            {
             j++;
             Vowel+=str[i];
            }
           }
              for(int i=0;i<str.length;i++)
            {
                    if(str[i]=='a'||str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A'||str[i]=='E' || str[i]=='O' || str[i]=='U' ||str[i]=='I')
                    {
                            str[i]=Vowel.charAt(j--);
                           
                    }}
                    return String.valueOf(str);
    }
}
