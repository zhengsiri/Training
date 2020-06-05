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
		return driver.findElementByXPath("//*[@text='ע��']");
	}
	

	private AndroidElement btn_ok1() {
		return driver.findElementByXPath("//*[@text='ȷ��']");
	}

	private AndroidElement btn_taolunzu() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]");
	}
	

	private AndroidElement btn_create() {
		return driver.findElementByXPath("//*[@text='��������']");
	}
	

	private AndroidElement btn_ok2() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
		

	private AndroidElement btn_ok3() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	

	private AndroidElement btn_caidan() {
		return driver.findElementByXPath("//*[@text='��ʾ�˵�']");
	}
	

	private AndroidElement btn_shoucang() {
		return driver.findElementByXPath("//*[@text='�ղ�']");
	}
	

	private AndroidElement btn_quxiaoshoucang() {
		return driver.findElementByXPath("//*[@text='ȡ���ղ�']");
	}
	

	private AndroidElement btn_submit() {
		return driver.findElementByXPath("//*[@text='��¼']");
	}	


	private AndroidElement btn_listNumbers() {
		return driver.findElementByXPath("//*[@text='��Ա�б�']");
	}
	

	private AndroidElement btn_rename() {
		return driver.findElementByXPath("//*[@text='������']");
	}
	

	private AndroidElement btn_news() {
		return driver.findElementByXPath("//*[@text='ͬ���������Ϣ']");
	}
	

	private AndroidElement btn_send() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	

	private AndroidElement btn_Information() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View");
	}
	

	private AndroidElement btn_guanyu() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	

	private AndroidElement btn_yinsitiaokuan() {
		return driver.findElementByXPath("//*[@text='��˽����']");
	}
	

	private AndroidElement btn_lianxiren() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]");
	}
	

	private AndroidElement btn_kailiao() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	

	private AndroidElement btn_ziliao() {
		return driver.findElementByXPath("//*[@text='����']");
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


	
	
        //1.��¼�ɹ�
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
	//2.�鿴�ҵĸ�����Ϣ
	public void myInformation() {
		action.click(btn_me());
		action.click(btn_Information());
	}
	//3.�鿴����
	public void guanyu() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
	}
	
	//4.�鿴��˽����
	public void yinsiTiaokuan() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
		action.click(btn_yinsitiaokuan());
	}
	
	//5.�鿴��������
	public void xuanxuanGuanwang() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
		action.click(lianjie());
	}

	//6.����������
	public void createTaolunzu() {
		action.click(btn_taolunzu());
		action.click(btn_create());
		action.click(select_number1());
		action.click(btn_ok2());
		action.click(btn_ok3());	
	}
	
	//7.�ղ�������
	public void shoucangTaolunzu() {
		action.click(taolunzu01());
		action.click(btn_caidan());
		action.click(btn_shoucang());
	}
	
	//8.ȡ���ղ�������
	public void quxiaoshoucangTaolunzu() {
		action.click(taolunzu01());
		action.click(btn_caidan());
		action.click(btn_quxiaoshoucang());
	}
	
	//9.�鿴�������Ա
	public void taolunzu_Numbers() {
		action.click(taolunzu01());
		action.click(btn_caidan());
		action.click(btn_listNumbers());
	}
	
	//10.������������
	public void rename() {
		action.click(taolunzu01());
		action.click(btn_caidan());
		action.click(btn_rename());
		driver.pressKey(new KeyEvent(AndroidKey.V));
		driver.pressKey(new KeyEvent(AndroidKey.V));
		driver.pressKey(new KeyEvent(AndroidKey.V));
		action.click(btn_rename());
	}
	//11.ȡ��������������
	public void cancelRename(){
		action.click(taolunzu01());
		action.click(btn_menu());
		action.click(btn_rename());
		action.click(btn_cancelrename());
	}
	//12.���������з���ͼƬ

	public void sendPicture() throws InterruptedException{
		action.click(taolunzu01());
		action.click(sendPicture());
		action.click(Album());
	}
	//13.�������鴴������
	public void chatTaolunzu(){
		action.click(taolunzu01());
		action.click(createChat());
	}
	//14.ͬ���������������Ϣ
	public void taolunzu_news() {
		action.click(taolunzu01());
		action.click(btn_caidan());
		action.click(btn_news());
	}
	
	//15.���������ڷ����ı�����
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
	//16.�˳�������
	public void exitTaolunzu() throws InterruptedException{
		action.click(taolunzu01());
		action.click(btn_menu());
		action.click(btn_exit());
		action.click(exit_sure());
	}
	//17.�鿴��ϵ������
	public void lianxirenInformation() {
		action.click(btn_lianxiren());
		action.click(lianxiren());
		action.click(btn_kailiao());
		action.click(btn_caidan());
		action.click(btn_ziliao());	
	}
	
	//18.�ղ���ϵ��
	public void shoucanglianxiren() {
		action.click(btn_lianxiren());
		action.click(lianxiren());
		action.click(btn_shoucang());
	}

	//19.���ʼ�
	public void sendEmail() {
		action.click(zhengxinrui());
		action.click(btn_caidan());
		action.click(btn_ziliao());
		action.clear(btn_email());
	}
	//20.�˳���¼
	public void quitXuanxuan() {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());	
	}



}
