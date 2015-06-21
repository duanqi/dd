package com.dd.myapp.common.utils;

/**
 * 分页工具类
 * 
 * @author duanqi25@gmail.com
 * @createDate 2015年6月20日
 * 
 */
public class PagerUtils {

    /** 分页page */
    public static final Integer PAGE = 0;

    /** 分页count */
    public static final Integer COUNT = 5;

    public static class Pager {
        private Integer page;

        private Integer count;

        public Integer getPage() {
            return page;
        }

        public void setPage(Integer page) {
            this.page = page;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Pager(Integer page, Integer count) {
            this.page = page;
            this.count = count;
        }
    }

    public static Pager getPager(Integer page, Integer count) {
        if (null == page) {
            page = PAGE;
        }
        if (null == count) {
            count = COUNT;
        }
        return new Pager(page, count);
    }
}
