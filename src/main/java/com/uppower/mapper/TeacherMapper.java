package com.uppower.mapper;

import com.uppower.domain.Administrators;
import com.uppower.domain.Student;
import com.uppower.domain.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/15 14:58
 * @description：教师
 * @modified By：
 * @version: $
 */
@Mapper
@Component(value = "teacherMapper")
public interface TeacherMapper {

    /**
     * @Description 查询教师账号
     **/
    @Select("select * from teacher where tno=#{tno}")
    @Results({
            @Result(property = "tno",  column = "tno"),
            @Result(property = "tpassword",  column = "tpassword"),
            @Result(property = "tname",  column = "tname"),
            @Result(property = "tsex",  column = "tsex"),
            @Result(property = "profession",  column = "profession")
    })
    public Teacher findTeacher(String tno);

    /**
     * @Description 添加教师账号
     **/
    @Insert("insert into teacher values(#{tno},#{tpassword},#{tname},#{tsex})")
    public void addTeacher(Teacher teacher);

    /**
     * @Description 修改教师密码
     **/
    @Update("update teacher set tpassword=#{tpassword} where tno=#{tno}")
    public void updateAdmin(Teacher teacher);

    /**
     * @Description 注销教师账户
     **/
    @Delete("delete from teacher where tno=#{tno}")
    public void deleteAdimin(String tno);
}
