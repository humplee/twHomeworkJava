package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String ,Integer> resultMap = new HashMap<String, Integer>();
        for(int i = 0; i < collection1.size(); i++ ){
            String theString=collection1.get(i);
            if(resultMap.containsKey(theString)){
                int counter=(int)resultMap.get(theString);
                counter++;
                resultMap.replace(collection1.get(i),counter);
            }else if(theString.length()>1&&resultMap.containsKey(theString.substring(0,1))){
                String test=theString.substring(0,1);
                char[] chars = theString.toCharArray();
                StringBuffer buffer=new StringBuffer();
                for(int j = 0; j < chars.length; j ++) {
                    if((chars[j] >= 48 && chars[j] <= 57)) {
                        buffer.append(chars[j]);
                    }
                }
                String theStringBuffer=buffer.toString();
                int counter=resultMap.get(test)+Integer.parseInt(theStringBuffer);
                resultMap.replace(test,counter);
            }else if(theString.length()>1){
                char[] chars = theString.toCharArray();
                StringBuffer buffer=new StringBuffer();
                for(int j = 0; j < chars.length; j ++) {
                    if((chars[j] >= 48 && chars[j] <= 57)) {
                        buffer.append(chars[j]);
                    }
                }
                String theStringBuffer=buffer.toString();
                resultMap.put(theString.substring(0,1),Integer.parseInt(theStringBuffer));
            }else {
                resultMap.put(theString,1);
            }
        }

        return resultMap;
    }
}
