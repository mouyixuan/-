package com.uppower.domain;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/14 20:05
 * @description：签到码
 * @modified By：
 * @version: $
 */
@ApiModel(value = "签到码表")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Code implements Serializable {

    @ApiModelProperty(value = "签到码")
    private String no ;

    @ApiModelProperty(value = "签到码生成时间")
    private Date ntime;

    @ApiModelProperty(value = "签到课程")
    private Integer c_no;

    @ApiModelProperty(value = "课程教师")
    private String t_no;

}
