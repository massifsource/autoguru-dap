/**
 * Copyright 2015 MassifSource
 *
 * @author Nikolay Sarychev <nikolaysarychev@gmail.com>
 */
package com.massifsource.autoguru.dap.web;

import com.massifsource.autoguru.dap.model.District;
import com.massifsource.autoguru.dap.repository.DistrictRepository;
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
@RequestMapping(value = "/districts")
public class DistrictController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DistrictController.class);
    @Autowired
    private DistrictRepository districtRepository;

    @RequestMapping(value = "/{id}")
    public District findOne(@PathVariable("id") Integer id) {
        LOGGER.debug("Retrieving district for id {}", id);
        return districtRepository.findOne(id);
    }

    @RequestMapping
    public Page<District> findOne(Pageable pageable) {
        LOGGER.debug("Retrieving all districts for pageable {}", pageable);
        return districtRepository.findAll(pageable);
    }

    @RequestMapping(value = "/search/findByCityId")
    public Page<District> findByCityId(@RequestParam("cityId") Integer cityId, Pageable pageable) {
        LOGGER.debug("Retrieving all districts for cityId {} and pageable {}", cityId, pageable);
        return districtRepository.findByCityId(cityId, pageable);
    }

}
