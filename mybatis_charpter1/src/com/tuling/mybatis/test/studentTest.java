package com.tuling.mybatis.test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import com.tuling.mybatis.entity.student;
import com.tuling.mybatis.mapper.studentMapper;
import com.tuling.mybatis.util.MyBatisUtil;

public class studentTest {

	
	@Test
	//通过id查询学生
	public void testgetStuId(){

	 SqlSession session=null;
	 try {
		 session=MyBatisUtil.getOpenSession();
		studentMapper mapper=session.getMapper(studentMapper.class);
		System.out.println(mapper.getStuId(1));
	  }catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
	 //关闭session
	 session.close();
	 }
	} 
	@Test
	//查询所有学生	
	public void testGetAllStu(){
		SqlSession session=null;
		try {
			session=MyBatisUtil.getOpenSession();
			studentMapper mapper=session.getMapper(studentMapper.class);
			System.out.println(mapper.getAllStu());		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
	}
	@Test
//	根据id、name查询单个学生。
	public void testGetStuIdAndName(){
		SqlSession session=null;
		try {
			session=MyBatisUtil.getOpenSession();
			studentMapper  mapper=session.getMapper(studentMapper.class);
			System.out.println(mapper.getStuIdAndName(1,"小明"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}		
	}
	@Test
//	根据邮箱模糊查询学生
	public void testGetAllStuLike(){
		SqlSession session=null;
		try {
			session=MyBatisUtil.getOpenSession();
			studentMapper mapper=session.getMapper(studentMapper.class);
			System.out.println(mapper.getAllStuLike("%明%"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
	}
	@Test
//	添加学生
	public void testInsertStu() throws Exception {
		SqlSession session=null;
		try {
			session=MyBatisUtil.getOpenSession();
			studentMapper mapper=session.getMapper(studentMapper.class);
			student stu=new student(null,"小易",10000.0,"湖南");
			System.out.println(mapper.insertStu(stu));
			System.out.println(stu.getId());
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if(session!=null)
			session.rollback();
		}finally {
			if(session!=null)session.close();
		}
	}
	@Test
//	删除学生
	public void testDelStu(){
		SqlSession session=null;
		try {
			session=MyBatisUtil.getOpenSession();
			studentMapper mapper=session.getMapper(studentMapper.class);
			System.out.println(mapper.delStu(5));
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if(session!=null)
				session.rollback();
		}finally {
			if(session!=null)session.close();
		}
	}
	@Test
//	修改学生
	public void testUpdateStu(){
		SqlSession session=null;
		try {
			session=MyBatisUtil.getOpenSession();
			studentMapper mapper=session.getMapper(studentMapper.class);
			student stu=new student();
			stu.setEsal(12000.0);
			stu.setEname("小刘");
			stu.setEaddress("长沙");
			stu.setId(6);
			System.out.println(mapper.updateStu(stu));
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if(session!=null)
				session.rollback();
		}finally {
			if(session!=null)session.close();
		}
	}

	
}
