package cn.edu.xmut.gamestayserver.service;

import cn.edu.xmut.gamestayserver.pojo.vo.ResultVO;
import org.springframework.stereotype.Service;

@Service
public interface IndexService {
    ResultVO getType(String comeFrom);
}
