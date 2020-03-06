package com.lim.bms.sys.menu.entity;

import com.lim.bms.commons.database.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 菜单信息表
 * </p>
 *
 * @author lim
 * @since 2020-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="SysMenu对象", description="菜单信息表")
public class SysMenu extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "菜单编码")
    private String code;

    @ApiModelProperty(value = "菜单名称")
    private String name;

    @ApiModelProperty(value = "菜单说明")
    private String remark;

    @ApiModelProperty(value = "菜单全称")
    private String fullName;

    @ApiModelProperty(value = "菜单路径")
    private String path;

    @ApiModelProperty(value = "菜单图标编码")
    private String icon;

    @ApiModelProperty(value = "一级菜单id")
    private String menuIdOne;

    @ApiModelProperty(value = "二级菜单id")
    private String menuIdTwo;

    @ApiModelProperty(value = "三级菜单id")
    private String menuIdThree;

    @ApiModelProperty(value = "层级")
    private Integer level;

    @ApiModelProperty(value = "排序")
    private Integer ordinal;


}
