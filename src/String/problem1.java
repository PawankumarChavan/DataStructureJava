package String;

import java.util.StringTokenizer;

public class problem1 {
    public static void main(String[] args) {
//        Write a JAVA program to count total number of words in a string.

        String name="Pawan  Ganesh Chavan";

//        int res=countWords(name);
          int res=cntWrds(name);
        System.out.println(res);



        //-------------------------------------------------------------------------

        String blogName = "how to   do    in  java   .         com";

        StringTokenizer st = new StringTokenizer(blogName, " ");

        StringBuffer sb = new StringBuffer();

        while(st.hasMoreElements())
        {
            sb.append(st.nextElement()).append(" ");

        }
        String nameWithProperSpacing = sb.toString();

        System.out.println( nameWithProperSpacing );

    }
    // manual
    public static int countWords(String str){
        int cnt=0;
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                cnt++;
            }
            i++;
        }


        return cnt+1;
    }

    // build in function
    public static int cntWrds(String str){
        int cnt=0;
        String clm=str.replaceAll("\\s+"," ");
        String spl[]=clm.split(" ");
        return spl.length;
    }

}
