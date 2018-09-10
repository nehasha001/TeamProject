package com.example.demo.hibernate;
import com.example.demo.model.AdminLogin;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

    public class HibernateUtil {
        private static SessionFactory sessionFactory = buildSessionFactory();
        private static SessionFactory buildSessionFactory(){
            Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(AdminLogin.class);
            ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            return configuration.buildSessionFactory(serviceRegistry);
        }

        public static SessionFactory getSessionFactory() {

            return  sessionFactory;
        }
    }


