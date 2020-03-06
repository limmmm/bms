package com.lim.bms.sys.template.entity;

import com.lim.bms.commons.database.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统模板表
 * </p>
 *
 * @author lim
 * @since 2020-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="SysTemplate对象", description="系统模板表")
public class SysTemplate extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "模板编码")
    private String code;

    @ApiModelProperty(value = "模板名称")
    private String name;

    @ApiModelProperty(value = "模板说明")
    private String remark;

    @ApiModelProperty(value = "模板内容")
    private String content;


}
