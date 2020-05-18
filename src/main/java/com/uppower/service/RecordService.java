package com.uppower.service;

import cn.windyrjc.utils.response.Response;
import com.uppower.domain.Record;
import com.uppower.mapper.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/18 22:22
 * @description：签到记录
 * @modified By：
 * @version: $
 */
@Service
public class RecordService {

    @Autowired
    private RecordMapper recordMapper;

    public Response recordadd(Record record){
        recordMapper.addRecord(record);
        return Response.success();
    }

    public Response responsecheck(){
        Record record = recordMapper.findRecord();
        return Response.success(record);
    }
}
