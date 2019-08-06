package com.xzy.service.base;

import com.xzy.pojo.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangxiaoliang
 * @date 2019/7/31 - 1:45
 */

@Service
public interface SearchService {
    //模糊根据输入的查询
    public List<Goods> search(String str);

}
