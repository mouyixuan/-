package com.uppower;

import cn.windyrjc.utils.response.Response;
import com.uppower.domain.Code;
import com.uppower.mapper.CodeMapper;
import com.uppower.service.CodeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class BootTestApplicationTests {

    @Autowired
    CodeService codeService;

    @Test
    void contextLoads() {
        Response response = codeService.codefind("1");
    }
}
