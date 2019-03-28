package com.mytest.test;

import com.mytest.model.Student;
import com.mytest.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 请填写类注释
 *
 * @author 彭奕灵 yiling.peng@ucarinc.com
 * @since 2019年03月28日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class ServiceTest {
    @Resource
    private StudentService studentService;
    @Test
    public void addTest() throws Exception{
        Student student = new Student();
        student.setName("李白");
        student.setSex(false);
        student.setAddress("北京");
        System.out.println(studentService.addStudent(student));
    }
}
