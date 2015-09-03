/**
 * Copyright 2015 MassifSource
 *
 * @author Nikolay Sarychev <nikolaysarychev@gmail.com>
 */
package com.massifsource.autoguru.dap.repository;

import com.massifsource.autoguru.dap.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer> {
}
