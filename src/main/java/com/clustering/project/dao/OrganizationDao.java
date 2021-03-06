package com.clustering.project.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrganizationDao {
	@Autowired
	private SqlSessionTemplate sqlSession;

	public Object getList(String sqlMapId, Object dataMap) {
		Object result = sqlSession.selectList(sqlMapId, dataMap);
		return result;
	}

	public Object getObject(String sqlMapId, Object dataMap) {
		Map<String, Object> result = sqlSession.selectOne(sqlMapId, dataMap);
		System.out.println("result= " + result);
		return result;
	}

	public Object saveObject(String sqlMapId, Object dataMap) {
		Integer result = sqlSession.insert((String) sqlMapId, dataMap);

		return result;
	}

	public Object deleteObject(String sqlMapId, Object dataMap) {
		Integer result = sqlSession.delete(sqlMapId, dataMap);
		return result;
	}
	public Object updateObject(String sqlMapId, Object dataMap) {
		Integer result = sqlSession.update(sqlMapId, dataMap);
		System.out.println("result= " + result);
		return result;
	}
	
}