package com.uppower.service;

import cn.windyrjc.utils.response.Response;
import com.uppower.domain.Administrators;
import com.uppower.exception.UserException;
import com.uppower.mapper.AdministratorsMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/18 10:20
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class AdministratorsService {

    @Autowired
    AdministratorsMapper administratorsMapper;

    public Response administratorslogin(Administrators administrators){
        if (administrators.getAno().equals("") || administrators.getApassword().equals("")){
            throw  new UserException("账号或密码为空");
        }
        Administrators admin = administratorsMapper.findAdmin(administrators.getAno());
        if (admin.getAno().equals(administrators.getAno()) && admin.getApassword().equals(administrators.getApassword())) {
            return Response.success();
        } else {
            throw  new UserException("用户名或密码错误");
        }
    }

    public Response administratorsadd(Administrators administrators){
        if (administratorsMapper.findAdmin(administrators.getAno()).getAno()==administrators.getAno()){
            throw new UserException("此管理员账号已存在");
        }
        administratorsMapper.addAdmin(administrators);
        return Response.success();
    }

    public Response administratorsupdate(Administrators administrators){
        if (administratorsMapper.findAdmin(administrators.getApassword()).getApassword()==administrators.getApassword()){
            throw new UserException("新密码不能原密码相同");
        }
        administratorsMapper.updateAdmin(administrators);
        return Response.success();
    }

    public Response administrators (Administrators administrators){
        administratorsMapper.deleteAdimin(administrators.getAno());
        return Response.success();
    }
}
