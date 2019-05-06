package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        ArrayList<String> buffer= new ArrayList<>(object.get("value"));
        Map<String,Integer> collection3=new HashMap<String, Integer>();
        for(int i=0;i<collectionA.size();i++){
            if(collection3.containsKey(collectionA.get(i))){
                collection3.replace(collectionA.get(i),collection3.get(collectionA.get(i))+1);
            }else if(collection3.containsKey(collectionA.get(i).substring(0,1))){
                collection3.replace(collectionA.get(i),collection3.get(collectionA.get(i))+Integer.parseInt(collectionA.get(i).substring(2)));
            }else if(collectionA.get(i).length()>2){
                collection3.put(collectionA.get(i).substring(0,1),Integer.parseInt(collectionA.get(i).substring(2)));
            }
            else{
                collection3.put(collectionA.get(i),1);
            }
        }
        for(int i = 0;i < buffer.size();i++){
            if(collection3.containsKey(buffer.get(i))){
                collection3.replace(buffer.get(i),collection3.get(buffer.get(i))-collection3.get(buffer.get(i))/3);
            }
        }
        return collection3;
    }

}
