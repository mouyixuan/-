package com.uppower.domain;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/14 20:21
 * @description：学生表
 * @modified By：
 * @version: $
 */
@ApiModel(value = "学生")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    @ApiModelProperty("学生账户")
    private String sno;

    @ApiModelProperty("学生密码")
    private String spassword;

    @ApiModelProperty("学生姓名")
    private String sname;

    @ApiModelProperty("学生性别")
    private String ssex;
}
