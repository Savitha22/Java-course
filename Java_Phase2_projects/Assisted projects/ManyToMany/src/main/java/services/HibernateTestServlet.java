package services;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




import beans.UserEntity;
import beans.SubscriptionEntity;



@WebServlet("/HibernateTestServlet")
public class HibernateTestServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	void register(Set<UserEntity> rlist){
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		for(UserEntity obj :rlist){
		session.save(obj);
		}
		
		session.getTransaction().commit();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//Add Readers in Set
				Set<UserEntity> rlist=new HashSet<UserEntity>();
				
				UserEntity readerone=new UserEntity();
				readerone.setUser_name("Kanika");
				UserEntity readertwo=new UserEntity();
				readertwo.setUser_name("Manika");
				
				rlist.add(readerone);
				rlist.add(readertwo);
				
				//Add Subscriptions in Set
				Set<SubscriptionEntity> slist=new HashSet<SubscriptionEntity>();
			    
				SubscriptionEntity sone=new SubscriptionEntity();
			     sone.setSubsname("primevideo");
			     
			     SubscriptionEntity stwo=new SubscriptionEntity();
			     stwo.setSubsname("hotstar");
			     slist.add(sone);
			     slist.add(stwo);
			     
			     readerone.setSubscriptions(slist);
			     readertwo.setSubscriptions(slist);
			    
			     sone.setReaders(rlist);
			     stwo.setReaders(rlist);
				    
		register(rlist);
	}

}
