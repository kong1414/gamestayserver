package cn.edu.xmut.gamestayserver.pojo.po;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "characters_item")
public class CharactersItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    private String profile;

    private String name;

    private String type1;

    private String type2;

    @Column(name = "come_from")
    private String comeFrom;

    private String url;

}