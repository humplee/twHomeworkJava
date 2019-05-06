package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String ,Integer> resultMap = new HashMap<String, Integer>();
        for(int i = 0; i < collection1.size(); i++ ){
            String theString=collection1.get(i);
            if(resultMap.containsKey(theString)){
                int counter=(int)resultMap.get(theString);
                counter++;
                resultMap.replace(collection1.get(i),counter);
            }else{
                resultMap.put(theString,1);
            }
        }


        return resultMap;
    }
}
