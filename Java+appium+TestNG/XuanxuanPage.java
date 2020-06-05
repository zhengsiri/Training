package edu.pages;

import edu.utils.BaseAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class XuanxuanPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public XuanxuanPage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	
	
	private AndroidElement btn_me() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]");
	}
	

	private AndroidElement btn_quit() {
		return driver.findElementByXPath("//*[@text='注销']");
	}
	

	private AndroidElement btn_ok1() {
		return driver.findElementByXPath("//*[@text='确认']");
	}

	private AndroidElement btn_taolunzu() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]");
	}
	

	private AndroidElement btn_create() {
		return driver.findElementByXPath("//*[@text='创建聊天']");
	}
	

	private AndroidElement btn_ok2() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
		

	private AndroidElement btn_ok3() {
		return driver.findElementByXPath("//*[@text='创建']");
	}
	

	private AndroidElement btn_caidan() {
		return driver.findElementByXPath("//*[@text='显示菜单']");
	}
	

	private AndroidElement btn_shoucang() {
		return driver.findElementByXPath("//*[@text='收藏']");
	}
	

	private AndroidElement btn_quxiaoshoucang() {
		return driver.findElementByXPath("//*[@text='取消收藏']");
	}
	

	private AndroidElement btn_submit() {
		return driver.findElementByXPath("//*[@text='登录']");
	}	


	private AndroidElement btn_listNumbers() {
		return driver.findElementByXPath("//*[@text='成员列表']");
	}
	

	private AndroidElement btn_rename() {
		return driver.findElementByXPath("//*[@text='重命名']");
	}
	

	private AndroidElement btn_news() {
		return driver.findElementByXPath("//*[@text='同步最近的消息']");
	}
	

	private AndroidElement btn_send() {
		return driver.findElementByXPath("//*[@text='发送']");
	}
	

	private AndroidElement btn_Information() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View");
	}
	

	private AndroidElement btn_guanyu() {
		return driver.findElementByXPath("//*[@text='关于']");
	}
	

	private AndroidElement btn_yinsitiaokuan() {
		return driver.findElementByXPath("//*[@text='隐私条款']");
	}
	

	private AndroidElement btn_lianxiren() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]");
	}
	

	private AndroidElement btn_kailiao() {
		return driver.findElementByXPath("//*[@text='开聊']");
	}
	

	private AndroidElement btn_ziliao() {
		return driver.findElementByXPath("//*[@text='资料']");
	}	
	
	private AndroidElement btn_email() {
		return driver.findElementByXPath("//*[@text='Email 2813373214@qq.com']");
	}
	private AndroidElement username() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
	}
	

	private AndroidElement password() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
	}
	

	private AndroidElement select_number1() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]");
	}
	

	private AndroidElement taolunzu_1() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}	
		

	private AndroidElement send_new() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}	
	

	private AndroidElement lianjie() {
		return driver.findElementByXPath("//*[@text='http://xuan.im']");
	}
	

	private AndroidElement lianxiren() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}


	
	
        //1.登录成功
	public void login() throws InterruptedException {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());
		action.click(username());
		driver.pressKey(new KeyEvent(AndroidKey.Z));
		driver.pressKey(new KeyEvent(AndroidKey.X));
		driver.pressKey(new KeyEvent(AndroidKey.R));
		action.click(password());
		driver.pressKey(new KeyEvent(AndroidKey.Z));
		driver.pressKey(new KeyEvent(AndroidKey.Z));
		driver.pressKey(new KeyEvent(AndroidKey.Z));
		driver.pressKey(new KeyEvent(AndroidKey.Z));
		driver.pressKey(new KeyEvent(AndroidKey.Z));
		driver.pressKey(new KeyEvent(AndroidKey.Z));
		action.click(btn_submit());		
	}
	//2.查看我的个人信息
	public void myInformation() {
		action.click(btn_me());
		action.click(btn_Information());
	}
	//3.查看关于
	public void guanyu() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
	}
	
	//4.查看隐私条款
	public void yinsiTiaokuan() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
		action.click(btn_yinsitiaokuan());
	}
	
	//5.查看喧喧官网
	public void xuanxuanGuanwang() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
		action.click(lianjie());
	}

	//6.创建讨论组
	public void createTaolunzu() {
		action.click(btn_taolunzu());
		action.click(btn_create());
		action.click(select_number1());
		action.click(btn_ok2());
		action.click(btn_ok3());	
	}
	
	//7.收藏讨论组
	public void shoucangTaolunzu() {
		action.click(taolunzu01());
		action.click(btn_caidan());
		action.click(btn_shoucang());
	}
	
	//8.取消收藏讨论组
	public void quxiaoshoucangTaolunzu() {
		action.click(taolunzu01());
		action.click(btn_caidan());
		action.click(btn_quxiaoshoucang());
	}
	
	//9.查看讨论组成员
	public void taolunzu_Numbers() {
		action.click(taolunzu01());
		action.click(btn_caidan());
		action.click(btn_listNumbers());
	}
	
	//10.讨论组重命名
	public void rename() {
		action.click(taolunzu01());
		action.click(btn_caidan());
		action.click(btn_rename());
		driver.pressKey(new KeyEvent(AndroidKey.V));
		driver.pressKey(new KeyEvent(AndroidKey.V));
		driver.pressKey(new KeyEvent(AndroidKey.V));
		action.click(btn_rename());
	}
	//11.取消讨论组重命名
	public void cancelRename(){
		action.click(taolunzu01());
		action.click(btn_menu());
		action.click(btn_rename());
		action.click(btn_cancelrename());
	}
	//12.在讨论组中发送图片

	public void sendPicture() throws InterruptedException{
		action.click(taolunzu01());
		action.click(sendPicture());
		action.click(Album());
	}
	//13.在讨论组创建聊天
	public void chatTaolunzu(){
		action.click(taolunzu01());
		action.click(createChat());
	}
	//14.同步讨论组的最新消息
	public void taolunzu_news() {
		action.click(taolunzu01());
		action.click(btn_caidan());
		action.click(btn_news());
	}
	
	//15.在讨论组内发送文本内容
	public void send_news() {
		action.click(taolunzu01());
		action.click(send_new());
		driver.pressKey(new KeyEvent(AndroidKey.L));
		driver.pressKey(new KeyEvent(AndroidKey.B));
		driver.pressKey(new KeyEvent(AndroidKey.N));
		driver.pressKey(new KeyEvent(AndroidKey.X));
		driver.pressKey(new KeyEvent(AndroidKey.N));
		action.click(btn_send());
	}
	//16.退出讨论组
	public void exitTaolunzu() throws InterruptedException{
		action.click(taolunzu01());
		action.click(btn_menu());
		action.click(btn_exit());
		action.click(exit_sure());
	}
	//17.查看联系人资料
	public void lianxirenInformation() {
		action.click(btn_lianxiren());
		action.click(lianxiren());
		action.click(btn_kailiao());
		action.click(btn_caidan());
		action.click(btn_ziliao());	
	}
	
	//18.收藏联系人
	public void shoucanglianxiren() {
		action.click(btn_lianxiren());
		action.click(lianxiren());
		action.click(btn_shoucang());
	}

	//19.发邮件
	public void sendEmail() {
		action.click(zhengxinrui());
		action.click(btn_caidan());
		action.click(btn_ziliao());
		action.clear(btn_email());
	}
	//20.退出登录
	public void quitXuanxuan() {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());	
	}



}
