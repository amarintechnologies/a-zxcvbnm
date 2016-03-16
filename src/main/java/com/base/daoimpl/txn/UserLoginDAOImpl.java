

package com.base.daoimpl.txn;



import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.txn.UserLoginDAO;
import com.base.domain.txn.UserLoginDM;


@Repository
public class UserLoginDAOImpl implements UserLoginDAO{

	@Autowired
	private SessionFactory sessionfactory;
	
	/**
	 * to save the user login list in data base
	 * 
	 * 
	 * 
	 */
	public void saveMBaseuserLoginList (UserLoginDM mbaseUserLogin) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(mbaseUserLogin);
	}

	/**
	 * To update the log out date based on userloginid in MBaseUserLogin 
	 * 
	 * @param userloginid
	
	 */
	public void updateLogoutDateByMbaseUserLogin(Long userLoginId) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().createQuery("update  UserLoginDM ul set ul.logoutDate=sysdate where ul.loginRefId="+userLoginId).executeUpdate();
		
	}
	
	/**
	 * To get details from  MBaseUserLogin table depends on userid
	 * if userId = null it doesnot return any value
	 * else it returns value from MBaseUserLogin based on userid from MBaseUser
	 * 
	 * @param userId
	 * 
	 * @return list
	 * 
	 */
	
	public List<UserLoginDM> getUserLoginList(Long userId,Long companyId)
	{
		String sql = "select m from UserLoginDM m where m.userId ="+userId;
		System.out.println("Userlogin query--->>"+sql);
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		return query.list();
	}

}
