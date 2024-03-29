package com.mycompany.mavenhelloserviceimpl;

import com.mycompany.mavenhelloserviceapi.Hello;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        System.out.println("HelloActivator::start");
        context.registerService(Hello.class.getName(), new HelloImpl(), null);
        System.out.println("HelloActivator::registration of Hello service successful");
    }

    public void stop(BundleContext context) throws Exception {
        context.ungetService(context.getServiceReference(Hello.class.getName()));
        System.out.println("HelloActivator stopped");
    }

}
