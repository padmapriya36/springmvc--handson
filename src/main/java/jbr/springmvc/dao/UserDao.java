package jbr.springmvc.dao;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

  int register(User user);

  User validateUser(Login login);

  User getUser(String username);
}
