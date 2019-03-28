package cn.edu.xmut.gamestayserver.pojo.po;

import javax.persistence.*;

@Table(name = "news_item")
public class NewsItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    @Column(name = "news_title")
    private String newsTitle;

    @Column(name = "news_picture")
    private String newsPicture;

    @Column(name = "news_type")
    private String newsType;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return news_title
     */
    public String getNewsTitle() {
        return newsTitle;
    }

    /**
     * @param newsTitle
     */
    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    /**
     * @return news_picture
     */
    public String getNewsPicture() {
        return newsPicture;
    }

    /**
     * @param newsPicture
     */
    public void setNewsPicture(String newsPicture) {
        this.newsPicture = newsPicture == null ? null : newsPicture.trim();
    }

    /**
     * @return news_type
     */
    public String getNewsType() {
        return newsType;
    }

    /**
     * @param newsType
     */
    public void setNewsType(String newsType) {
        this.newsType = newsType == null ? null : newsType.trim();
    }
}