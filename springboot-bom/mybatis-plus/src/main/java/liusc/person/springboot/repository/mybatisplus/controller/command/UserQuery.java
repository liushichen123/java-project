package liusc.person.springboot.repository.mybatisplus.controller.command;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import liusc.person.springboot.repository.mybatisplus.common.Query;
import liusc.person.springboot.repository.mybatisplus.domain.enums.GradeEnum;
import lombok.Data;

/**
 * 用户分页参数
 *
 * @author LiuShiChen
 * @date 2022/10/19 16:29:54
 **/
@Data
public class UserQuery extends Query {

    private Long id;

    private String name;

    private Integer age;

    private String email;

    @JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
    private GradeEnum grade;

}
