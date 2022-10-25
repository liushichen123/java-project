package liusc.person.springboot.repository.mybatisplus.controller.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import liusc.person.springboot.repository.mybatisplus.common.ResultVO;
import liusc.person.springboot.repository.mybatisplus.domain.User;
import liusc.person.springboot.repository.mybatisplus.domain.enums.GradeEnum;
import lombok.Data;
import lombok.ToString;

/**
 * 用户 - 视图层实体
 *
 * @author LiuShiChen
 * @date 2022/10/18 14:29:58
 **/
@Data
@ToString
public class UserVO extends User implements ResultVO {

    private Long id;

    private String name;

    private Integer age;

    private String email;

    @JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
    private GradeEnum grade;
}
