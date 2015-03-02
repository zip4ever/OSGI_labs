package org.bhn.training.commands;

import org.bhn.training.api.Greeter;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import static org.osgi.framework.FrameworkUtil.getBundle;

/**
 * Created by KDAAU95 on 2/03/2015.
 */
public class GreeterCommands {

    public String greet(){
        BundleContext ctx = getBundle(org.bhn.training.api.Greeter.class).getBundleContext();
        ServiceReference ref = ctx.getServiceReference(org.bhn.training.api.Greeter.class.getName());
        Greeter greeter = (Greeter) ctx.getService(ref);
        return greeter.greet();
    }
}
