package test;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.junit.Test;

import com.hanxin.common.utils.IOUtil;
import com.hanxin.common.utils.IOUtil_T;
import com.hanxin.common.utils.StringUtil;
import com.hanxin.common.utils.StringUtil_T;

public class StringTest_T {
  @Test
  public void test01() {
    boolean empty = StringUtil_T.isEmpty("   ");
    System.out.println(empty);
  }

  @Test
  public void test02() {
    boolean emptyAndSpace = StringUtil_T.isEmptyAndSpace("a   ");
    System.out.println(emptyAndSpace);
  }

  @Test
  public void test03() {
    boolean phoneNum = StringUtil_T.isPhoneNum(null);
    System.out.println(phoneNum);
  }

  @Test
  public void test04() {
    boolean email = StringUtil_T.isEmail("1232313124");
    System.out.println(email);
  }

  @Test
  public void test05() {
    boolean letter = StringUtil_T.isLetter("c-d");
    System.out.println(letter);
  }

  @Test
  public void test06() {
    String randomLetter = StringUtil_T.randomLetter(5);
    System.out.println(randomLetter);
  }

  @Test
  public void test07() {
    String randomLetter = StringUtil_T.randomLetterAndNumber(15);
    System.out.println(randomLetter);
  }

  @Test
  public void test08() {
    String word = StringUtil_T.getWord(5);
    System.out.println(word);
  }

  @Test
	public void Test09() throws Exception{
//    String str = IOUtil.readTextFile(new File("D://test//haha.txt"));
//    String str = IOUtil_T.readTextFile(new File("D://test//haha.txt"));
//    String str = ""; 
//    for (String string : list) {
//      System.out.println(string);
//      str += string;
//    }
    String str = "外汇局：美国认定中国“汇率操纵”根本站不住脚|http://news.cnstock.com/news,yw-201908-4413224.htm|8|2019-08-08 07:37:32\",\r\n" + 
      "   \"二线城市房贷利率接连上调 房贷利率区间波动或成常态|http://news.cnstock.com/news,yw-201908-4413229.htm|5|\",\r\n" + 
      "   \"资产负债管理顶层设计亮相 引导险企向高质量发展转型|http://news.cnstock.com/news,yw-201908-4413222.htm||2019-08-08 07:36:50\",\r\n" + 
      "   \"泰康在线获泰康集团增资20亿元|http://news.cnstock.com/news,jg-201908-4413369.htm|7|2019-08-08 09:25:53\",\r\n" + 
      "   \"人民银行：中国7月外汇储备为3.1037万亿美元|http://news.cnstock.com/news,bwkx-201908-4412982.htm|10|2019-08-07 16:43:13\",\r\n" + 
      "   \"百度战略投资有赞 布局电商小程序|http://news.cnstock.com/news,bwkx-201908-4413414.htm||2019-08-08 10:57:59\",\r\n" + 
      "   \"MSCI：8只个股将被新增入MSCI中国指数|http://news.cnstock.com/news,bwkx-201908-4413216.htm|9|2019-08-08 07:28:58\",\r\n" + 
      "   \"全球三大指数巨头进入“中国时间”|http://stock.cnstock.com/stock/smk_gszbs/201908/4413244.htm|10|2019-08-08 07:47:08\",\r\n" + 
      "   \"8月8日沪深两市最新交易提示|http://news.cnstock.com/news,bwkx-201908-4413227.htm||2019-08-08 07:39:05\",\r\n" + 
      "   \"华为发布面向2025十大趋势|http://news.cnstock.com/news,bwkx-201908-4413402.htm|8|2019-08-06 10:19:49\",\r\n" + 
      "   \"网易第二季度净收入188亿元 创新业务毛利率转正|http://news.cnstock.com/news,bwkx-201908-4413415.htm||2019-08-08 10:58:39\",\r\n" + 
      "   \"中欧班列（郑州）开通俄罗斯新线路|http://news.cnstock.com/news,bwkx-201908-4413425.htm|7|2019-08-08 11:15:24\",\r" + 
      "   \"我国股权投资市场规模突破10万亿元|http://news.cnstock.com/news,yw-201908-4412690.htm|9|2019-08-07 07:59:11\",\r\n" + 
      "   \"临港新片区聚焦高端制造 A股公司提前布局|http://news.cnstock.com/news,yw-201908-4412640.htm|2|2019-08-07 07:42:29\",\r\n" + 
      "   \"中国人民银行关于美国财政部将中国列为“汇率操纵国”的声明|http://news.cnstock.com/news,yw-201908-4412630.htm|10\r\n" + 
      "";
    System.out.println(str);
	  String string = StringUtil_T.changeText("你好\rskdhj\r\n");
	  System.out.println(string);
	}
  
  @Test
  public void isPhone(){
    String reg = "^1[3,5,7,8]\\d{9}$";
    String phone = "18371771710";
    boolean b = phone.matches(reg);
    System.out.println(b);
  }
  
  
  @Test
  public void isEmail(){
    String reg = "^\\w+[.]\\w+@\\w+([.]com|[.]com[.]cn|[.]cn|[.]net)$";
    String emaile = "jianxin.han@aliyun.com";
    boolean b = emaile.matches(reg);
    System.out.println(b);
  }
  
  
  @Test
  public void test10(){
    String html = StringUtil.toHtml2("哈哈\n\rsdsf\nasdsadas\n\r奥斯卡离婚登记卡时间可缓解客户打手机看领导和健康撒谎离开手机电脑卡拉手机号\n\r");
    System.out.println(html);
  }
  
  @Test
  public void isPhone2(){
    boolean bc = StringUtil_T.isPhoneNum("14523456728");
    System.out.println(bc);
    boolean b = StringUtil_T.isPhoneNum("13523456728");
    System.out.println(b);
  }
  
  @Test
  public void isEmail2(){
    boolean b = StringUtil_T.isEmail("535486768qq.com");
    System.out.println(b);
    boolean bc = StringUtil_T.isEmail("jianxin.han@aliyun.com");
    System.out.println(bc);
  }
}
