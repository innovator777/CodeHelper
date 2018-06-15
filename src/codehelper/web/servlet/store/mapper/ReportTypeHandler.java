package codehelper.web.servlet.store.mapper;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import codehelper.web.servlet.domain.ReportType;

public class ReportTypeHandler extends BaseTypeHandler<ReportType>{
	
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, ReportType parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setInt(i, parameter.getValue());
	}

	@Override
	public ReportType getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return ReportType.valueOf(rs.getInt(columnName));
	}

	@Override
	public ReportType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return ReportType.valueOf(rs.getInt(columnIndex));
	}

	@Override
	public ReportType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return ReportType.valueOf(cs.getInt(columnIndex));
	}
	
	
}
