package cn.edu.xmut.gamestayserver.dao;

import cn.edu.xmut.gamestayserver.pojo.po.Account;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface AccountMapper extends Mapper<Account> {
}