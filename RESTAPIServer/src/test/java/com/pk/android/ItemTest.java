package com.pk.android;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class ItemTest {
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void connectTest() {
		//System.out.println(sqlSession);
		//System.out.println(sqlSession.selectList("item.listItem"));
		System.out.println(sqlSession.selectOne("item.getItem", 1) +"");
	}
}
