package com.lim.bms.sys.param.entity;

import com.lim.bms.commons.database.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统参数表
 * </p>
 *
 * @author lim
 * @since 2020-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="SysParam对象", description="系统参数表")
public class SysParam extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "参数类型id")
    private String typeId;

    @ApiModelProperty(value = "参数编码")
    private String code;

    @ApiModelProperty(value = "参数值")
    private String value;

    @ApiModelProperty(value = "参数名称")
    private String name;

    @ApiModelProperty(value = "参数说明")
    private String remark;


}
