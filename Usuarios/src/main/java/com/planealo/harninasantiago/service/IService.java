package com.planealo.harninasantiago.service;

import java.util.List;

public interface IService<T> {

	public T add(T t);
	
	public boolean delete(long id);
	
	public T getById(long id);
	
	public List<T> getAll();
	
	public boolean addAll(List<T> t);
}
