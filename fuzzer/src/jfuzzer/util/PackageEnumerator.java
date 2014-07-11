package jfuzzer.util;

/**
 * Class: ListPackages
 * @author  Donald Raikes <don.raikes@nyu.edu>
 * @version 1.0
 * 
 * <p>This class lists all available packages in the current classpath.</p>
 */

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.io.*;


public class PackageEnumerator {
    public PackageEnumerator() {
        super();
	System.out.println("Package List:\n");
        for(Package p : Package.getPackages()) {
           System.out.println("\t"+p.getName());
        }

    }
}
