package edu.testcase;

import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.XuanxuanPage;

public class XuanxuanPageTest extends BaseTest{
     XuanxuanPage xuanxuan;
	
	//1.��¼�ɹ�
	@Test
	public void login() throws InterruptedException{
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.login();
	}

	//2.�鿴�ҵĸ�����Ϣ
	@Test
	public void myInformation(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.myInformation();
	}
	
	//3.�鿴����
	@Test
	public void guanyu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.guanyu();
	}
	
	//4.�鿴��˽����
	@Test
	public void yinsitiaokuan(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.yinsitiaokuan();
	}
	
	//5.�鿴��������
	@Test
	public void xuanxuanGuanwang(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.xuanxuanGuanwang();
	}
	

	//6.����������
	@Test
	public void createTaolunzu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Create();
		
	}
		
	//7.�ղ�������
	@Test
	public void shoucangTaolunzu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Shoucang();	
	}
	
	//8.ȡ���ղ�������
	@Test
	public void quxiaoshoucangTaolunzu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.quxiaoshoucangTaolunzu();	
	}
	
	//9.�鿴�������Ա
	@Test
	public void taolunzu_Numbers(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Numbers();	
	}
	
	//10.������������
	@Test
	public void rename(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Rename();	
	}
	//11.ȡ��������������
	@Test
	public void cancelRename(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.cancelRename();
	}
	//12.���������з���ͼƬ
	@Test
	public void sendPicture(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.sendPictureInAlbum();
	}
	//13.�������鴴������
	@Test
	public void chatTaolunzu() {
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.chatTaolunzu();
	}
	//14.ͬ���������������Ϣ
	@Test
	public void taolunzuNews(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_news();
	}
	
	//15.���������з����ı�����
	@Test
	public void seadNews(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.send_news();
	}
	//16.�˳�������
	@Test
	public void exitTaolunzu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.exittaolunzu();
	}
	//17.�鿴��ϵ������
	@Test
	public void lianxirenInformation(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.lianxirenInformation();
	}
	
	//18.�ղ���ϵ��
	@Test
	public void shoucanglianxiren(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.shoucanglianxiren();
	}
	
	//19.���ʼ�
	@Test
	public void sendEmail(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.sendEmail();
	}
	//20.�˳���¼
	@Test
	public void quitXuanxuan(){
		xuanxuan=new XuanxuanPage1(driver);
		xuanxuan.quitXuanxuan();		
	}

}
