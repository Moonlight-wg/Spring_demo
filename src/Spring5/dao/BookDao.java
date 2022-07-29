package Spring5.dao;

import Spring5.entity.Book;

public interface BookDao {
    void add(Book book);

    void update(Book book);

    void delete(String id);

    int selectCount();

    Book findBookInfo(String id);


}
