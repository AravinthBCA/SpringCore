package User.UserServices;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import User.DAO.UserDao;
import User.UserEntity.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		return dao.create(user);
	}

	@Override
	public List<User> getUsers() {
		List<User> users = dao.findUsers();
		Collections.sort(users) ;
		return users;
	}

	@Override
	public User getUser(Integer id) {
		return dao.findUser(id);
	}	
}
