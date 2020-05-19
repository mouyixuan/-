package com.uppower;

import cn.windyrjc.utils.response.Response;
import com.uppower.domain.Administrators;
import com.uppower.domain.Code;
import com.uppower.domain.Record;
import com.uppower.mapper.*;
import com.uppower.service.AdministratorsService;
import com.uppower.service.CodeService;
import com.uppower.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;
import java.util.Date;

@SpringBootTest
class BootTestApplicationTests {

    @Autowired
    AdministratorsMapper administratorsMapper;
    @Autowired
    CodeMapper codeMapper;
    @Autowired
    CourseMapper courseMapper;
    @Autowired
    RecordMapper recordMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    TeacherMapper teacherMapper;
    @Test
    void contextLoads() {
        System.out.println(administratorsMapper.findAdmin("admin"));
        System.out.println(codeMapper.findCode("1"));
        System.out.println(recordMapper.findRecord());
        System.out.println(courseMapper.findCourseByNo(1));
        System.out.println(studentMapper.findStudent("1840610312"));
        System.out.println(teacherMapper.findTeacher("1001"));

    }

    @Test
    void test1() {
        Record record = new Record(new Date(),1,1,"1840610312");
        recordMapper.addRecord(record);
    }
}
