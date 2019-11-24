package com.wanbo.exception.service.impl;

import com.wanbo.exception.common.enums.ExceptionEnum;
import com.wanbo.exception.common.exception.LyException;
import com.wanbo.exception.dto.CategoryDTO;
import com.wanbo.exception.service.ICategoryService;
import com.wanbo.exception.vo.TestExceptionRequest;
import org.springframework.stereotype.Service;

/**
 * @package: com.wanbo.exception.service.impl
 * @version: V1.0
 * @author: Administrator
 * @date: 2019/4/21 22:12
 * @description:
 */
@Service
public class CategoryService implements ICategoryService {

    @Override
    public CategoryDTO testException(TestExceptionRequest testExceptionRequest) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(1L);
        categoryDTO.setIsParent(true);
        categoryDTO.setName("hpt");
        categoryDTO.setSort(1);
        // 判断结果
        if("".equals(testExceptionRequest.getType())){
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FOND);
        }
        return categoryDTO;
    }
}
