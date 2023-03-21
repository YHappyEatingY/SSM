package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Happy Day !
 * @createTime 2023-03-21 18:40
 */
public class MybatisTest {
    @Test
    public void test() throws IOException {
        /*// 获取核心文件的输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
       // 获取sqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取sqlSessionFactory 对象
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        // 获取sql的sqlSession对象 是Mybatis提供操作数据库的对象
        SqlSession sqlSession = build.openSession(true);
        // 获取UserMapper的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);*/
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i = userMapper.insertUser();
        System.out.println("结果为"+i);
        SqlSessionUtil.closeSqlSession(SqlSessionUtil.sqlSession_is_alive());
    }
    @Test
    public void test2() throws IOException {
        /*// 获取核心文件的输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
       // 获取sqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取sqlSessionFactory 对象
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        // 获取sql的sqlSession对象 是Mybatis提供操作数据库的对象
        SqlSession sqlSession = build.openSession(true);
        // 获取UserMapper的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);*/
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser();
        SqlSessionUtil.closeSqlSession(SqlSessionUtil.sqlSession_is_alive());
    }
    @Test
    public void test3() throws IOException {
        /*// 获取核心文件的输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
       // 获取sqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取sqlSessionFactory 对象
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        // 获取sql的sqlSession对象 是Mybatis提供操作数据库的对象
        SqlSession sqlSession = build.openSession(true);
        // 获取UserMapper的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);*/
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteUser();
        SqlSessionUtil.closeSqlSession(SqlSessionUtil.sqlSession_is_alive());
    }
     @Test
    public void test4() throws IOException {
        /*// 获取核心文件的输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
       // 获取sqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取sqlSessionFactory 对象
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        // 获取sql的sqlSession对象 是Mybatis提供操作数据库的对象
        SqlSession sqlSession = build.openSession(true);
        // 获取UserMapper的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);*/
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User userById = userMapper.getUserById();
        System.out.println(userById);
        SqlSessionUtil.closeSqlSession(SqlSessionUtil.sqlSession_is_alive());

    }
    @Test
    public void test5() throws IOException {
        /*// 获取核心文件的输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
       // 获取sqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取sqlSessionFactory 对象
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        // 获取sql的sqlSession对象 是Mybatis提供操作数据库的对象
        SqlSession sqlSession = build.openSession(true);
        // 获取UserMapper的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);*/
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = userMapper.getAllUser();
        System.out.println(allUser);
        SqlSessionUtil.closeSqlSession(SqlSessionUtil.sqlSession_is_alive());
    }
}
