package com.aaa.mb.entity;

import java.util.List;

/**
 * className:Role
 * discriptoin:
 * author:FLZ
 * createTime:2018-11-07 08:31
 */
public class Role {
    private int id;
    private String name;
    //描述多对多
    private List<power> powerList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<power> getPowerList() {
        return powerList;
    }

    public void setPowerList(List<power> powerList) {
        this.powerList = powerList;
    }
}
