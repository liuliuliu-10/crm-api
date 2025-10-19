package com.crm.convert;

import com.crm.entity.Customer;
import com.crm.vo.CustomerVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.zip.Inflater;

/**
 * @Author: liuliu
 * @Date: 2025/10/19
 */
@Mapper
public interface CustomerConvert {
    CustomerConvert INSTANCE = Mappers.getMapper(CustomerConvert.class);

    Customer convert(CustomerVO customerVO);
}
