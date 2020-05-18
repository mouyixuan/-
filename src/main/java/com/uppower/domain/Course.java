package com.uppower.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/14 20:01
 * @description：课程表
 * @modified By：
 * @version: $
 */
@ApiModel(value = "课程表")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {

    @ApiModelProperty(value = "课程号")
    private Integer cno;

    @ApiModelProperty(value = "课程名")
    private String cname;

    @ApiModelProperty(value = "授课教师编号")
    private String t_no;

}
