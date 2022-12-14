package liusc.person.springboot.repository.mybatisplus.controller.command;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import liusc.person.springboot.repository.mybatisplus.domain.enums.GradeEnum;
import lombok.Data;

/**
 * 用户 - 通用命令
 *
 * @author LiuShiChen
 * @date 2022/10/18 14:35:54
 **/
@Data
public class UserCommon {

    private Long id;

    private String name;

    private Integer age;

    private String email;

    @JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
    private GradeEnum grade;
}
