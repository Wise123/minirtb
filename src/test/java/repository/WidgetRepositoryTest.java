package repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.rtb.MiniRtbApplication;
import org.rtb.repository.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={MiniRtbApplication.class})
@ContextConfiguration
public class WidgetRepositoryTest {

  @Autowired
  WidgetRepository widgetRepository;

  @Test
  public void test1() {
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        null,
        null,
        null,
        null
        )
    );
  }

  @Test
  public void test2() {
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        10,
        10,
        10,
        10
        )
    );
  }

  @Test
  public void test3() {
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        null,
        null,
        null,
        null
        )
    );
  }

  @Test
  public void test4() {
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        10,
        10,
        10,
        10
        )
    );
  }

  @Test
  public void test5(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        10,
        10,
        10,
        100
        )
    );
  }
  @Test
  public void test6(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        10,
        10,
        10,
        100
        )
    );
  }

  @Test
  public void test7(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        10,
        10,
        100,
        10
        )
    );
  }
  @Test
  public void test8(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        10,
        10,
        100,
        10
        )
    );
  }
  @Test
  public void test9(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        10,
        10,
        100,
        100
        )
    );
  }
  @Test
  public void test10(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        10,
        10,
        100,
        100
        )
    );
  }

  @Test
  public void test11(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        10,
        100,
        10,
        10
        )
    );
  }
  @Test
  public void test12(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        10,
        100,
        10,
        10
        )
    );
  }

  @Test
  public void test13(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        10,
        100,
        10,
        100
        )
    );
  }
  @Test
  public void test14(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        10,
        100,
        10,
        100
        )
    );
  }

  @Test
  public void test15(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        10,
        100,
        100,
        10
        )
    );
  }
  @Test
  public void test16(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        10,
        100,
        100,
        10
        )
    );
  }

  @Test
  public void test17(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        10,
        100,
        100,
        100
        )
    );
  }
  @Test
  public void test18(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        10,
        100,
        100,
        100
        )
    );
  }
  @Test
  public void test19(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        100,
        10,
        10,
        10
        )
    );
  }
  @Test
  public void test20(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        100,
        10,
        10,
        10
        )
    );
  }

  @Test
  public void test21(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        100,
        10,
        10,
        100
        )
    );
  }
  @Test
  public void test22(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        100,
        10,
        10,
        100
        )
    );
  }

  @Test
  public void test23(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        100,
        10,
        100,
        10
        )
    );
  }
  @Test
  public void test24(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        100,
        10,
        100,
        10
        )
    );
  }
  @Test
  public void test25(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        100,
        10,
        100,
        100
        )
    );
  }
  @Test
  public void test26(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        100,
        10,
        100,
        100
        )
    );
  }

  @Test
  public void test27(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        100,
        100,
        10,
        10
        )
    );
  }
  @Test
  public void test28(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        100,
        100,
        10,
        10
        )
    );
  }

  @Test
  public void test29(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        100,
        100,
        10,
        100
        )
    );
  }
  @Test
  public void test30(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        100,
        100,
        10,
        100
        )
    );
  }

  @Test
  public void test31(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        100,
        100,
        100,
        10
        )
    );
  }
  @Test
  public void test32(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        100,
        100,
        100,
        10
        )
    );
  }

  @Test
  public void test33(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        null,
        null,
        100,
        100,
        100,
        100
        )
    );
  }
  @Test
  public void test34(){
    Assert.assertNotNull(widgetRepository.findByFilters(
        0,
        10,
        100,
        100,
        100,
        100
        )
    );
  }
}