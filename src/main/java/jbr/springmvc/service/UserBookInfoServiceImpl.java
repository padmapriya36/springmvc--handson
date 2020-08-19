package jbr.springmvc.service;


import jbr.springmvc.model.BookInfo;
import jbr.springmvc.model.User;
import jbr.springmvc.model.UserBookInfo;

public class UserBookInfoServiceImpl implements UserBookInfoService {

  private UserService userService;
  private BookInfoService bookInfoService;


  public UserBookInfo getUserBookDetails(String username) {
    final UserBookInfo userBookInfo = new UserBookInfo();
    User user = userService.getUser(username);
    BookInfo bookInfo = bookInfoService.getBookDetailsByUsername(username);
    userBookInfo.setFirstName(user.getFirstName());
    userBookInfo.setLastName(user.getLastName());
    userBookInfo.setBookName(bookInfo.getBookName());
    userBookInfo.setBookDescription(bookInfo.getBookDescription());
    return userBookInfo;
  }

  public UserService getUserService() {
    return userService;
  }

  public void setUserService(UserService userService) {
    this.userService = userService;
  }

  public BookInfoService getBookInfoService() {
    return bookInfoService;
  }

  public void setBookInfoService(BookInfoService bookInfoService) {
    this.bookInfoService = bookInfoService;
  }
}
