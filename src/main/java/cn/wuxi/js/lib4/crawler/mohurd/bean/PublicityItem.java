package cn.wuxi.js.lib4.crawler.mohurd.bean;

import cn.wuxi.js.lib4.common.persistence.BaseEntity;
import cn.wuxi.js.lib4.common.persistence.DataEntity;

import java.util.Date;

/**
 * Created by aaronhuang on 2018/9/15.
 */
public class PublicityItem extends DataEntity {

    private String title;
    private String url;
    private Date pubDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public String toString() {
        return "PublicityItem{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", pubDate=" + pubDate +
                '}';
    }
}
