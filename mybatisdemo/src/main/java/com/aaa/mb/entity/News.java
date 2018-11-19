package com.aaa.mb.entity;

/**
 * className:News
 * discriptoin:
 * author:FLZ
 * createTime:2018-11-06 16:00
 */
public class News {
    private Integer newsId;
    private  String title;
    private String content;
    private  Integer typeId;
    //

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
