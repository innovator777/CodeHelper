package codehelper.web.servlet.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import codehelper.web.servlet.domain.Report;
import codehelper.web.servlet.store.ReportStore;
import codehelper.web.servlet.store.mapper.ReportMapper;

public class ReportStoreLogic implements ReportStore{

	CodeHelperSessionFactory factory;
	
	public ReportStoreLogic() {
		factory = CodeHelperSessionFactory.getInstance();
	}
	
	@Override
	public int create(Report report) {
		SqlSession session = factory.getSession();
		int result = 0;
		try {
			ReportMapper mapper = session.getMapper(ReportMapper.class);
			result = mapper.create(report);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		return result;
	}

	@Override
	public void update(Report report) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Report> retrieveAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
