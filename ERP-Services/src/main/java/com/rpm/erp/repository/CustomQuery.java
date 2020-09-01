package com.rpm.erp.repository;

import java.util.List;

import com.rpm.erp.model.DynamicQuery;

/**
 * @author MohanRamu
 *
 * @param <T>
 */
public interface CustomQuery<T> {

	List<T> getByDynamicQuery(DynamicQuery dynamicQuery);
}
