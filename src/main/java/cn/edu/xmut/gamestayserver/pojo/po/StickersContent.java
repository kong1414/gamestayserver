package cn.edu.xmut.gamestayserver.pojo.po;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "stickers_content")
public class StickersContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    @Column(name = "come_from")
    private String comeFrom;

    private String title;

    private String type;

    private String message;
}