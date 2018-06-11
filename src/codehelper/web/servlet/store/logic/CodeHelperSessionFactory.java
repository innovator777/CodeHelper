package codehelper.web.servlet.store.logic;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class CodeHelperSessionFactory {
	
private static CodeHelperSessionFactory instance;
	
	private static SqlSessionFactory factory;
	private static final String resource = "mybatis-config.xml";
	
	private CodeHelperSessionFactory() {
		
	}
	
	public static CodeHelperSessionFactory getInstance() {
		if(instance == null)
			instance = new CodeHelperSessionFactory();
		
		return instance;
	}
	
	public SqlSession getSession() {
		if(factory == null) {
			Reader reader = null;
			
			try {
				reader = Resources.getResourceAsReader(resource);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
			factory = new SqlSessionFactoryBuilder().build(reader);
		}
		
		return factory.openSession();
	}


}
