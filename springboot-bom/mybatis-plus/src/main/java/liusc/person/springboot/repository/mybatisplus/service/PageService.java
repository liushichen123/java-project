package liusc.person.springboot.repository.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import liusc.person.springboot.repository.mybatisplus.common.Query;
import liusc.person.springboot.repository.mybatisplus.common.ResultVO;

/**
 * 分页实现接口
 *
 * @author LiuShiChen
 * @date 2022/10/19 18:08:01
 **/
public interface PageService<V extends ResultVO, T> extends IService<T> {


    /**
     * 分页
     *
     * @param query 分页参数
     * @return 分页信息
     */
    PageInfo<V> page(Query query);
}
