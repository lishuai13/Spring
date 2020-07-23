package service;

/**
 * 真实角色，实现操作
 */
public class UserServiceImpl implements UserService{

    public void add() {
        System.out.println("增加一个角色！");
    }

    public void delete() {
        System.out.println("删除一个角色！");
    }

    public void update() {
        System.out.println("更改一个角色！");
    }

    public String query() {
        System.out.println("查询一个角色！");
        return "test";
    }

}
