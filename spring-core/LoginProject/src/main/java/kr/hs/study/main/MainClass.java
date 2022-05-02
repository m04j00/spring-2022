package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.UserBean;
import kr.hs.study.config.ConfigBeanClass;
import kr.hs.study.dao.UserDao;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(ConfigBeanClass.class);
		UserDao userDao = anno.getBean(UserDao.class);
		UserBean userBean = anno.getBean(UserBean.class);
		
		userBean.setUserId("kim");
		userBean.setUserPw("1111");
		userBean.setUserName("��ٸ�");
		userDao.insertData(userBean);
		userBean.setUserId("lee");
		userBean.setUserPw("2222");
		userBean.setUserName("�̷δ�");
		userDao.insertData(userBean);
		userBean.setUserId("park");
		userBean.setUserPw("3333");
		userBean.setUserName("��ȣ��");
		userDao.insertData(userBean);
		anno.close();
	}

}