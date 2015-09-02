/**
 * Copyright 2015 MassifSource
 *
 * @author Nikolay Sarychev <nikolaysarychev@gmail.com>
 */
package com.massifsource.autoguru.dap.repository;

import com.massifsource.autoguru.dap.model.District;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DistrictRepository extends PagingAndSortingRepository<District, Integer> {

    public Page<District> findByCityId(Integer cityId, Pageable pageable);
}
