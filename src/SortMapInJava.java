import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortMapInJava {
    public static void main(String args[]) {
        HashMap<Integer, Integer>  hashMap=new HashMap();
        HashMap<Integer,Integer> sortedHashMap=new HashMap();
        Queue<Integer> queue=new PriorityQueue();
        for (int i=0;i<10;i++) {
            hashMap.put (i*100, i);
        }

        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet() ){
            queue.add(entry.getKey());
            System.out.println(entry.getKey());
        }
        System.out.println("======================");
        while(!queue.isEmpty()){
            int i=queue.peek();
            queue.remove();
            System.out.println("key = :"+ i+"  "+"value = :"+hashMap.get(i));
        }




    }
}
