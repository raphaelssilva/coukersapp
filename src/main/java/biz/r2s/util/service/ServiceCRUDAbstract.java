package biz.r2s.util.service;

import java.util.List;

import biz.r2s.util.persistencia.DAO;

public abstract class ServiceCRUDAbstract<T> implements ServiceCRUD<T> {

	protected DAO<T> dao;

	@Override
	public T inserir(T obj) {
		return dao.create(obj);
	}

	@Override
	public T alterar(T obj) {
		return dao.edit(obj);
	}

	@Override
	public void excluir(T key) {
		dao.delete(key);
	}

	@Override
	public T consultar(Long key) {
		return dao.find(key);
		
	}

	@Override
	public List<T> listar() {
		return dao.findAll();
	}
	


}
