package com.zhiyou100.rmlb.crm.dao;

public abstract class AbstractDAO<K, V> {

	
	abstract boolean add(V vo);
	
	abstract boolean delete(K id);
	
	abstract boolean update(V vo);
	
	abstract V findById(K id);
	
}
