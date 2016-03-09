
package com.kone.cth.FuseOnEapCxfMock;

import javax.jws.WebService;

@WebService(endpointInterface = "com.kone.cth.FuseOnEapCxfMock.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
    	System.out.println("Calling webservice : " + text);
        return "Hello " + text;
    }
}

