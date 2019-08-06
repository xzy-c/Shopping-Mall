package com.xzy.service.imp;

import com.xzy.dao.ClassifyMapper;
import com.xzy.pojo.Goods;
import com.xzy.service.base.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wangxiaoliang
 * @date 2019/7/30 - 4:12
 */
public class ClassifyServiceImp implements ClassifyService {
    @Autowired
    private ClassifyMapper cm;

   /* @Override
    public List<Small_Cate> findSmallCate(int Big_Cate_ID) {

        return cm.findSmallCate(Big_Cate_ID);
    }
*/

    @Override
    public List<Goods> findGoods(int Big_Cate_ID) {

        return cm.findGoods(Big_Cate_ID);
    }


}
