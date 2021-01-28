package com.codecool.streamsWS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> cList = new ArrayList<>();
        for (int i=0; i<myList.size(); i++){
            if(myList.get(i).charAt(0)=='c'){
                cList.add(myList.get(i));
            }
        }
        List<String> cList2 = new ArrayList<>();
        for (int i=0; i< cList.size(); i++){
            cList2.add(cList.get(i).toUpperCase());
        }

        String[] cs=cList2.toArray(new String[0]);
        Arrays.sort(cs);

        for(int i=0; i<cs.length; i++){
            System.out.println(cs[i]);
        }
    }
            // Imola megoldása
    public static void main2(String[] args) {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> cs =myList.stream().filter(element -> element.charAt(0)=='c').
                map(word -> word.substring(0,1).toUpperCase()+word.substring(1)).sorted().
                collect(Collectors.toList());
        cs.forEach(System.out::println);
    }

}
