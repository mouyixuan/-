package com.uppower.mapper;

import com.uppower.domain.Administrators;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/15 10:56
 * @description：管理员
 * @modified By：
 * @version: $
 */
@Mapper
@Component(value = "administratorsMapper")
public interface AdministratorsMapper {


    /**
     * @Description 查询管理员账户
     **/
    @Select("select * from administrators where ano=#{ano}")
    @Results({
            @Result(property = "ano",  column = "ano"),
            @Result(property = "apassword",  column = "apassword"),
    })
    public Administrators findAdmin(String ano);

     /**
      * @Description 添加管理员用户
      **/
    @Insert("insert into administrators values(#{ano},#{apassword})")
    public void addAdmin(Administrators administrators);

     /**
      * @Description 修改管理员密码
      **/
    @Update("update administrators set apassword=#{apassword} where ano=#{ano}")
    public void updateAdmin(Administrators administrators);

     /**
      * @Description 注销管理员账户
      **/
    @Delete("delete from administrators where ano=#{ano}")
    public void deleteAdimin(String ano);

}
