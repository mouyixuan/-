package com.uppower.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/14 20:13
 * @description：签到记录
 * @modified By：
 * @version: $
 */
@ApiModel(value = "签到记录")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Record {

    @ApiModelProperty("签到时间")
    private Date rtime;

    @ApiModelProperty("签到情况 1=正常 0=迟到 3=旷课")
    private Integer score;

    @ApiModelProperty("签到课程")
    private Integer c_no;

    @ApiModelProperty("签到学生")
    private String s_on;
}
