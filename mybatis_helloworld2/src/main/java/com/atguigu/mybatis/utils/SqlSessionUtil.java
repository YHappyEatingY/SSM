package com.atguigu.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author Happy Day !
 * @createTime 2023-03-21 19:47
 */
public class SqlSessionUtil {
     private  static   SqlSession sqlSession = null;
     public  static SqlSession getSqlSession(){
          try {
               InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
               SqlSessionFactoryBuilder sqlSessionFactoryBuilder= new SqlSessionFactoryBuilder();
               SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
                sqlSession = build.openSession(true);
          } catch (Exception e){
               e.printStackTrace();
          }
          return sqlSession;
     }
     public static  boolean  sqlSession_is_alive(){
          return sqlSession!=null;
     }

     public static  void closeSqlSession(boolean bool){
              if(bool)
                         sqlSession.close();
     }
}
