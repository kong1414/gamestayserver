package cn.edu.xmut.gamestayserver.service.impl;

import cn.edu.xmut.gamestayserver.dao.CharactersItemMapper;
import cn.edu.xmut.gamestayserver.pojo.po.CharactersItem;
import cn.edu.xmut.gamestayserver.pojo.vo.CharactersItemRes;
import cn.edu.xmut.gamestayserver.pojo.vo.ResultVO;
import cn.edu.xmut.gamestayserver.pojo.vo.SuccessVO;
import cn.edu.xmut.gamestayserver.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    CharactersItemMapper charactersItemMapper;

    @Override
    public ResultVO getType(String comeFrom) {
        List<Map<String, Object>> list1 = charactersItemMapper.getTypeOne(comeFrom);
        List<Map<String, Object>> list2 = charactersItemMapper.getTypeTwo(comeFrom);
        CharactersItemRes res = new CharactersItemRes();
        res.setComeFrom(comeFrom);
        res.setType1List(list1);
        res.setType2List(list2);

        CharactersItem record = new CharactersItem();
        record.setComeFrom(comeFrom);
        List<CharactersItem> list = charactersItemMapper.select(record);
        res.setCharactersList(list);
        return new SuccessVO(res, "");
    }
}
