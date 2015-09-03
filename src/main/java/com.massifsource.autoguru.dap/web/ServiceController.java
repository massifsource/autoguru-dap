/**
 * Copyright 2015 MassifSource
 *
 * @author Nikolay Sarychev <nikolaysarychev@gmail.com>
 */
package com.massifsource.autoguru.dap.web;

import com.massifsource.autoguru.dap.model.Service;
import com.massifsource.autoguru.dap.repository.ServiceRepository;
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
@RequestMapping(value = "/services")
public class ServiceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);
    @Autowired
    private ServiceRepository serviceRepository;

    @RequestMapping(value = "/{id}")
    public Service findOne(@PathVariable("id") Integer id) {
        LOGGER.debug("Retrieving service for id {}", id);
        return serviceRepository.findOne(id);
    }

    @RequestMapping
    public Page<Service> findOne(Pageable pageable) {
        LOGGER.debug("Retrieving all services for pageable {}", pageable);
        return serviceRepository.findAll(pageable);
    }

    @RequestMapping(value = "/search/findByCategoryId")
    public Page<Service> findByCategoryId(@RequestParam("categoryId") Integer categoryId, Pageable pageable) {
        LOGGER.debug("Retrieving all services for category_id {} and pageable {}", categoryId, pageable);
        return serviceRepository.findByCategoryId(categoryId, pageable);
    }

}
