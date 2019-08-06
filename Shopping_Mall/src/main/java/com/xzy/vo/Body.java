package com.xzy.vo;

import java.util.List;

public class Body {
    Up up;
    List<Discuss> list_Discuss;

    public Up getUp() {
        return up;
    }

    public void setUp(Up up) {
        this.up = up;
    }

    public List<Discuss> getList_Discuss() {
        return list_Discuss;
    }

    public void setList_Discuss(List<Discuss> list_Discuss) {
        this.list_Discuss = list_Discuss;
    }
}
