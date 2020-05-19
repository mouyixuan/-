package com.uppower.service;

import cn.windyrjc.utils.response.Response;
import com.uppower.domain.Code;
import com.uppower.mapper.CodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/18 22:11
 * @description：签到码生成
 * @modified By：
 * @version: $
 */
@Service
public class CodeService {

    @Autowired
    private CodeMapper codeMapper;

    public Response codecreate(Code code){
        codeMapper.addCode(code);
        return Response.success();
    }

    public Response codedelete(String no){
        codeMapper.deleteCode(no);
        return Response.success();
    }

    public Response codefind(String no){
        Code code = codeMapper.findCode(no);
        System.out.println(code);
        return Response.success(code);
    }
}
