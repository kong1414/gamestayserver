package cn.edu.xmut.gamestayserver.dao;

import cn.edu.xmut.gamestayserver.pojo.po.Game;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface GameMapper extends Mapper<Game> {
}