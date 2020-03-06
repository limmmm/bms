package com.lim.bms.sys.menu.entity;

import com.lim.bms.commons.database.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 按钮信息表
 * </p>
 *
 * @author lim
 * @since 2020-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="SysBtn对象", description="按钮信息表")
public class SysBtn extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "按钮编码")
    private String code;

    @ApiModelProperty(value = "按钮名称")
    private String name;

    @ApiModelProperty(value = "按钮图标")
    private String icon;


}
