package com.dinglearn.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Collection_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //解读
        //1.集合主要是两组(单列集合,双列集合)
        //2.Collection接口有两个重要的子接口List Set 但实现的子类都是单列集合
        //3.Map接口的实现子类,是双列集合,存放的K-V
        //4.记下梳理的两张图

        //Collection

        //Map

        ArrayList arrayList = new ArrayList();
        arrayList.add("ding");//单列
        arrayList.add("Ding");

        HashMap hashMap = new HashMap();
        hashMap.put("NO1", "北京");//双列
        hashMap.put("NO2", "上海");
    }
}
