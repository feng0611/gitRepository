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
	//ͨ��id��ѯѧ��
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
	 //�ر�session
	 session.close();
	 }
	} 
	@Test
	//��ѯ����ѧ��	
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
//	����id��name��ѯ����ѧ����
	public void testGetStuIdAndName(){
		SqlSession session=null;
		try {
			session=MyBatisUtil.getOpenSession();
			studentMapper  mapper=session.getMapper(studentMapper.class);
			System.out.println(mapper.getStuIdAndName(1,"С��"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}		
	}
	@Test
//	��������ģ����ѯѧ��
	public void testGetAllStuLike(){
		SqlSession session=null;
		try {
			session=MyBatisUtil.getOpenSession();
			studentMapper mapper=session.getMapper(studentMapper.class);
			System.out.println(mapper.getAllStuLike("%��%"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
	}
	@Test
//	���ѧ��
	public void testInsertStu() throws Exception {
		SqlSession session=null;
		try {
			session=MyBatisUtil.getOpenSession();
			studentMapper mapper=session.getMapper(studentMapper.class);
			student stu=new student(null,"С��",10000.0,"����");
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
//	ɾ��ѧ��
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
//	�޸�ѧ��
	public void testUpdateStu(){
		SqlSession session=null;
		try {
			session=MyBatisUtil.getOpenSession();
			studentMapper mapper=session.getMapper(studentMapper.class);
			student stu=new student();
			stu.setEsal(12000.0);
			stu.setEname("С��");
			stu.setEaddress("��ɳ");
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
