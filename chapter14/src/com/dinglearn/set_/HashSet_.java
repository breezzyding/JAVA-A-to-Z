package com.dinglearn.set_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ding
 * @version 1.0
 */
public class HashSet_ {
    public static void main(String[] args) {
        /*
        解读
            1.构造器的源码
              HashSet实际上是HashMap
            public HashSet() {
                  map = new HashMap<>();
            }

            2.HashSet可以存放null 但是只能有一个null,即元素是不可以重复的


         */

        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);

    }
}