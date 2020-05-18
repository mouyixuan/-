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
 * @date ：Created in 2020/5/14 20:24
 * @description：教师表
 * @modified By：
 * @version: $
 */
@ApiModel(value = "教师")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Serializable {

    @ApiModelProperty(value = "教师账户")
    private String tno;

    @ApiModelProperty(value = "教师密码")
    private String tpassword;

    @ApiModelProperty(value = "教师姓名")
    private String tname;

    @ApiModelProperty(value = "教师性别")
    private String tsex;

    @ApiModelProperty(value = "教师职称")
    private String profession;
}
