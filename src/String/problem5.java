package String;

import java.util.*;
import java.util.Map;

public class problem5 {
    public static void main(String[] args) {
//        String s ="abcabcabcaad";
//        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
//        int i=0;
//        while(i<s.length()){
//            if(map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i),map.get(s.charAt(i))+1);
//            }else{
//                map.put(s.charAt(i),1);
//            }
//
//            i++;
//        }
//
//        Set<Map.Entry<Character, Integer>> s1=map.entrySet();
//        for(Map.Entry<Character, Integer> sd:s1) {
//            System.out.println(sd.getKey()+"\t"+sd.getValue());
//        }






            // Sorting of Map

                HashMap<String, String> map = new HashMap<>();
                LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();
                ArrayList<String> list = new ArrayList<>();
                map.put("2", "B");
                map.put("8", "A");
                map.put("4", "D");
                map.put("7", "F");
                map.put("6", "W");
                map.put("19", "J");
                map.put("1", "Z");
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    list.add(entry.getValue());
                }
//                Collections.sort(list, new Comparator<String>() {
//                    public int compare(String str, String str1) {
//                        return (str).compareTo(str1);
//                    }
//                });
//                for (String str : list) {
//                    for (Map.Entry<String, String> entry : map.entrySet()) {
//                        if (entry.getValue().equals(str)) {
//                            sortedMap.put(entry.getKey(), str);
//                        }
//                    }
//                }
//                System.out.println(sortedMap);


            }




}
