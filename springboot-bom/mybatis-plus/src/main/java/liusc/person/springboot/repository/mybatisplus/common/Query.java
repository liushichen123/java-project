package liusc.person.springboot.repository.mybatisplus.common;

/**
 * 分页参数接收实体
 *
 * @author LiuShiChen
 * @date 2022/10/19 16:26:54
 **/
public class Query {

    private int pageNum = 1;

    private int pageSize = 10;

    private Sort[] sorts;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Sort[] getSorts() {
        return sorts;
    }

    public void setSorts(Sort[] sorts) {
        this.sorts = sorts;
    }
}
