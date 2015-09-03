/**
 * Copyright 2015 MassifSource
 *
 * @author Nikolay Sarychev <nikolaysarychev@gmail.com>
 */
package com.massifsource.autoguru.dap.repository;

import com.massifsource.autoguru.dap.model.CategoryDistrictServiceInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryDistrictServiceInfoRepository extends PagingAndSortingRepository<CategoryDistrictServiceInfo, Integer> {

    Page<CategoryDistrictServiceInfo> findByCategoryIdAndDistrictId(Integer categoryId, Integer serviceId, Pageable pageable);
}
