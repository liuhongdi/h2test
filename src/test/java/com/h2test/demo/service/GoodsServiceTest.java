package com.h2test.demo.service;

import com.h2test.demo.pojo.Goods;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doReturn;

@ActiveProfiles("dev")
@SpringBootTest
class GoodsServiceTest {

    @Autowired
    GoodsService goodsService;

    @Test
    @DisplayName("商品service:得到一件商品")
    void getOneGoodsById() {
        Goods goodsRet = goodsService.getOneGoodsById(13L);
        assertThat(goodsRet.getGoodsId(), equalTo(13L));
    }

    @Test
    @DisplayName("商品service:测试添加一件商品")
    void addOneGoods() {
        Goods goodsOne = new Goods();
        //goodsOne.setGoodsId(13L);
        goodsOne.setGoodsName("商品名称");
        goodsOne.setSubject("商品描述");
        goodsOne.setPrice(new BigDecimal(101));
        goodsOne.setStock(13);

        Long goodsId = goodsService.addOneGoods(goodsOne);
        assertThat(goodsId, equalTo(14L));

        Goods goodsRet = goodsService.getOneGoodsById(14L);
        assertThat(goodsRet.getGoodsId(), equalTo(14L));
    }
}