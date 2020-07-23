package dao;

import entity.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testMapperImpl implements testMapper{

    //获取SqlSession对象，这里就是SqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    //set方法注入
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getAll() {
        testMapper mapper = sqlSession.getMapper(testMapper.class);
        return mapper.getAll();

    }

    @Override
    public int delete(int id) {
        return sqlSession.getMapper(testMapper.class).delete(id);
    }

    @Override
    public int update(Map map) {
        return sqlSession.getMapper(testMapper.class).update(map);
    }
}
