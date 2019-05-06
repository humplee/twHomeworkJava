package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        ArrayList<String> buffer= new ArrayList<>(object.get("value"));
        for(int i = 0;i < buffer.size();i++){
            if(collectionA.containsKey(buffer.get(i))){
                collectionA.replace(buffer.get(i),collectionA.get(buffer.get(i))-collectionA.get(buffer.get(i))/3);
            }
        }
        return collectionA;
    }
}
