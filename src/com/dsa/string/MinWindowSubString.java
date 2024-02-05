package com.dsa.string;

//leetcode problem no - 76
//Hard level question, time limit exceeded
public class MinWindowSubString {
    static int MAX = 53;

    public static void main(String[] args) {
        String s = "qxsncfwvbslazxuoxnedkukropehlwfbwxqycntdfgghecvdqbhcwtukkauwzzzvystcfohmupvastekunmqiidtjxriyqdyiyapohekxblrurbpgphoykjhjarhtwfduhvkpzumahdxagmivtxvgiepjvxetehnmczddurgdwdecrmzklxqubgfzfjslqizvheadvghrlnvcbxpnuhjxpqywzrkrbjokqpolxxflkapnzeatmltdbrackkwlvmwlbmxbjcmvebieilzwyszckzgulcihpgsssrtdvhaaligvvfrwaqyksegdjqmywfsoyotuxtwieefbjwxjpxvhcemnwzntgfjetdatyydecjgofdzudxbfbqsxpfsvmebijcbhcemfnuvtzupcrthujbuyiovvswdbagjdkxkyrftqbktvdcpogloqajlsgquiyfljcxjveengogbulsitexjeixwqpszoxkzzkiuooiweqxydqjywiiaqhyhwrgkosloetktjuponposfxrdhzdyibhesprjjczoyjhhgyxtnmlulextdatnecsyrlhangonsxxywutligguldpqgiemkymdjufycumwtjupfpdowjkjozzwjdivbvymrdlvzzstkmkpenfcyplnqkjzquutrsgiytdxsvsckftquzstqdihnrgfnbbevjovcutupnyburrpsjijmsqclyjzzk";
        String t = "fxtusxonrfdrhxjamdkwm";
        String ans = "";
        int min = s.length();
        if(t.length()>s.length()){
            System.out.println("");
        }
        else if(t.length()==s.length()){
            if(targetstring(s,t)){
                System.out.println(s);
            }
            else{
                System.out.println("");
            }
        }
        for(int i=0;i<s.length();i++){
            for(int j=i+t.length();j<=s.length();j++){
                String temp = s.substring(i,j);
                if(targetstring(temp,t) && temp.length()<=min){
                    min=temp.length();
                    ans=temp;
                }
            }
        }
        System.out.println(ans);
    }

    static boolean targetstring(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();

        int []map = new int[MAX];

        for (int i = 0; i < l1; i++){
            if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
                map[str1.charAt(i) - 'a']++;
            else
                map[str1.charAt(i)-'A'+26]++;
        }

        for (int i = 0; i < l2; i++)
        {
            if(str2.charAt(i)>='a' && str2.charAt(i)<='z') {
                map[str2.charAt(i) - 'a']--;
                if (map[str2.charAt(i) - 'a'] < 0)
                    return false;
            }
            else {
                map[str2.charAt(i)-'A'+26]--;
                if (map[str2.charAt(i) - 'A'+26] < 0)
                    return false;
            }
        }

        return true;
    }

}
