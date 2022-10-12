package pratice1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
       // tao hasmap de hien thi du lieu
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
// tao treeMap trong main de luwu key theo thu tu giam dan
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(" display entries in ascending order of key");
        System.out.println(treeMap);
// tao link hash Mash de luwu danh sach sinh vien va hien thi du lieu
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f, true);
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("\n The age for" + "lewis is" + linkedHashMap.get("Lewis"));

    }
}
