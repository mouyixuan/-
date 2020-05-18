package com.uppower.mapper;

import com.uppower.domain.Code;
import org.apache.ibatis.annotations.Delete;
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
public interface CodeMapper {

     /**
      * @Description 查询签到信息
      **/
    @Select("select * from code where no=#{no}")
    public Code findCode(String no);

     /**
      * @Description 签到码生成
      **/
    @Insert("insert into code values(#{no},#{ntime},#{c_no},#{t_no})")
    public void addCode(Code code);

     /**
      * @Description 签到码删除
      **/
     @Delete("delete from code where no=#{no}")
    public void deleteCode(String no);
}
