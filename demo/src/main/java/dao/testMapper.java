package dao;

import entity.User;

import java.util.List;
import java.util.Map;

public interface testMapper {

    List<User> getAll();

    int delete(int id);

    int update(Map map);

}
