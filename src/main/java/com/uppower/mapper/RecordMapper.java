package com.uppower.mapper;

import com.uppower.domain.Record;
import com.uppower.domain.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/16 23:37
 * @description：签到记录
 * @modified By：
 * @version: $
 */
@Mapper
@Component(value = "recordMapper")
public interface RecordMapper {

    /**
     * @Description 查询签到记录
     **/
    @Select("select * from record")
    @Results({
            @Result(property = "rtime",  column = "rtime"),
            @Result(property = "score",  column = "score"),
            @Result(property = "c_no",  column = "c_no"),
            @Result(property = "s_no",  column = "s_no")
    })
    public Record findRecord();

    /**
     * @Description 添加签到记录
     **/
    @Insert("insert into record values(#{rtime},#{score},#{c_no},#{s_no})")
    public void addRecord(Record record);

    /**
     * @Description 修改签到记录
     **/
    @Update("update record set score=#{score} where rtime=#{rtime},s_no=#{s_no}")
    public void updateRecord(Record record);
}
