package com.tuling.mybatis.util;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory sqlSessionFactory=null;
	private static MyBatisUtil instance=new MyBatisUtil();
	private  MyBatisUtil() {
		try {
			InputStream inputStream =Resources.getResourceAsStream("mybaits-config.xml");
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static SqlSession getOpenSession() {
		return instance.sqlSessionFactory.openSession();
	}

}
