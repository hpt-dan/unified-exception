package com.wanbo.exception.service;

import com.wanbo.exception.dto.CategoryDTO;
import com.wanbo.exception.vo.TestExceptionRequest;

import java.util.List;

public interface ICategoryService {

    CategoryDTO testException(TestExceptionRequest testExceptionRequest);
}
