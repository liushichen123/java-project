package liusc.person.springboot.repository.mybatisplus.domain.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 年级枚举
 *
 * @author LiuShiChen
 * @date 2022/10/19 13:58:50
 **/
public enum GradeEnum {

    PRIMARY(1, "小学"),

    SECONDORY(2, "中学"),

    HIGH(3, "高中");

    GradeEnum(int code, String descp) {
        this.code = code;
        this.descp = descp;
    }

    //标记数据库存的值是code
    @EnumValue
    private final int code;

    @JsonValue
    private final String descp;
}

