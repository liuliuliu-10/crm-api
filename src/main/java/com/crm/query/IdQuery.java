package com.crm.query;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @Author: liuliu
 * @Date: 2025/10/12
 */

@Data
public class IdQuery {

    @NotNull(message = "id不能为空")
    private Integer id;
}
