package cn.edu.xmut.gamestayserver.pojo.po;

import javax.persistence.*;

@Table(name = "news_content")
public class NewsContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    @Column(name = "news_type")
    private String newsType;

    private String title;

    private String message;

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

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}