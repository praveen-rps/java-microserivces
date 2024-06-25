package com.examples.springjdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CommentsRowMapper implements RowMapper<Comments> {

	@Override
	public Comments mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return new Comments(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
	}
}
