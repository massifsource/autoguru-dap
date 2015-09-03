/**
 * Copyright 2015 MassifSource
 *
 * @author Nikolay Sarychev <nikolaysarychev@gmail.com>
 */
package com.massifsource.autoguru.dap.repository;

import com.massifsource.autoguru.dap.model.DistrictServiceInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DistrictServiceInfoRepository extends PagingAndSortingRepository<DistrictServiceInfo, Integer> {

    Page<DistrictServiceInfo> findByServiceId(Integer serviceId, Pageable pageable);
    Page<DistrictServiceInfo> findByDistrictId(Integer districtId, Pageable pageable);
    Page<DistrictServiceInfo> findByDistrictIdAndServiceId(Integer districtId, Integer serviceId, Pageable pageable);
    Page<DistrictServiceInfo> findByServiceCategoryIdAndDistrictId(Integer serviceCategoryId, Integer serviceId, Pageable pageable);
}
