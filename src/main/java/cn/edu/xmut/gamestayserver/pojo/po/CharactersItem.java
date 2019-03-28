package cn.edu.xmut.gamestayserver.pojo.po;

import javax.persistence.*;

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
     * @return profile
     */
    public String getProfile() {
        return profile;
    }

    /**
     * @param profile
     */
    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return type1
     */
    public String getType1() {
        return type1;
    }

    /**
     * @param type1
     */
    public void setType1(String type1) {
        this.type1 = type1 == null ? null : type1.trim();
    }

    /**
     * @return type2
     */
    public String getType2() {
        return type2;
    }

    /**
     * @param type2
     */
    public void setType2(String type2) {
        this.type2 = type2 == null ? null : type2.trim();
    }

    /**
     * @return come_from
     */
    public String getComeFrom() {
        return comeFrom;
    }

    /**
     * @param comeFrom
     */
    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom == null ? null : comeFrom.trim();
    }
}