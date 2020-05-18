package com.uppower.mapper;

import com.uppower.domain.Number;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/16 23:21
 * @description：签到码
 * @modified By：
 * @version: $
 */
@Mapper
@Component(value = "numberMapper")
public interface NumberMapper {

     /**
      * @Description 查询签到信息
      **/
    @Select("select * from number where no=#{no}")
    public Number findNumber(Number number);

     /**
      * @Description 签到码生成
      **/
    @Insert("insert into number values(#{no},#{ntime},#{c_no},#{t_no})")
    public void addNumber(Number number);
}
