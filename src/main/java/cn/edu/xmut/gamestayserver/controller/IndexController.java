package cn.edu.xmut.gamestayserver.controller;

import cn.edu.xmut.gamestayserver.dao.*;
import cn.edu.xmut.gamestayserver.pojo.po.BlockItem;
import cn.edu.xmut.gamestayserver.pojo.vo.ResultVO;
import cn.edu.xmut.gamestayserver.pojo.vo.SuccessVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Api(description = "主模块")
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private BlockItemMapper blockItemMapper;
    @Autowired
    private BlockStickersMapper blockStickersMapper;
    @Autowired
    private CharactersItemMapper charactersItemMapper;
    @Autowired
    private GameMapper gameMapper;
    @Autowired
    private NewsContentMapper newsContentMapper;
    @Autowired
    private NewsItemMapper newsItemMapper;
    @Autowired
    private StickersContentMapper stickersContentMapper;

    @ApiOperation(value = "账户")
    @GetMapping("/getAccount")
    public ResultVO getAccount(@RequestParam(defaultValue = "10") int num) {

        return new SuccessVO<>(accountMapper.selectAll().subList(0, num), "");
    }

    @ApiOperation(value = "贴吧")
    @GetMapping("/getBlockStickers")
    public ResultVO getBlockStickers(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(blockStickersMapper.selectAll().subList(0, num), "");
    }

    @GetMapping("/getBlockItem")
    public ResultVO getBlockItem(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(blockItemMapper.selectAll().subList(0, num), "");
    }

    @ApiOperation(value = "根据type返回数据BlockItem（全部）")
    @GetMapping("/getBlockItemByType")
    public ResultVO getBlockItemByType(@RequestParam(required = false) List<String> type) {
        List<BlockItem> list;
        if (type == null || type.size() == 0) {
            list = blockItemMapper.selectAll();
        } else {
            BlockItem blockItem = new BlockItem();
            Example example = new Example(BlockItem.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andIn("type", type);
            list = blockItemMapper.selectByExample(example);
        }

        return new SuccessVO<>(list, "");
    }

    @GetMapping("/getCharactersItem")
    public ResultVO getCharactersItem(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(charactersItemMapper.selectAll().subList(0, num), "");
    }

    @GetMapping("/getGameMapper")
    public ResultVO getGame(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(gameMapper.selectAll().subList(0, num), "");
    }

    @GetMapping("/getNewsItem")
    public ResultVO getNewsItem(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(newsItemMapper.selectAll().subList(0, num), "");
    }

    @GetMapping("/getNewsContent")
    public ResultVO getNewsContent(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(newsContentMapper.selectAll().subList(0, num), "");
    }

    @GetMapping("/getStickersContent")
    public ResultVO getStickersContent(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(stickersContentMapper.selectAll().subList(0, num), "");
    }
}
