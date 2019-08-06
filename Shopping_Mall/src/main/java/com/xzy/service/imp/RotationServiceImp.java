package com.xzy.service.imp;

import com.xzy.pojo.Goods;
import com.xzy.dao.RotationMapper;
import com.xzy.service.base.RotationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wangxiaoliang
 * @date 2019/7/27 - 23:19
 */
public class RotationServiceImp implements RotationService {

    @Autowired
    RotationMapper rm;

    @Override

    public List<Goods> findImg(){

        return rm.findImg();
    }

}
