package Collections;
import java.util.Map;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
import Collections.Student;
import java.util.Comparator;
public class Main3{
    public static void main(String[] args) {
        // Map<String, String> map= new HashMap<>();
        // Map<String, String> map= new LinkedHashMap<>();
        Map<String, String> map= new TreeMap<>();
        // insertion
        map.put("in", "INDIA");
        map.put("en", "England");
        map.put("us", "America");
        System.out.println(map);
        map.put("in", "India");
        System.out.println(map);
        Map<String, String> table= new HashMap<>();
        table.put("br", "Brazil");
        System.out.println(table);
        table.putAll(map);
        System.out.println(table);

        // deletion
        table.remove("en");
        System.out.println(table);
        System.out.println(table.size());
        table.clear();
        System.out.println(table.size());
        table.putIfAbsent("en", "england");
        System.out.println(table);
        System.out.println(table.size());
        System.out.println(table.get("en"));
        System.out.println(table.getOrDefault("us", "none"));
        System.out.println(table.containsKey("in"));
        System.out.println(table.containsValue("India"));
        table.put("in", "INDIA");
        table.put("us", "America");
        System.out.println(table);
        table.replace("us","United States");
        System.out.println(table);
        // System.out.println(table.keySet());
        Set<String> keySet= table.keySet();
        System.out.println(keySet);
        // System.out.println(table.values());
        Collection<String> val= table.values();
        System.out.println(val);
        // get all the entries from the map
        // System.out.println(table.entrySet());
        Set<Map.Entry<String, String>> entry= table.entrySet();
        System.out.println(entry);

        // iteration
        for (Map.Entry<String,String> entry2 : table.entrySet()) {
            System.out.println("key "+ entry2.getKey());
            System.out.println("value "+ entry2.getValue());
        }

        List<Integer> list= new ArrayList<>();
        list.add(32);
        list.add(45);
        list.add(23);
        list.add(12);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student(12, "Ankur", 68));
        students.add(new Student(53, "Gaurav", 58));
        students.add(new Student(18, "Mohit", 67));
        students.add(new Student(21, "Aditya", 63));
        System.out.println(students);
        // Collections.sort(students); 
        // System.out.println(students);
        Collections.sort(students, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2){
                return o1.weight-o2.weight;
            }
        });
        System.out.println(students);
    }
}