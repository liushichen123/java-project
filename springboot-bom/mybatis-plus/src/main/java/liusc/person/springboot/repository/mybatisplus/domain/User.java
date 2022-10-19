package liusc.person.springboot.repository.mybatisplus.domain;

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
}
