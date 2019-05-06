package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        ArrayList<String> bufferList = new ArrayList<>();
        for(int i=0;i<collection1.size();i++){
            for(int j=0;j<collection2.size();j++){
                if(collection2.get("value").contains(collection1.get(i))){
                    bufferList.add(collection1.get(i));
                }
            }
        }
        return bufferList;
    }
}
