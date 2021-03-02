import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Mytest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();


        User user1 = mapper1.queryUserById(1);

        System.out.println(user1);


        sqlSession1.close();
    }
}
