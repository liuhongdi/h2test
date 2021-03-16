package com.h2test.demo.mapper;

import com.h2test.demo.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GoodsMapper {
    Goods selectOneGoods(Long goodsId);
    int insertOneGoods(Goods goods);
    int updateOneGoods(Goods goods);
}
