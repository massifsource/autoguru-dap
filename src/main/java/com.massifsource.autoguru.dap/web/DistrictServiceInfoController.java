/**
 * Copyright 2015 MassifSource
 *
 * @author Nikolay Sarychev <nikolaysarychev@gmail.com>
 */
package com.massifsource.autoguru.dap.web;

import com.massifsource.autoguru.dap.model.DistrictServiceInfo;
import com.massifsource.autoguru.dap.repository.DistrictServiceInfoRepository;
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
@RequestMapping(value = "/district_service_infos")
public class DistrictServiceInfoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DistrictServiceInfoController.class);
    @Autowired
    private DistrictServiceInfoRepository districtServiceInfoRepository;

    @RequestMapping(value = "/{id}")
    public DistrictServiceInfo findOne(@PathVariable("id") Integer id) {
        LOGGER.debug("Retrieving district_service_info for id {}", id);
        return districtServiceInfoRepository.findOne(id);
    }

    @RequestMapping
    public Page<DistrictServiceInfo> findOne(Pageable pageable) {
        LOGGER.debug("Retrieving all district_service_infos for pageable {}", pageable);
        return districtServiceInfoRepository.findAll(pageable);
    }

    @RequestMapping(value = "/search/findByDistrictId")
    public Page<DistrictServiceInfo> findByDistrictId(@RequestParam("districtId") Integer districtId, Pageable pageable) {
        LOGGER.debug("Retrieving all district_service_infos for districtId {} and pageable {}", districtId, pageable);
        return districtServiceInfoRepository.findByDistrictId(districtId, pageable);
    }

    @RequestMapping(value = "/search/findByServiceId")
    public Page<DistrictServiceInfo> findByServiceId(@RequestParam("serviceId") Integer serviceId, Pageable pageable) {
        LOGGER.debug("Retrieving all district_service_infos for serviceId {} and pageable {}", serviceId, pageable);
        return districtServiceInfoRepository.findByServiceId(serviceId, pageable);
    }

    @RequestMapping(value = "/search/findByDistrictIdAndServiceId")
    public Page<DistrictServiceInfo> findByDistrictIdAndServiceId(@RequestParam("districtId") Integer districtId, @RequestParam("serviceId") Integer serviceId, Pageable pageable) {
        LOGGER.debug("Retrieving all district_service_infos for serviceId {} and districtId {} and pageable {}", serviceId, districtId, pageable);
        return districtServiceInfoRepository.findByDistrictIdAndServiceId(districtId, serviceId, pageable);
    }

    @RequestMapping(value = "/search/findByServiceCategoryIdAndDistrictId")
    public Page<DistrictServiceInfo> findByCategoryIdAndDistrictId( @RequestParam("serviceCategoryId") Integer serviceCategoryId, @RequestParam("districtId") Integer districtId, Pageable pageable) {
        LOGGER.debug("Retrieving all district_service_infos for serviceCategoryId {} and districtId {} and pageable {}", serviceCategoryId, districtId, pageable);
        return districtServiceInfoRepository.findByServiceCategoryIdAndDistrictId(serviceCategoryId, districtId, pageable);
    }

}
