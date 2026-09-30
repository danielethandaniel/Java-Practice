package Java_20260430_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("AAA", "aaa");
        map.put("BBB", "bbb");
        map.put("CCC", "ccc");

////        put
///*        key不存在，put方法返回null;
//        key存在，put方法返回覆盖值;*/
//        String v = map.put("aaa", "AAA");
//        System.out.println(v);
//        map.put("bbb", "BBB");
//        map.put("ccc", "CCC");
//
//        String v2 = map.put("aaa", "DDD");
//        System.out.println(v2);
//        System.out.println(map);
//
//


/*//        remove
//        返回key对应的value
        String s = map.remove("AAA");
        System.out.println(s);*/



/*//        clear
        map.clear();
        System.out.println(map);*/
        Set<String> keys = map.keySet();
//        遍历
        for (String key : keys) {
            System.out.println(key);
        }

        
    }
}
