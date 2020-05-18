package com.uppower.service;

import cn.windyrjc.utils.response.Response;
import com.uppower.domain.Administrators;
import com.uppower.domain.Student;
import com.uppower.domain.Teacher;
import com.uppower.exception.MyException;
import com.uppower.mapper.AdministratorsMapper;
import com.uppower.mapper.TeacherMapper;
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
public class TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    public Response teacherlogin(Teacher teacher){
        if (teacher.getTno().equals("") || teacher.getTpassword().equals("")){
            log.error("账号或密码为空");
            throw  new MyException("账号或密码为空");
        }
        Teacher mapperTeacher = teacherMapper.findTeacher(teacher.getTno());
        if (teacher.getTno().equals(teacher.getTno()) && teacher.getTpassword().equals(teacher.getTpassword())) {
            return Response.success();
        } else {
            log.error("用户名或密码错误");
            throw  new MyException("用户名或密码错误");
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public Response teacheradd(Teacher teacher){
        if (teacherMapper.findTeacher(teacher.getTno())!=null){
            log.error("此教师账号已存在");
            throw new MyException("此教师账号已存在");
        }
        teacherMapper.addTeacher(teacher);
        return Response.success();
    }

    public Response teacherupdate(Teacher teacher){
        if (teacherMapper.findTeacher(teacher.getTpassword()).getTpassword() == teacher.getTpassword()){
            log.error("新密码不能原密码相同");
            throw new MyException("新密码不能原密码相同");
        }
        teacherMapper.updateAdmin(teacher);
        return Response.success();
    }

    public Response teacherdelete (Teacher teacher){
        teacherMapper.deleteAdimin(teacher.getTno());
        return Response.success();
    }
}
