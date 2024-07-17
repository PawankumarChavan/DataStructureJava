package String;

public class palindromeString {
    public static void main(String[] args) {
        String s ="Pawan";
//        char ch[]=s.toCharArray();
//        int i=0;
//        boolean flag=false;
//        while(i<ch.length){
//            if(ch[i]!=ch[s.length()-i-1]){
//                flag=true;
//                break;
//            }
//            i++;
//        }
//        if(flag==false){
//            System.out.println("Palindrome String");
//        }else{
//            System.out.println("Not palindrome");
//        }

        StringBuffer sb = new StringBuffer(s);

        if(sb.reverse().toString().equals(s)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not palindrome");
        }

    }
}
