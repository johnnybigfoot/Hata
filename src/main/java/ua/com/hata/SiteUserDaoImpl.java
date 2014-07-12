package ua.com.hata;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.lang.System.out;

/**
 * Created by Eugene on 05.07.2014.
 */
public class SiteUserDaoImpl implements SiteUserDao {
    @Override
    public Collection<String> getAllEmails() {
        Session session = null;
        List<String> emails = new ArrayList<String>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            emails = session.createCriteria(SiteUser.class).list();
        } catch (Exception e) {
            out.println("Excetption" +e.getMessage());
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return emails;
    }
}
