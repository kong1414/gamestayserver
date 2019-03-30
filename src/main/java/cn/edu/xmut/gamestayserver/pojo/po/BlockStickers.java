package cn.edu.xmut.gamestayserver.pojo.po;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "block_stickers")
public class BlockStickers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    @Column(name = "come_from")
    private String comeFrom;

    private String title;

    private String type;

    private String img1;

    private String img2;

    private String img3;

    private String url;
}