package service;
import java.util.List;


import entity.types;
import dao.TypeDao;

public class TypeService {
	TypeDao cDao=new TypeDao();
	
	public void insert(types t){ //����dao�������ɾ��
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
