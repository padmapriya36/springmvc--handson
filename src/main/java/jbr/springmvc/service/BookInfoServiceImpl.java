package jbr.springmvc.service;

import jbr.springmvc.dao.BookInfoDao;


import jbr.springmvc.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;

public class BookInfoServiceImpl implements BookInfoService {

  @Autowired
  public BookInfoDao userBookInfoDao;

  @Override
  public BookInfo getBookDetailsByUsername(String username) {

    return userBookInfoDao.getBookDetailsByUsername(username);
  }

  @Override
  public int save(BookInfo bookInfo) {

    return userBookInfoDao.save(bookInfo);
  }
}



