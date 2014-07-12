package ua.com.hata;

import java.util.Collection;
import java.util.Iterator;

import static java.lang.System.out;

/**
 * Created by Eugene on 05.07.2014.
 */
public class Factory {
    private static SiteUserDao siteUserDao = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public SiteUserDao getSiteUserDao(){
        if (siteUserDao == null){
            siteUserDao = new SiteUserDaoImpl();
        }
        return siteUserDao;
    }

    public static void main(String args[])  {
        Collection mails = Factory.getInstance().getSiteUserDao().getAllEmails();
        Iterator iterator = mails.iterator();
        while (iterator.hasNext()) {
            SiteUser user = (SiteUser) iterator.next();
            out.println(user.getMail());
        }

    }
}

