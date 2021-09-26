package com.dinglearn.list_;

import java.util.ArrayList;

/**
 * @author Ding
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ArrayListSouce {
    public static void main(String[] args) {

        //解读

        //使用无参构造器创建ArrayList对象
        ArrayList list = new ArrayList();
        //ArrayList list = new ArrayList(8);
        //使用for给list集合添加 1-10 数据
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);


        /**
         *  阅读和解释源码:
         *
         *  public ArrayList() {
         *      this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
         *  }
         *  创建了一个空的elementData数组 = { }
         *
         *  public boolean add(E e) {
         *      ensureCapacityInternal(size + 1);  // Increments modCount!!
         *      elementData[size++] = e;
         *      return true;
         *  }
         *  执行list.add
         *  (1) 先确定是否要扩容
         *  (2) 然后在执行 赋值
         *
         *  private void ensureCapacityInternal(int minCapacity) {
         *      if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
         *              minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
         *      }
         *
         *      ensureExplicitCapacity(minCapacity);
         *  }
         *
         *  该方法确定minCapacity
         *  (1)第一次扩容 为10
         *
         *  private void ensureExplicitCapacity(int minCapacity) {
         *      modCount++;
         *
         *      // overflow-conscious code
         *      if (minCapacity - elementData.length > 0)
         *              grow(minCapacity);
         *  }
         *
         *  (1)modCount++记录集合被修改的次数
         *  (2)如果elementData的大小不够,就去调用grow()
         *
         *  private void grow(int minCapacity) {
         *      // overflow-conscious code
         *      int oldCapacity = elementData.length;
         *      int newCapacity = oldCapacity + (oldCapacity >> 1);
         *      if (newCapacity - minCapacity < 0)
         *           newCapacity = minCapacity;
         *      if (newCapacity - MAX_ARRAY_SIZE > 0)
         *           newCapacity = hugeCapacity(minCapacity);
         *      // minCapacity is usually close to size, so this is a win:
         *      elementData = Arrays.copyOf(elementData, newCapacity);
         *  }
         *
         *  (1)真的扩容
         *  (2)使用扩容机制来确定要扩容到多大
         *  (3)第一次newCapacity = 10
         *  (4)第二次及其以后,按照1.5倍扩容
         *  (5)扩容使用的是Arrays.copyOf()
         */

    }
}