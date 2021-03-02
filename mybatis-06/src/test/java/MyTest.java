import com.kuang.dao.StudentMapper;
import com.kuang.pojo.student;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void testSelect() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<student> studentList = mapper.getStudentList2();
        for (student student : studentList) {
            System.out.println(student);
        }


        sqlSession.close();
    }


}
