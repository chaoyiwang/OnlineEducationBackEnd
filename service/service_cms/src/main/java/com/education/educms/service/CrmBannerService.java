package com.education.educms.service;

import com.education.educms.entity.CrmBanner;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 首页banner表 服务类
 * </p>
 *
 * @author testjava
 * @since 2020-09-21
 */
public interface CrmBannerService extends IService<CrmBanner> {
    //查询所有的banner
    List<CrmBanner> selectAllBanner();
}
