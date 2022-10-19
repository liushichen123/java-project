package liusc.person.springboot.repository.mybatisplus.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import liusc.person.springboot.repository.mybatisplus.domain.enums.GradeEnum;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 用户 - 数据库映射实体
 *
 * @author LiuShiChen
 * @date 2022/10/18 14:29:22
 **/
@Data
@ToString
@TableName("user")
@Accessors(chain = true)
public class UserDO extends Model<UserDO> {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;

    private String email;

    private GradeEnum grade;

    @TableField(value = "is_deleted", fill = FieldFill.INSERT)
    @TableLogic
    private Integer deleted;
}
