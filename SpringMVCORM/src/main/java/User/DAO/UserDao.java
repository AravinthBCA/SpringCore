package User.DAO;

import java.util.List;

import User.UserEntity.User;

public interface UserDao {

	int create(User user);
	
	List<User> findUsers();
	
}
