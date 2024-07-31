public class reversestring {

    public static void main(String [] args)
    {
System.out.println(rev_str("          The Sky Is Blue           "));
    }
    public static String rev_str(String s)
    {
        String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
