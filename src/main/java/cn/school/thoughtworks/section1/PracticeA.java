package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        ArrayList<String> bufferList = new ArrayList<>();
        for(int i=0;i<collection1.size();i++){
            if(collection2.contains(collection1.get(i))){
               bufferList.add(collection1.get(i));
            }
        }
        return bufferList;
    }
}
