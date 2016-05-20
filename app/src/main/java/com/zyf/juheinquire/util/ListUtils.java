package com.zyf.juheinquire.util;

import java.util.List;

/**
 * Created by zyf on 16/5/20.
 */
public class ListUtils {

    public static boolean isEmpty(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
