package cn.edu.xmut.gamestayserver.pojo.po;

import javax.persistence.*;

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
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return img1
     */
    public String getImg1() {
        return img1;
    }

    /**
     * @param img1
     */
    public void setImg1(String img1) {
        this.img1 = img1 == null ? null : img1.trim();
    }

    /**
     * @return img2
     */
    public String getImg2() {
        return img2;
    }

    /**
     * @param img2
     */
    public void setImg2(String img2) {
        this.img2 = img2 == null ? null : img2.trim();
    }

    /**
     * @return img3
     */
    public String getImg3() {
        return img3;
    }

    /**
     * @param img3
     */
    public void setImg3(String img3) {
        this.img3 = img3 == null ? null : img3.trim();
    }
}