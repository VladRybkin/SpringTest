package ua.training.model.dao;


import org.springframework.jdbc.core.JdbcTemplate;


import javax.sql.DataSource;


public class UserDao {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;


    public UserDao(JdbcTemplate jdbcTemplate, DataSource dataSource) {
        this.jdbcTemplate = jdbcTemplate;
        this.dataSource = dataSource;
    }


    public void getAllUsers() {
        jdbcTemplate.execute("INSERT INTO `springjdbc`.`users 'user_id`,`user_name`) VALUES (1, 'Vladusers')");

    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
