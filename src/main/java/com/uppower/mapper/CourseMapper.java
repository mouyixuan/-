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
     * @Description 通过课程号查询课程
     **/
    @Select("select * from course where cno=#{cno}")
    @Results({
            @Result(property = "cno",  column = "cno"),
            @Result(property = "cname",  column = "cname"),
            @Result(property = "t_no",  column = "t_no"),
    })
    public Course findCourseByNo(Integer cno);

    /**
     * @Description 通过课程名查询课程
     **/
    @Select("select * from course where cname=#{cname}")
    @Results({
            @Result(property = "cno",  column = "cno"),
            @Result(property = "cname",  column = "cname"),
            @Result(property = "t_no",  column = "t_no")
    })
    public Course findCourseByName(String cname);

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
    public void deleteCourse(Integer cno);
}
