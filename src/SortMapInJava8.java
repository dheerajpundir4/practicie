import java.util.*;
import java.util.stream.Collectors;

public class SortMapInJava8 {
    public static void main(String []args){
        HashMap<String, Integer> unsortMap=new HashMap();
        unsortMap.put("z", 10);
        unsortMap.put("t", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 19);
        System.out.println(unsortMap.entrySet());
        Map<String,Integer> result= unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (oldValue,newValue)->oldValue,LinkedHashMap::new));

        System.out.println("Reverse order by key "+result.entrySet());


        Map<String ,Integer> result2=unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (oldvalue,newvalue)->oldvalue,LinkedHashMap::new));

        System.out.println("Reverse order by value "+result2.entrySet());
    }
}
