package com.crm.service;

import com.crm.vo.FileUrlVO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: liuliu
 * @Date: 2025/10/26
 */

public interface CommonService {
    /**
     * 文件上传
     * @param multipartFile
     * @return
     */
    FileUrlVO upload(MultipartFile multipartFile);
}
