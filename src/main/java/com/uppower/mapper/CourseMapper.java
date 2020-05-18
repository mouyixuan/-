package com.uppower.mapper;

import com.uppower.domain.Course;
import com.uppower.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/16 21:45
 * @description：课程
 * @modified By：
 * @version: $
 */
@Mapper
@Component(value = "courseMapper")
public interface CourseMapper {


    /**
     * @Description 查询课程
     **/
    @Select("select * from course where cno=#{cno}")
    public Student findCourse(String cno);

    /**
     * @Description 添加课程
     **/
    @Insert("insert into course values(#{cno},#{cname},#{t_no}")
    public void addCourse(Course course);

    /**
     * @Description 修改课程
     **/
    @Update("update course set cno=#{cno},cname=#{cname},t_no=#{t_no}")
    public void updateCourse(Course course);

    /**
     * @Description 删除课程
     **/
    @Delete("delete from course where cno=#{cno}")
    public void deleteCourse(String cno);
}
