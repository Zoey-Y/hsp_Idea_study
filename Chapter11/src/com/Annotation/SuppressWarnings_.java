package com.Annotation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class SuppressWarnings_ {
    /*解析:
    * 1.若不希望看到警告可以加@SuppressWarnings来抑制警告信息
    * 2.在{""}中写入你希望抑制的警告
    * 3. @SuppressWarnings({"all"})的作用范围和其放置的位置有关*/
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("");
        list.add("");
        list.add("");
        int i;
        System.out.println(list.get(1));
    }
}
