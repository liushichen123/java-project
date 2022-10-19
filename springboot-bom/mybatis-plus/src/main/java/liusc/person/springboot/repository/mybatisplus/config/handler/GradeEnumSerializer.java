package liusc.person.springboot.repository.mybatisplus.config.handler;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import liusc.person.springboot.repository.mybatisplus.domain.enums.GradeEnum;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * 年级序列化
 *
 * @author LiuShiChen
 * @date 2022/10/19 14:27:51
 **/
public class GradeEnumSerializer implements ObjectSerializer {

    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {
        // 强制把值转换为Gender
        GradeEnum gender = (GradeEnum) object;
        // 序列化为自定义的name属性，输出就行
        serializer.out.writeString(gender.toString());
    }
}
