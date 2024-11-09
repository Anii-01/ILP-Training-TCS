public class Test13 {
    
    public static void main(String args[])
    {
        int a = 10;
        //String str = a.toString();

        Integer aa = 20;
        System.out.println(aa+10);
        String str2 = aa.toString(aa);
        System.out.println(str2+"aniket");

        StringBuilder sb = new StringBuilder();
        for(char ch ='a'; ch<='z'; ch++)
        {
            System.out.print(ch);
            sb.append(ch);
        }
        System.out.println(sb.length());


        //join
        String s1 = "Aniket";
        String s2 = "Phand";
        System.out.println(String.join(":",s1,s2));

        String s = "India ismy country!";
        System.out.println(s.subSequence(3,9));
    }
}
