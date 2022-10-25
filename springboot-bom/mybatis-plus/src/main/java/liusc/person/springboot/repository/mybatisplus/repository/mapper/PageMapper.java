package liusc.person.springboot.repository.mybatisplus.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import liusc.person.springboot.repository.mybatisplus.common.Query;
import liusc.person.springboot.repository.mybatisplus.common.ResultVO;

import java.util.List;

/**
 * 分页 mapper
 *
 * @author LiuShiChen
 * @date 2022/10/19 18:09:59
 **/
public interface PageMapper<V extends ResultVO, T> extends BaseMapper<T> {

    /**
     * 查询所有
     *
     * @param t 查询条件实体
     * @return 返回结果
     */
    List<V> findList(Query t);
}
