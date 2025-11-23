package com.crm.security.utils;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.StrUtil;
import io.lettuce.core.ScriptOutputType;
import jakarta.servlet.http.HttpServletRequest;


/**
 * @author crm
 */
public class TokenUtils {


    /**
     * 生成 AccessToken
     */
    public static String generator() {
        return UUID.fastUUID().toString(true);
    }

    /**
     * 获取 AccessToken
     */
    public static String getAccessToken(HttpServletRequest request) {
        String accessToken = request.getHeader("Authorization");
        if (StrUtil.isBlank(accessToken)) {
            accessToken = request.getParameter("access_token");
        }
        System.out.println("accessToken:" + accessToken);

        return accessToken;
    }
}
