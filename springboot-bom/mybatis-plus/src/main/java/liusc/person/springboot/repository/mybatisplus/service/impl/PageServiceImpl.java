package liusc.person.springboot.repository.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import liusc.person.springboot.repository.mybatisplus.common.Query;
import liusc.person.springboot.repository.mybatisplus.common.ResultVO;
import liusc.person.springboot.repository.mybatisplus.repository.mapper.PageMapper;
import liusc.person.springboot.repository.mybatisplus.service.PageService;
import liusc.person.springboot.repository.mybatisplus.util.PageUtil;

import java.util.List;

/**
 * 分页查询实现类
 *
 * @author LiuShiChen
 * @date 2022/10/25 09:22:48
 **/
public class PageServiceImpl<V extends ResultVO, M extends PageMapper<V, T>, T> extends ServiceImpl<M, T> implements PageService<V, T> {

    private PageMapper<V, T> pageMapper;

    public PageServiceImpl(PageMapper<V, T> pageMapper) {
        this.pageMapper = pageMapper;
    }

    @Override
    public PageInfo<V> page(Query query) {
        String order = PageUtil.convertSort(query.getSorts());
        PageHelper.startPage(query.getPageNum(), query.getPageSize(), order);
        List<V> list = pageMapper.findList(query);
        return new PageInfo<>(list);
    }
}
