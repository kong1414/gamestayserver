package cn.edu.xmut.gamestayserver.controller;

import cn.edu.xmut.gamestayserver.dao.*;
import cn.edu.xmut.gamestayserver.pojo.po.BlockItem;
import cn.edu.xmut.gamestayserver.pojo.po.Game;
import cn.edu.xmut.gamestayserver.pojo.po.NewsContent;
import cn.edu.xmut.gamestayserver.pojo.po.NewsItem;
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

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

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

    @ApiOperation("根据name返回数据（单条）Game")
    @GetMapping("/getGameMapperByName")
    public ResultVO getGameMapperByName(@RequestParam String name) {
        Game game = new Game();
        game.setName(name);
        Game res = gameMapper.selectOne(game);
        return new SuccessVO<>(res, "");
    }

    @GetMapping("/getNewsItem")
    public ResultVO getNewsItem(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(newsItemMapper.selectAll().subList(0, num), "");
    }

    @ApiOperation("随机返回count(默认20条)条数据NewsItem")
    @GetMapping("/getNewsItemByRandom")
    public ResultVO getNewsItemByRandom(@RequestParam(defaultValue = "20") int count) {
        List<NewsItem> list = newsItemMapper.selectAll();
        Set<NewsItem> set = new HashSet<NewsItem>();
        Random random = new Random();
        int i;
        while (true) {
            i = random.nextInt(list.size());
            set.add(list.get(i));
            if (set.size() >= count) {
                break;
            }
        }
        return new SuccessVO<>(set, "");
    }


    @ApiOperation("根据news_type返回20条数据NewsItem")
    @GetMapping("/getNewsItemByNewsType")
    public ResultVO getNewsItemByNewsType(@RequestParam String newsType) {
        NewsItem newsItem = new NewsItem();
        newsItem.setNewsType(newsType);
        List<NewsItem> list = newsItemMapper.select(newsItem);
        return new SuccessVO<>(list, "");
    }


    @GetMapping("/getNewsContent")
    public ResultVO getNewsContent(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(newsContentMapper.selectAll().subList(0, num), "");
    }

    @ApiOperation(value = "根据title获取数据NewsContent")
    @GetMapping("/getNewsContentByTitle")
    public ResultVO getNewsContentByTitle(@RequestParam String title) {
        NewsContent newsContent = new NewsContent();
        newsContent.setTitle(title);
        NewsContent res = newsContentMapper.selectOne(newsContent);
        return new SuccessVO<>(res, "");
    }

    @GetMapping("/getStickersContent")
    public ResultVO getStickersContent(@RequestParam(defaultValue = "10") int num) {
        return new SuccessVO<>(stickersContentMapper.selectAll().subList(0, num), "");
    }
}
