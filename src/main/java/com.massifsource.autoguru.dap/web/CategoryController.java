/**
 * Copyright 2015 MassifSource
 *
 * @author Nikolay Sarychev <nikolaysarychev@gmail.com>
 */
package com.massifsource.autoguru.dap.web;

import com.massifsource.autoguru.dap.model.Category;
import com.massifsource.autoguru.dap.model.City;
import com.massifsource.autoguru.dap.repository.CategoryRepository;
import com.massifsource.autoguru.dap.repository.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryController.class);
    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(value = "/{id}")
    public Category findOne(@PathVariable("id") Integer id) {
        LOGGER.debug("Retrieving category for id {}", id);
        return categoryRepository.findOne(id);
    }

    @RequestMapping
    public Page<Category> findOne(Pageable pageable) {
        LOGGER.debug("Retrieving all categories for pageable {}", pageable);
        return categoryRepository.findAll(pageable);
    }

}
