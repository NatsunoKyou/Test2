package pre.xyl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pre.xyl.pojo.Student;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            String namespace = "pre.xyl.dao.mappers.StudentMapper";
            Student o = sqlSession.selectOne(namespace + ".quryStuAndCard", 1);//查询吧编号为1 的学生
            System.out.println(o);
        }
    }
}
