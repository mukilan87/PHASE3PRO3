package project3.UserManager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project3.UserManager.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByName(String name);
}
