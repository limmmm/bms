package com.lim.bms.sys.param.entity;

import com.lim.bms.commons.database.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统参数类型表
 * </p>
 *
 * @author lim
 * @since 2020-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="SysParamType对象", description="系统参数类型表")
public class SysParamType extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "参数类型编码")
    private String code;

    @ApiModelProperty(value = "参数类型名称")
    private String name;

    @ApiModelProperty(value = "参数类型说明")
    private String remark;

    @ApiModelProperty(value = "参数分类{1:核心参数,2:应用参数,3:表单参数}")
    private Integer type;


}
