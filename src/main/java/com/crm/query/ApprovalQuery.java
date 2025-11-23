package com.crm.query;

import com.crm.common.model.Query;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @Author: liuliu
 * @Date: 2025/11/16
 */
@Data
public class ApprovalQuery {
    @NotNull(message = "审核id不能为空")
    private Integer id;
    @NotNull(message = "审核状态不能为空")
    private Integer type;
}
