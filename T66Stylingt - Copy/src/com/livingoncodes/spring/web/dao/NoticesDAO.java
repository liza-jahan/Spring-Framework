package com.livingoncodes.spring.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;

@Component("noticesDao")
public class NoticesDAO {

	private NamedParameterJdbcTemplate jdbc;
  public NoticesDAO(){
	  System.out.println("pp");
	  
  }
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Notice> getNotices() {

		return jdbc.query("select * from notice", new RowMapper<Notice>() {

			public Notice mapRow(ResultSet rs, int rowNum) throws SQLException {
				Notice notice = new Notice();

				notice.setId(rs.getInt("id"));
				notice.setName(rs.getString("name"));
				notice.setEmail(rs.getString("email"));
			

				return notice;
			}

		});

	}

	public boolean delete(int id) {

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);

		return jdbc.update("delete from notice where id = :id", params) == 1;

	}
	
	public boolean update(Notice notice) {

		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(notice);
		
		return jdbc.update("update notice set name=:name, email=:email where id=:id", params) == 1;
	}
	
	public int[] create(List<Notice> notices) {
		
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(notices.toArray());
		
		return jdbc.batchUpdate("insert into notice (name, email) values (:name, :email)", params);
	}
	

	public boolean create(Notice notice) {

		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(notice);
		
		return jdbc.update("insert into notice (name, email) values (:name, :email)", params) == 1;
	}
	
	public Notice getNotice(int id) {

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);

		return jdbc.queryForObject("select * from notice where id = :id",
				params, new RowMapper<Notice>() {

					public Notice mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Notice notice = new Notice();

						notice.setId(rs.getInt("id"));
						notice.setName(rs.getString("name"));
						notice.setEmail(rs.getString("email"));
						

						return notice;
					}

				});

	}

}
