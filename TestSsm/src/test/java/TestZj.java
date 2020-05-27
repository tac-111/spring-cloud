import com.zj.dao.UserDao;
import org.junit.Test;

import javax.annotation.Resource;

public class TestZj extends BaseTest {

    @Resource
    private UserDao userDao;
    @Test
    public  void zj(){


        System.out.println(String.valueOf(1));
        System.out.println(String.valueOf(1));
        System.out.println(String.valueOf(1));
        System.out.println(String.valueOf(1));

        userDao.selectUser(1);
    }
}
