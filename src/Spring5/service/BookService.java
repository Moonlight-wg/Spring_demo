package Spring5.service;

import Spring5.dao.BookDao;
import Spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    //修改方法
    public void update(Book book){
        bookDao.update(book);
    }

    //删除方法
    public void delete(String id){
        bookDao.delete(id);
    }

    //查询多少条记录
    public int findCount(){
        return bookDao.selectCount();
    }

    //查询多少条记录
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }
//
//    public List<Book>findAll(){
//        return  bookDao.findAllBook();
//    }
}
