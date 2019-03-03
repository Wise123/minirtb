import org.junit.Test;
import org.junit.runner.RunWith;
import org.rtb.MiniRtbApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={MiniRtbApplication.class})
@ContextConfiguration
public class MainTest {

  @Test
  public void contextLoads() throws Exception {
  }
}
