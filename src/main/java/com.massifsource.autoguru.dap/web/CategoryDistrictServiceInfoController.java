/**
 * Copyright 2015 MassifSource
 *
 * @author Nikolay Sarychev <nikolaysarychev@gmail.com>
 */
package com.massifsource.autoguru.dap.web;

import com.massifsource.autoguru.dap.model.CategoryDistrictServiceInfo;
import com.massifsource.autoguru.dap.repository.CategoryDistrictServiceInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/category_district_service_infos")
public class CategoryDistrictServiceInfoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryDistrictServiceInfoController.class);
    @Autowired
    private CategoryDistrictServiceInfoRepository categoryDistrictServiceInfoRepository;

    @RequestMapping(value = "/{id}")
    public CategoryDistrictServiceInfo findOne(@PathVariable("id") Integer id) {
        LOGGER.debug("Retrieving district_service_info for id {}", id);
        return categoryDistrictServiceInfoRepository.findOne(id);
    }

    @RequestMapping
    public Page<CategoryDistrictServiceInfo> findOne(Pageable pageable) {
        LOGGER.debug("Retrieving all district_service_infos for pageable {}", pageable);
        return categoryDistrictServiceInfoRepository.findAll(pageable);
    }

    @RequestMapping(value = "/search/findByCategoryIdAndDistrictId")
    public Page<CategoryDistrictServiceInfo> findByCategoryIdAndDistrictId( @RequestParam("categoryId") Integer categoryId, @RequestParam("districtId") Integer districtId, Pageable pageable) {
        LOGGER.debug("Retrieving all district_service_infos for categoryId {} and districtId {} and pageable {}", categoryId, districtId, pageable);
        return categoryDistrictServiceInfoRepository.findByCategoryIdAndDistrictId(districtId, categoryId, pageable);
    }

}
