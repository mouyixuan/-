package com.uppower.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/14 19:52
 * @description：管理员
 * @modified By：
 * @version: $
 */
@ApiModel(value = "管理员")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Administrators {

    @ApiModelProperty(value = "管理员账户")
    private String ano;

    @ApiModelProperty(value = "管理员密码")
    private String apassword;
}
