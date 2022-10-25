package liusc.person.springboot.repository.mybatisplus.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import liusc.person.springboot.repository.mybatisplus.domain.enums.GradeEnum;
import lombok.Data;
import lombok.ToString;

/**
 * 用户领域层
 *
 * @author LiuShiChen
 * @date 2022/10/18 14:24:02
 **/
@Data
@ToString
public class User {

    private Long id;

    private String name;

    private Integer age;

    private String email;

    @JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
    private GradeEnum grade;
}
