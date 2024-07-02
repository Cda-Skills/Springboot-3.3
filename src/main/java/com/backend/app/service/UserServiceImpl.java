package com.backend.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.app.model.User;
import com.backend.app.repository.UserRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User insert(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public List<User> findAll() {

		return (List<User>)this.userRepository.findAll();
	}

	@Override
	public void delete(int id) {
		this.userRepository.deleteById(id);
	}
	
    @Override
    public void deleteAll() {
    	this.userRepository.deleteAll();
    }
    
	@Override
	public User findById(int id) {
		return this.userRepository.findById(id).get();
	}

	@Override
	public User updateUser(int id, User user) {
		user.setId(id);
		return this.userRepository.save(user);
	}


}
