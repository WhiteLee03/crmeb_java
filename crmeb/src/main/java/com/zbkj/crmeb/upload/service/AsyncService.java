package com.zbkj.crmeb.upload.service;

import com.zbkj.crmeb.system.model.SystemAttachment;

import java.util.List;

/**
 * AsyncService 接口
 * +----------------------------------------------------------------------
 * | CRMEB [ CRMEB赋能开发者，助力企业发展 ]
 * +----------------------------------------------------------------------
 * | Copyright (c) 2016~2020 https://www.crmeb.com All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed CRMEB并不是自由软件，未经许可不能去掉CRMEB相关版权
 * +----------------------------------------------------------------------
 * | Author: CRMEB Team <admin@crmeb.com>
 * +----------------------------------------------------------------------
 */
public interface AsyncService {
    void async(List<SystemAttachment> systemAttachmentList);

    String getCurrentBaseUrl();
}