package com.uppower.service;

import cn.windyrjc.utils.response.Response;
import com.uppower.domain.Course;
import com.uppower.domain.Student;
import com.uppower.exception.MyException;
import com.uppower.mapper.CourseMapper;
import com.uppower.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/18 10:20
 * @description：
 * @modified By：
 * @version: $
 */
@Service
@Slf4j
public class CourseService {

    @Autowired
    private CourseMapper courseMapper;

    public Response coursecheck(Course course){
        if (course.getCno().equals("")){
            log.error("请输入课程号");
            throw new MyException("请输入课程号");
        }
        courseMapper.findCourseByNo(course.getCno());
        return Response.success();
    }

    @Transactional(rollbackFor = Exception.class)
    public Response courseadd(Course course){
        if (courseMapper.findCourseByNo(course.getCno())!=null){
            log.error("此课程号已存在");
            throw new MyException("此课程号已存在");
        }
        courseMapper.addCourse(course);
        return Response.success();
    }

    public Response courseupdate(Course course){
        courseMapper.updateCourse(course);
        return Response.success();
    }

    public Response studentdelete (Course course){
        courseMapper.deleteCourse(course.getCno());
        return Response.success();
    }
}
