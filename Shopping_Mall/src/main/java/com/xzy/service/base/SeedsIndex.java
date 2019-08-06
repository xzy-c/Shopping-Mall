package com.xzy.service.base;

import com.xzy.pojo.Seeds;
import com.xzy.pojo.User;


import java.util.List;

public interface SeedsIndex {
    public List<Seeds> sortLikes();
    public String getCover(int seeds_Id);
    public User getUser(int seeds_Id);
    public Seeds getTitle(int seeds_Id);
}
