package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * MyBatis工具类
 * 通过工厂生产出SqlSession对象，该对象包含sql的所有方法
 */
public class MyBatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    //创建SqlSessionFactory工厂对象，用于生成SqlSession对象
    static {
        try {
            //读取配置文件
            String resource = "mybatis.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //获取SqlSession对象,参数设置为哦true，自动提交事务
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);
    }
}
