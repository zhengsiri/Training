package com.example.mytest;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.Before;
import org.junit.Test;

public class XuanxuanDemo {
    Instrumentation mInstrumentation;
    UiDevice mDevice;

    @Before
    public void startup() throws RemoteException, InterruptedException {
        //获取设备
        mInstrumentation = InstrumentationRegistry.getInstrumentation();
        mDevice = UiDevice.getInstance(mInstrumentation);
        //按键home
        mDevice.pressHome();
        //判断是否锁屏
        boolean status = mDevice.isScreenOn();
        if (!status) {
            mDevice.wakeUp();
        }
        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
    }

    //  1.确认注销登录
   @Test
	public void test0l() throws InterruptedException {
		  mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("注销")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("确认")).click();
		  Thread.sleep(3000);
	}

    //  2.取消注销登录
   @Test
	public void test02() throws InterruptedException {
		  mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("注销")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("取消")).click();
		  Thread.sleep(3000);
	}


    //  3.查看登录用户个人信息
    @Test
    public void test03() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mD.findObject(By.text("Z\n" + "zhengxinrui\n" + "  @zhengxinrui\n" + "http://192.168.13.142:11443")).click();
        Thread.sleep(3000);
        UiScrollable scrollable = new UiScrollable(new UiSelector().className("android.widget.ScrollView"));
        scrollable.flingToEnd(5);
    }

     // 4.查看隐私条款
    @Test
	public void test04() throws InterruptedException {
        mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.text("显示菜单")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("关于")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("隐私条款")).click();
	    Thread.sleep(3000);
	} 
    //  5.查看关于
    @Test
    public void test05() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("关于")).click();
        Thread.sleep(5000);
        mDevice.findObject(By.text("关闭")).click();
    }

    
    //  6.查看喧喧官网
    @Test
    public void test06() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("关于")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("http://xuan.im")).click();
        Thread.sleep(3000);
        UiScrollable scrollable = new UiScrollable(new UiSelector().className("android.webkit.WebView"));
    }

     // 7.发邮件

    @Test
    public void test07() throws InterruptedException {
        mDevice.findObject(By.text("Z\n" + "zhengxinrui\n" + "  @zhengxinrui\n" + "http://192.168.13.142:11443")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("Email\n" + "2813373214@qq.com")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //  8.收藏讨论组
    @Test
    public void test08() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("群\n" + "vvv\n" + "3人")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("收藏")).click();
    }

     // 9.取消收藏讨论组
    @Test
    public void test09() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("群\n" + "vvv\n" + "3人")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("取消收藏")).click();
    }

    //  10.查看讨论组的成员列表
    @Test
    public void test10() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("群\n" + "vvv\n" + "3人")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("成员列表")).click();
    }

     // 11.收藏联系人
    @Test
    public void test11() throws InterruptedException {
        mDevice.findObject(By.text("L\n" + "lisi\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("收藏")).click();
        Thread.sleep(3000);
    }

     // 12.取消收藏联系人
    @Test
    public void test12() throws InterruptedException {
        mDevice.findObject(By.text("L\n" + "lisi\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("取消收藏")).click();
        Thread.sleep(3000);
    }

     // 13.联系人资料
    @Test
    public void test13() throws InterruptedException {
        mDevice.findObject(By.text("L\n" + "lisi\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("资料")).click();
        Thread.sleep(3000);
    }

     // 14.查看所有联系人
    @Test
    public void test14() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.text("联系人\n" + "第 3 个标签，共 4 个")).click();
        Thread.sleep(3000);
    }
    // 15.同步讨论组最新消息
    @Test
    public void test15() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("群\n" + "vvv\n" + "3人")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("同步最新消息")).click();
    }

    //  16.收藏与联系人的聊天
    @Test
    public void test16() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.text("聊天\n" + "第 1 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("L\n" + "lisi\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("收藏")).click();
    }
    
    //  17.查看聊天对象
    @Test
    public void test17() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.text("聊天\n" + "第 1 个标签，共 4 个")).click();
        Thread.sleep(3000);
    }

    //  18.取消收藏与联系人的聊天
    @Test
    public void test18() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.text("聊天\n" + "第 1 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("L\n" + "lisi\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("取消收藏")).click();
    }

     // 19.给联系人发消息
    @Test
    public void test19() throws InterruptedException{
        mDevice.findObject(By.text("联系人\n" + "第 3 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("L\n" + "lisi\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("开聊")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("发送其他内容")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("照片")).click();
        Thread.sleep(3000);
    }
     // 20.确认退出登录
    @Test
    public void test20() throws InterruptedException {
        mDevice.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("注销")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("确认")).click();
    }

}