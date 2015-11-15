package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	          
	    User u1=new User();  
	    u1.setId(115);  
	    u1.setUserName("sonoo");  
	     
	      
	    session.persist(u1);//persisting the object  
	      
	    t.commit();//transaction is committed  
	    session.close();  
	      
	    System.out.println("successfully saved");  
		
	}

}
