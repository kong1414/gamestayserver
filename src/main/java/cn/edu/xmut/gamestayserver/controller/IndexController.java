package cn.edu.xmut.gamestayserver.controller;

import cn.edu.xmut.gamestayserver.dao.*;
import cn.edu.xmut.gamestayserver.pojo.vo.ResultVO;
import cn.edu.xmut.gamestayserver.pojo.vo.SuccessVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/getBlockStickersMapper")
    public ResultVO getBlockStickersMapper(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(blockStickersMapper.selectAll().subList(0, num), "");
    }

    @GetMapping("/getBlockItem")
    public ResultVO getBlockItem(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(blockItemMapper.selectAll().subList(0, num), "");
    }

    @GetMapping("/getCharactersItemMapper")
    public ResultVO getCharactersItemMapper(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(charactersItemMapper.selectAll().subList(0, num), "");
    }

    @GetMapping("/getGameMapper")
    public ResultVO getGameMapper(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(gameMapper.selectAll().subList(0, num), "");
    }

    @GetMapping("/getNewsItemMapper")
    public ResultVO getNewsItemMapper(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(newsItemMapper.selectAll().subList(0, num), "");
    }

    @GetMapping("/getNewsContentMapper")
    public ResultVO getNewsContentMapper(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(newsContentMapper.selectAll().subList(0, num), "");
    }

    @GetMapping("/getStickersContentMapper")
    public ResultVO getStickersContentMapper(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(stickersContentMapper.selectAll().subList(0, num), "");
    }
}
