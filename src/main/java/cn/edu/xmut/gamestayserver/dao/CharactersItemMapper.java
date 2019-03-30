package cn.edu.xmut.gamestayserver.dao;

import cn.edu.xmut.gamestayserver.pojo.po.CharactersItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface CharactersItemMapper extends Mapper<CharactersItem> {

    List<Map<String, Object>> getTypeOne(@Param("comeFrom") String comeFrom);

    List<Map<String, Object>> getTypeTwo(@Param("comeFrom") String comeFrom);
}