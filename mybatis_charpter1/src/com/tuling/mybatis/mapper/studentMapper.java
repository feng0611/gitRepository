package com.tuling.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tuling.mybatis.entity.student;

public interface studentMapper {
	student getStuId(Integer id);
	
//	1������id��name��ѯ����ѧ����
	student  getStuIdAndName(@Param("id")Integer id,@Param("name")String name);
//	student  getStuIdAndName(Integer id,String name);
//	2����ѯ����ѧ����
	List<student> getAllStu();
//	3����������ģ����ѯѧ����
	List<student> getAllStuLike(String name);
//	4�����ѧ��
	Integer insertStu(student stu);
//	5��ɾ��ѧ��
	Integer delStu(Integer id);
//	6���޸�ѧ��
	Integer updateStu(student stu);


}
