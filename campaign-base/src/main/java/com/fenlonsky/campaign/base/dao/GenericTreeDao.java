package com.fenlonsky.campaign.base.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

import com.fenlonsky.campaign.base.model.BaseTreeEntityModel;

/**
 * Generic Tree DAO (Data Access Object) with common methods to CRUD POJOs.
 * Implemented with Spring-Data-JPA Repository
 * <p>
 * Extend this interface if you want type safe (no casting necessary) DAO's for
 * your domain objects.
 * 
 * @author <a href="mailto:ming616@gmail.com">Liu Xiaoming</a>
 * @param <T>
 *            a type variable,实体类型
 * @param <PK>
 *            the primary key for that type，实体类Id
 */
@NoRepositoryBean
public interface GenericTreeDao<T extends BaseTreeEntityModel<T>, PK extends Serializable>
		extends GenericDao<T, PK> {
	
	public List<T> getRoot();
}
