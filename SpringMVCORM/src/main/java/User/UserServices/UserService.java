package User.UserServices;

import java.util.List;

import User.UserEntity.User;

public interface UserService {
	
	int save(User user);
	
	List<User> getUsers();
}
