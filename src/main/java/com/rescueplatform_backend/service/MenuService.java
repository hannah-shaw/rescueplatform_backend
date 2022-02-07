package com.rescueplatform_backend.service;

import com.rescueplatform_backend.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hannah
 * @since 2022-02-03
 */
public interface MenuService extends IService<Menu> {
    /**
     * 根据用户ID查询菜单列表
     * @return
     */
    List<Menu> getMenuByAdminId();
}
