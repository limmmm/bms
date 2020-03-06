package com.lim.bms.sys.user.module.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户信息分页查询
 * </p>
 *
 * @author lim
 * @since 2020-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysUserPageDto extends Page {

    @ApiModelProperty(value = "账号名")
    private String account;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "性别")
    private Boolean sex;

    @ApiModelProperty(value = "手机号国家编码")
    private String phoneNationCode;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "固话")
    private String tel;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "身份证号")
    private String idNumber;

}
