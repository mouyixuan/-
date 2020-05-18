package com.uppower;

import cn.windyrjc.utils.response.Response;
import com.uppower.domain.Administrators;
import com.uppower.mapper.AdministratorsMapper;
import com.uppower.service.AdministratorsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootTestApplicationTests {

    @Autowired
    AdministratorsService administratorsService;

    @Test
    void contextLoads() {
        Administrators ak = new Administrators("ak", "47");
        Response administratorsadd = administratorsService.administratorsadd(ak);
        administratorsadd.getMsg();
    }
}
