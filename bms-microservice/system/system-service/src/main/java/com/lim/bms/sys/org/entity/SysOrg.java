package com.lim.bms.sys.org.entity;

import com.lim.bms.commons.database.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 机构信息表
 * </p>
 *
 * @author lim
 * @since 2020-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="SysOrg对象", description="机构信息表")
public class SysOrg extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "机构编码")
    private String code;

    @ApiModelProperty(value = "机构名称")
    private String name;

    @ApiModelProperty(value = "机构全称")
    private String fullName;

    @ApiModelProperty(value = "机构描述")
    private String remark;

    @ApiModelProperty(value = "一级机构id")
    private String orgIdOne;

    @ApiModelProperty(value = "二级机构id")
    private String orgIdTwo;

    @ApiModelProperty(value = "三级机构id")
    private String orgIdThree;

    @ApiModelProperty(value = "四级机构id")
    private String orgIdFour;

    @ApiModelProperty(value = "五级机构id")
    private String orgIdFive;

    @ApiModelProperty(value = "六级机构id")
    private String orgIdSix;

    @ApiModelProperty(value = "七级机构id")
    private String orgIdSeven;

    @ApiModelProperty(value = "层级")
    private Integer level;

    @ApiModelProperty(value = "排序")
    private Integer ordinal;


}
