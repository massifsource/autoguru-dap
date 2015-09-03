/**
 * Copyright 2015 MassifSource
 *
 * @author Nikolay Sarychev <nikolaysarychev@gmail.com>
 */
package com.massifsource.autoguru.dap.web;

import com.massifsource.autoguru.dap.model.City;
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
@RequestMapping(value = "/cities")
public class CityController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityController.class);
    @Autowired
    private CityRepository cityRepository;

    @RequestMapping(value = "/{id}")
    public City findOne(@PathVariable("id") Integer id) {
        LOGGER.debug("Retrieving city for id {}", id);
        return cityRepository.findOne(id);
    }

    @RequestMapping
    public Page<City> findOne(Pageable pageable) {
        LOGGER.debug("Retrieving all cities for pageable {}", pageable);
        return cityRepository.findAll(pageable);
    }

}
