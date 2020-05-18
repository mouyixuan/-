package com.uppower.service;

import cn.windyrjc.utils.response.Response;
import com.uppower.domain.Administrators;
import com.uppower.exception.MyException;
import com.uppower.mapper.AdministratorsMapper;

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
public class AdministratorsService {

    @Autowired
    private AdministratorsMapper administratorsMapper;

    public Response administratorslogin(Administrators administrators){
        if (administrators.getAno().equals("") || administrators.getApassword().equals("")){
            log.error("账号或密码为空");
            throw  new MyException("账号或密码为空");
        }
        Administrators admin = administratorsMapper.findAdmin(administrators.getAno());
        if (admin.getAno().equals(administrators.getAno()) && admin.getApassword().equals(administrators.getApassword())) {
            return Response.success();
        } else {
            log.error("用户名或密码错误");
            throw  new MyException("用户名或密码错误");
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public Response administratorsadd(Administrators administrators){
        if (administratorsMapper.findAdmin(administrators.getAno())!=null){
            log.error("此管理员账号已存在");
            throw new MyException("此管理员账号已存在");
        }
        administratorsMapper.addAdmin(administrators);
        return Response.success();
    }

    public Response administratorsupdate(Administrators administrators){
        if (administratorsMapper.findAdmin(administrators.getApassword()).getApassword()==administrators.getApassword()){
            log.error("新密码不能原密码相同");
            throw new MyException("新密码不能原密码相同");
        }
        administratorsMapper.updateAdmin(administrators);
        return Response.success();
    }

    public Response administratorsdelete (Administrators administrators){
        administratorsMapper.deleteAdimin(administrators.getAno());
        return Response.success();
    }
}
