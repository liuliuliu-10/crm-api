package com.crm.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.crm.utils.DateUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: liuliu
 * @Date: 2025/10/26
 */
@Data
public class ProductVO {

    @Schema(description = "主键")
    private Integer id;

    @Schema(description = "商品名称")
    @NotBlank(message = "商品名称不能为空")
    @ExcelProperty("商品名称")
    private String name;

    @Schema(description = "价格")
    @NotBlank(message = "价格不能为空")
    @ExcelProperty("价格")
    private BigDecimal price;

    @Schema(description = "销量")
    @ExcelProperty("销量")
    private Integer sales;

    @Schema(description = "库存")
    @ExcelProperty("库存")
    private Integer stock;

    @Schema(description = "商品状态 0-初始化，1-上架，2-下架")
    private Byte status;

    @Schema(description = "封面图")
    private String coverImage;

    @Schema(description = "商品简介")
    private String description;

    @Schema(description = "逻辑删除 0-未删除，1-已删除")
    private Byte deleteFlag;

    @Schema(description = "创建时间")
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    private LocalDateTime updateTime;
}
