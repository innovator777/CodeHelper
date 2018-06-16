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
			result = mapper.insert(report);
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
		SqlSession session = factory.getSession();
		try {
			ReportMapper mapper = session.getMapper(ReportMapper.class);
			mapper.update(report);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
	}

	@Override
	public List<Report> retrieveAll() {
		SqlSession session = factory.getSession();
		List<Report> result = null;
		try {
			ReportMapper mapper = session.getMapper(ReportMapper.class);
			result = mapper.retrieveAll();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		return result;
	}

	@Override
	public Report retrieveById(int id) {
		SqlSession session = factory.getSession();
		Report result = null;
		try {
			ReportMapper mapper = session.getMapper(ReportMapper.class);
			result = mapper.retrieveById(id);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		return result;
	}

}
