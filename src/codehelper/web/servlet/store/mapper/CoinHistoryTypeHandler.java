package codehelper.web.servlet.store.mapper;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import codehelper.web.servlet.domain.CoinHistoryType;

public class CoinHistoryTypeHandler extends BaseTypeHandler<CoinHistoryType>{

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, CoinHistoryType parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setInt(i, parameter.getValue());
	}

	@Override
	public CoinHistoryType getNullableResult(ResultSet rs, String columnName) throws SQLException {
		// TODO Auto-generated method stub
		return CoinHistoryType.valueOf(rs.getInt(columnName));
	}

	@Override
	public CoinHistoryType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return CoinHistoryType.valueOf(rs.getInt(columnIndex));
	}

	@Override
	public CoinHistoryType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return CoinHistoryType.valueOf(cs.getInt(columnIndex));
	}

}
