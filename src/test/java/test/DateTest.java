/**
 * Create Date:2019年9月11日
 */
package test;

import java.util.Calendar;

import org.junit.Test;

import com.hanxin.common.utils.DateUtil_T;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:韩新(535486768@qq.com)
 * <br>Date:2019年9月11日
 */
public class DateTest {

  @Test
  public void getAge(){
    Calendar calendar = Calendar.getInstance();
    calendar.set(1999, 9, 11);
    int i = DateUtil_T.getAge(calendar);
    System.out.println(i);
  }
  
  @Test
  public void init(){
    Calendar calendar = Calendar.getInstance();
    calendar.set(1999, 9, 11);
    System.out.println(calendar.getTime());
    DateUtil_T.initDateTime(calendar);
    System.out.println(calendar.getTime());
  }
  
  @Test
  public void getFutrueDays(){
    Calendar calendar = Calendar.getInstance();
    calendar.set(2020, 8, 11);
    int i = DateUtil_T.getFutrueDays(calendar);
    System.out.println(i);
  }
  
  @Test
  public void getPastDays(){
    Calendar calendar = Calendar.getInstance();
    calendar.set(2018, 8, 11);
    int i = DateUtil_T.getPastDays(calendar);
    System.out.println(i);
  }
  @Test
  public void setToLastDateOfMonth(){
    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar.getTime());
    DateUtil_T.setToLastDateOfMonth(calendar);
    System.out.println(calendar.getTime());
  }
}
