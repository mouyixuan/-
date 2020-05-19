package com.uppower.mapper;

import com.uppower.domain.Administrators;
import com.uppower.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/15 12:03
 * @description：学生
 * @modified By：
 * @version: $
 */
@Mapper
@Component(value = "studentMapper")
public interface StudentMapper {

    /**
     * @Description 查询学生账号
     **/
    @Select("select * from student where sno=#{sno}")
    @Results({
            @Result(property = "sno",  column = "sno"),
            @Result(property = "spassword",  column = "spassword"),
            @Result(property = "sname",  column = "sname"),
            @Result(property = "ssex",  column = "ssex")
    })
    public Student findStudent(String sno);

    /**
     * @Description 添加学生账号
     **/
    @Insert("insert into student values(#{sno},#{spassword},#{sname},#{ssex})")
    public void addStudent(Student student);

    /**
     * @Description 修改学生密码
     **/
    @Update("update administrators set spassword=#{spassword} where sno=#{sno}")
    public void updateAdmin(Student student);

    /**
     * @Description 注销学生账户
     **/
    @Delete("delete from student where sno=#{sno}")
    public void deleteAdimin(String sno);
}
