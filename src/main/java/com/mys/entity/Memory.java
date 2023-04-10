package com.mys.entity;

import java.util.Date;

/**
 * @Description: 流年记实体类
 * @Author supxiaoxin
 */
public class Memory {

    private Long id;
    private Date createTime;
    private String pictureAddress;
    private String memory;

    public Memory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPictureAddress() {
        return pictureAddress;
    }

    public void setPictureAddress(String pictureAddress) {
        this.pictureAddress = pictureAddress;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", pictureAddress='" + pictureAddress + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
