package cn.edu.xmut.gamestayserver.pojo.vo;

import cn.edu.xmut.gamestayserver.pojo.po.CharactersItem;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CharactersItemRes {
    private String comeFrom;
    private List<Map<String, Object>> type1List;
    private List<Map<String, Object>> type2List;
    private List<CharactersItem> CharactersList;
}
