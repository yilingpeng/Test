package com.mytest.service;

import com.mytest.model.Student;

import java.util.List;

/**
 * 请填写类注释
 *
 * @author 彭奕灵 yiling.peng@ucarinc.com
 * @since 2019年03月27日
 */
public interface StudentService {
    /**
     * 添加学生
     * @param student
     * @return
     */
    Boolean addStudent(Student student);

    /**
     * 根据id删除学生
     * @param id
     * @return
     */
    Boolean deleteStudent(Integer id);

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    Boolean updateStudent(Student student);

    /**
     * 查询学生信息
     * @param student
     * @return
     */
    List<Student> findAllStudent(Student student);
}
