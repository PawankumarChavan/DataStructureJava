package String;

public class problem2 {
    public static void main(String[] args) {
//        Write a JAVA program to find reverse of a string.

    String s="Pawan";
    StringBuffer sb = new StringBuffer(s);
    System.out.println(sb.reverse());

    char []t=s.toCharArray();
    int i=0;

    while(i<s.length()/2){
        char temp=t[i];
        t[i]=t[s.length()-i-1];
        t[s.length()-i-1]=temp;
        i++;
    }
    String temp = new String(t);
    System.out.println(temp);

    }



}
