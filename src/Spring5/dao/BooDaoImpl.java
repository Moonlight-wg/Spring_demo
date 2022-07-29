package Spring5.dao;

import Spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BooDaoImpl implements BookDao{

    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加方法
    @Override
    public void add(Book book) {
//        1.编写sql语句
        String sql = "insert into t_book values(?,?,?)";
        //2.调用方法实现
        Object[] args = { book.getId(), book.getName(), book.getUataus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void update(Book book) {
        //        1.编写sql语句
        String sql = "update  t_book set name = ?,uataus = ? where id = ?";
        //2.调用方法实现
        Object[] args = {book.getName(), book.getUataus(),book.getId()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        //        1.编写sql语句
        String sql = "delete from t_book where id = ?";
        //2.调用方法实现

        int update = jdbcTemplate.update(sql,id);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        //        1.编写sql语句
        String sql = "select count(*) from t_book";
        //2.调用方法实现
        Integer count = jdbcTemplate.queryForObject(sql,Integer.class);

        return count;
    }

    @Override
    public Book findBookInfo(String id) {
        //        1.编写sql语句
        String sql = "select * from t_book where id = ?";
        //2.调用方法实现
        Book book = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }

//    @Override
//    public List<Book> findAllBook() {
//        //        1.编写sql语句
//        String sql = "select * from t_book";
//        //2.调用方法实现
//        List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
//        return query;
//    }
}
