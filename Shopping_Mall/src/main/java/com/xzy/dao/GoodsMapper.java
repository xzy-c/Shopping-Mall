package com.xzy.dao;
import com.xzy.pojo.Goods;
import com.xzy.pojo.Small_Cate;

import java.util.List;


public interface GoodsMapper {

    public List<Small_Cate> searchSmall_Cate(int Big_Cate_ID);

    public List<Goods> searchGoods(int Small_Cate_Id);

}
