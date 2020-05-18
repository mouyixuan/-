package com.uppower.service;

import cn.windyrjc.utils.response.Response;
import com.uppower.domain.Administrators;
import com.uppower.domain.Student;
import com.uppower.exception.MyException;
import com.uppower.mapper.AdministratorsMapper;
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
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public Response studentlogin(Student student){
        if (student.getSno().equals("") || student.getSpassword().equals("")){
            log.error("账号或密码为空");
            throw new MyException("账号或密码为空");
        }
        Student mapperStudent = studentMapper.findStudent(student.getSno());
        if (mapperStudent.getSno().equals(mapperStudent.getSno()) && mapperStudent.getSpassword().equals(mapperStudent.getSpassword())) {
            return Response.success();
        } else {
            log.error("用户名或密码错误");
            throw new MyException("用户名或密码错误");
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public Response studentadd(Student student){
        if (studentMapper.findStudent(student.getSno())!=null){
            log.error("此学生账号已存在");
            throw new MyException("此学生账号已存在");
        }
        studentMapper.addStudent(student);
        return Response.success();
    }

    public Response studentupdate(Student student){
        if (studentMapper.findStudent(student.getSpassword()).getSpassword() == student.getSpassword()){
            log.error("新密码不能原密码相同");
            throw new MyException("新密码不能原密码相同");
        }
        studentMapper.updateAdmin(student);
        return Response.success();
    }

    public Response studentdelete (Student student){
        studentMapper.deleteAdimin(student.getSno());
        return Response.success();
    }
}
