package liusc.person.springboot.repository.mybatisplus.repository.entity;

import com.baomidou.mybatisplus.annotation.*;
import liusc.person.springboot.repository.mybatisplus.domain.enums.GradeEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * 用户 - 数据库映射实体
 *
 * @author LiuShiChen
 * @date 2022/10/18 14:29:22
 **/
@Data
@TableName("user")
@Accessors(chain = true)
public class UserDO {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;

    private String email;

    private GradeEnum grade;

    @Version
    private LocalDateTime version;

    @TableField(value = "is_deleted", fill = FieldFill.INSERT)
    @TableLogic
    private Integer deleted;
}
