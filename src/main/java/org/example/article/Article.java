package org.example.article;

import org.example.user.SiteUser;

import java.time.LocalDateTime;
import java.util.Date;

public class Article {
    private Integer id;
    private String title;
    private String content;
    private Date createDate;
    private Date modifyDate;
    private SiteUser author;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public SiteUser getAuthor() {
        return author;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public void setAuthor(SiteUser author) {
        this.author = author;
    }
}
