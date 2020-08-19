package jbr.springmvc.service;

import jbr.springmvc.model.BookInfo;

public interface BookInfoService {


  BookInfo getBookDetailsByUsername(String username);

  int save(BookInfo bookInfo);
}
