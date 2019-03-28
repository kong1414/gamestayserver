package cn.edu.xmut.gamestayserver.dao;

import cn.edu.xmut.gamestayserver.pojo.po.CharactersItem;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface CharactersItemMapper extends Mapper<CharactersItem> {
}