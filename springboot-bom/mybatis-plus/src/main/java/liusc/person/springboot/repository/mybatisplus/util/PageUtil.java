package liusc.person.springboot.repository.mybatisplus.util;

import liusc.person.springboot.repository.mybatisplus.common.Sort;

import java.util.StringJoiner;

/**
 * 分页工具类
 *
 * @author LiuShiChen
 * @date 2022/10/19 16:39:17
 **/
public class PageUtil {

    public static String convertSort(Sort[] sorts) {
        StringJoiner stringJoiner = new StringJoiner(",");
        for (Sort sort : sorts) {
            String field = sort.getField();
            int direction = sort.getDirection();
            stringJoiner.add(field + convertDirection(direction));
        }
        return stringJoiner.toString();
    }

    public static String convertDirection(int direction) {
        return direction == 0 ? " ASC" : " DESC";
    }
}
