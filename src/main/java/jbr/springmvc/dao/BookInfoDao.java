package jbr.springmvc.dao;


import jbr.springmvc.model.BookInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface BookInfoDao {


  BookInfo getBookDetailsByUsername(String username);

  int save(BookInfo bookInfo);
}
