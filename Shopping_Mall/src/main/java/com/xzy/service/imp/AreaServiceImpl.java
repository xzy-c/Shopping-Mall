package com.xzy.service.imp;

import com.xzy.dao.AreaMapper;
import com.xzy.pojo.Area;
import com.xzy.pojo.User;
import com.xzy.pojo.User_Addr;
import com.xzy.service.base.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author yangxin
 * @date 2019/7/29 - 22:45
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> findAllArea(int parentid) throws Exception {
        return  areaMapper.findAllArea(parentid);
    }


    @Override
    @Transactional
    public void updateDefAddr(int user_Id) throws Exception {
        areaMapper.updateDefAddr(user_Id);
    }

    @Override
    @Transactional
    public void addDefAddr(User_Addr user_addr) throws Exception {
        areaMapper.addDefAddr(user_addr);
    }

}
