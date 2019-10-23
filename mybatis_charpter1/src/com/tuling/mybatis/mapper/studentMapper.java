package com.tuling.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tuling.mybatis.entity.student;

public interface studentMapper {
	student getStuId(Integer id);
	
//	1、根据id、name查询单个学生。
	student  getStuIdAndName(@Param("id")Integer id,@Param("name")String name);
//	student  getStuIdAndName(Integer id,String name);
//	2、查询所有学生。
	List<student> getAllStu();
//	3、根据邮箱模糊查询学生。
	List<student> getAllStuLike(String name);
//	4、添加学生
	Integer insertStu(student stu);
//	5、删除学生
	Integer delStu(Integer id);
//	6、修改学生
	Integer updateStu(student stu);


}
