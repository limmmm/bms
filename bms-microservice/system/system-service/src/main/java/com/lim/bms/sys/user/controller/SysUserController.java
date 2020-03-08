package com.lim.bms.sys.user.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lim.bms.commons.result.ResultAssert;
import com.lim.bms.commons.result.ResultVO;
import com.lim.bms.commons.result.ResultVOUtil;
import com.lim.bms.sys.user.entity.SysUser;
import com.lim.bms.sys.user.module.dto.SysUserPageDto;
import com.lim.bms.sys.user.service.ISysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author lim
 * @since 2020-03-06
 */
@RestController
@RequestMapping("/sys/user")
public class SysUserController {

    private final ISysUserService sysUserService;

    public SysUserController(ISysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    /**
     * 条件分页查询
     * @return List<User>
     */
    @GetMapping("/page")
    public ResultVO<IPage<SysUser>> page(SysUserPageDto pageDto) {
//        ResultAssert.error(false);
        return ResultVOUtil.success(sysUserService.pageCondition(pageDto));
    }


}
