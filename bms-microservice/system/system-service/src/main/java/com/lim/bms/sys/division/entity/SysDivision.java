package com.lim.bms.sys.division.entity;

import com.lim.bms.commons.database.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 行政区划信息表
 * </p>
 *
 * @author lim
 * @since 2020-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="SysDivision对象", description="行政区划信息表")
public class SysDivision extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "行政区编码")
    private String code;

    @ApiModelProperty(value = "行政区名称")
    private String name;

    @ApiModelProperty(value = "行政区英文名称")
    private String enName;

    @ApiModelProperty(value = "行政区全称")
    private String fullName;

    @ApiModelProperty(value = "行政区说明")
    private String remark;

    @ApiModelProperty(value = "一级行政区id")
    private String divisionIdOne;

    @ApiModelProperty(value = "二级行政区id")
    private String divisionIdTwo;

    @ApiModelProperty(value = "三级行政区id")
    private String divisionIdThree;

    @ApiModelProperty(value = "四级行政区id")
    private String divisionIdFour;

    @ApiModelProperty(value = "五级行政区id")
    private String divisionIdFive;

    @ApiModelProperty(value = "六级行政区id")
    private String divisionIdSix;

    @ApiModelProperty(value = "七级行政区id")
    private String divisionIdSeven;


}
