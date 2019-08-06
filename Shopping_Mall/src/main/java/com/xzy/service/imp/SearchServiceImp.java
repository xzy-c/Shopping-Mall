package com.xzy.service.imp;

import com.xzy.dao.SearchMapper;
import com.xzy.pojo.Goods;
import com.xzy.service.base.SearchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wangxiaoliang
 * @date 2019/7/31 - 1:50
 */
public class SearchServiceImp implements SearchService {
    @Autowired
    SearchMapper sm;

    @Override
    public List<Goods> search(String str) {

        return sm.search(str);
    }
}
