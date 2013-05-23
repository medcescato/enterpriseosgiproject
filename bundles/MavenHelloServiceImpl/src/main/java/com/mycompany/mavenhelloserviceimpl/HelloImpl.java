/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenhelloserviceimpl;

import com.mycompany.mavenhelloserviceapi.Hello;

/**
 *
 * @author zcpw
 */
public class HelloImpl implements Hello {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
