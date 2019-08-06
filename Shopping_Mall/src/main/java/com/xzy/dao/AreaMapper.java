package com.xzy.dao;

import com.xzy.pojo.Area;
import com.xzy.pojo.User;
import com.xzy.pojo.User_Addr;

import java.util.List;

/**
 * @author yangxin
 * @date 2019/7/29 - 22:47
 */
public interface AreaMapper {
    public List<Area> findAllArea(int parentid)throws  Exception;
    //更新用户旧的地址的默认字段
    public void updateDefAddr(int user_Id) throws Exception;
    //添加新的用户地址(并设置为默认/非默认)
    public void addDefAddr(User_Addr user_addr)throws Exception;
}
