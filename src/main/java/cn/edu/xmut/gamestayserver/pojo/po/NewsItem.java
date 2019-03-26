package cn.edu.xmut.gamestayserver.pojo.po;

import lombok.Data;

import javax.persistence.*;

@Data
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

    @Column(name = "if_recommendation")
    private Integer ifRecommendation;

    @Column(name = "if_recommendation_head")
    private Integer ifRecommendationHead;
}