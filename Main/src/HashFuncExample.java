import java.util.Hashtable;
import java.util.Iterator;

public class HashFuncExample {
    public static void main(String[] args) {
        // create HashTable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        //Add mappings to hashtable
        hashtable.put(1, "Mia") ;
        hashtable.put(2, "Leo") ;
        hashtable.put(3, "Tim") ;

        // Get a mapping by key
        System.out.println(hashtable.get(1));

        //  Remove a mapping
        System.out.println(hashtable.remove(2));

        // Iterate overmapping
        Iterator<Integer> itr = hashtable.keySet().iterator();

        while (itr.hasNext()){
            int key = itr.next();
            String mapped_value = hashtable.get(key) ;
            System.out.println("keys: " + key + " values: " + mapped_value);
        }
    }
}