package service;
import java.util.List;


import entity.types;
import dao.TypeDao;

public class TypeService {
	TypeDao cDao=new TypeDao();
	
	public void insert(types t){ //调用dao层的增改删查
		cDao.insert(t);
	}
	public void delete(String name){
		cDao.delete(name);
		
	}
	public void update(types t,int id){
		cDao.update(t, id);
	}
	public types select(String name){
		return cDao.select(name);
	}
}
