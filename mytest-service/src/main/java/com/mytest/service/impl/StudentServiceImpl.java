package com.mytest.service.impl;

import com.mytest.dao.StudentDao;
import com.mytest.model.Student;
import com.mytest.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 请填写类注释
 *
 * @author 彭奕灵 yiling.peng@ucarinc.com
 * @since 2019年03月27日
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentDao studentDao;

    @Override
    public Boolean addStudent(Student student) {
        return studentDao.insert(student);
    }

    @Override
    public Boolean deleteStudent(Integer id) {
        Student student = new Student();
        student.setId(id);
        return studentDao.delete(student);
    }

    @Override
    public Boolean updateStudent(Student student) {
        return studentDao.update(student);
    }

    @Override
    public List<Student> findAllStudent(Student student) {
        return studentDao.select(student);
    }
}
