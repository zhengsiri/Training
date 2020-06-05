package edu.testcase;

import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.XuanxuanPage;

public class XuanxuanPageTest extends BaseTest{
     XuanxuanPage xuanxuan;
	
	//1.登录成功
	@Test
	public void login() throws InterruptedException{
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.login();
	}

	//2.查看我的个人信息
	@Test
	public void myInformation(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.myInformation();
	}
	
	//3.查看关于
	@Test
	public void guanyu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.guanyu();
	}
	
	//4.查看隐私条款
	@Test
	public void yinsitiaokuan(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.yinsitiaokuan();
	}
	
	//5.查看喧喧官网
	@Test
	public void xuanxuanGuanwang(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.xuanxuanGuanwang();
	}
	

	//6.创建讨论组
	@Test
	public void createTaolunzu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Create();
		
	}
		
	//7.收藏讨论组
	@Test
	public void shoucangTaolunzu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Shoucang();	
	}
	
	//8.取消收藏讨论组
	@Test
	public void quxiaoshoucangTaolunzu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.quxiaoshoucangTaolunzu();	
	}
	
	//9.查看讨论组成员
	@Test
	public void taolunzu_Numbers(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Numbers();	
	}
	
	//10.讨论组重命名
	@Test
	public void rename(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Rename();	
	}
	//11.取消讨论组重命名
	@Test
	public void cancelRename(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.cancelRename();
	}
	//12.在讨论组中发送图片
	@Test
	public void sendPicture(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.sendPictureInAlbum();
	}
	//13.在讨论组创建聊天
	@Test
	public void chatTaolunzu() {
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.chatTaolunzu();
	}
	//14.同步讨论组的最新消息
	@Test
	public void taolunzuNews(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_news();
	}
	
	//15.在讨论组中发送文本内容
	@Test
	public void seadNews(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.send_news();
	}
	//16.退出讨论组
	@Test
	public void exitTaolunzu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.exittaolunzu();
	}
	//17.查看联系人资料
	@Test
	public void lianxirenInformation(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.lianxirenInformation();
	}
	
	//18.收藏联系人
	@Test
	public void shoucanglianxiren(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.shoucanglianxiren();
	}
	
	//19.发邮件
	@Test
	public void sendEmail(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.sendEmail();
	}
	//20.退出登录
	@Test
	public void quitXuanxuan(){
		xuanxuan=new XuanxuanPage1(driver);
		xuanxuan.quitXuanxuan();		
	}

}
