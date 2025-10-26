package com.crm.schedule;

import com.crm.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: liuliu
 * @Date: 2025/10/26
 */
@Component
@AllArgsConstructor
public class TimerJob {
    private final ProductService productService;

    @Scheduled(fixedRate = 1000 * 60)
    public void batchUpdateProductState() {
        System.out.println("==============定时任务执行============");
        productService.batchUpdateProductState();
    }
}
