package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.UserBean;

@Component
public class UserDao {
	@Autowired
	private JdbcTemplate db;
	public void insertData(UserBean bean) {
		String sql = "insert into usertb values(?, ?, ?)";
		db.update(sql, bean.getUserId(), bean.getUserPw(), bean.getUserName());
	}

}
