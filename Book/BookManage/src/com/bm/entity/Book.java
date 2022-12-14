package com.bm.entity;

import com.sun.xml.internal.ws.spi.db.DatabindingException;

import java.util.Date;

//entity层的作用为了传参方便
public class Book {//实体类:书
    private Long bId;//书的Id
    private String bName;//书的名字
    private String bAuthor;//书的作者
    private Date bTime;//借出时间
    private Integer bType;//书的类别

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public Date getbTime() {
        return bTime;
    }

    public void setbTime(Date bTime) {
        this.bTime = bTime;
    }

    public Integer getbType() {
        return bType;
    }

    public void setbType(Integer bType) {
        this.bType = bType;
    }
}
