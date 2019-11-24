package com.wanbo.exception.controller;

import com.wanbo.exception.dto.CategoryDTO;
import com.wanbo.exception.service.impl.CategoryService;
import com.wanbo.exception.vo.TestExceptionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("exception")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("testException")
    public ResponseEntity<CategoryDTO>  testException(@RequestBody TestExceptionRequest testExceptionRequest){
        return ResponseEntity.ok(categoryService.testException(testExceptionRequest));
    }
}