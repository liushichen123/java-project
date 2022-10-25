package liusc.person.springboot.repository.mybatisplus.common;

import lombok.Data;

/**
 * 排序参数
 *
 * @author LiuShiChen
 * @date 2022/10/19 16:27:51
 **/
public class Sort {

    private String field;

    /**
     * 0 为正序，1 为倒序
     */
    private int direction = 0;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
