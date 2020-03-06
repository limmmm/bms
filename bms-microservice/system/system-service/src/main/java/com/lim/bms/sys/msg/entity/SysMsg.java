package com.lim.bms.sys.msg.entity;

import java.time.LocalDateTime;
import com.lim.bms.commons.database.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 个人消息表
 * </p>
 *
 * @author lim
 * @since 2020-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="SysMsg对象", description="个人消息表")
public class SysMsg extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "消息类型编码")
    private String type;

    @ApiModelProperty(value = "消息标题")
    private String title;

    @ApiModelProperty(value = "消息内容")
    private String content;

    @ApiModelProperty(value = "处理链接")
    private String link;

    @ApiModelProperty(value = "推送者id")
    private String providerId;

    @ApiModelProperty(value = "推送者名称")
    private String providerName;

    @ApiModelProperty(value = "推送者机构id")
    private String providerOrgId;

    @ApiModelProperty(value = "推送者机构名称")
    private String providerOrgName;

    @ApiModelProperty(value = "是否已阅{1:是，0:否}")
    private Boolean checked;

    @ApiModelProperty(value = "阅读时间")
    private LocalDateTime checkedTime;

    @ApiModelProperty(value = "附件id")
    private String fileId;

    @ApiModelProperty(value = "附件名称")
    private String fileName;


}
