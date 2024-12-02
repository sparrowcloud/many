
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

@SuppressWarnings("deprecation")

public class Sample063 extends HttpServlet {

/**
*
*/
private static final long serialVersionUID = -552992659306097501L;


public Sample063() {
    try {
        Class<?> c = Class.forName("test.rule.Test");/* BUG */
        System.out.println(c);
    } catch (ClassNotFoundException e) {
        System.out.println(e);
    }
}

public final static String[] str = new String[] {};/* BUG */

String retNullSample063() {
    return null;
}

public BufferedInputStream getInputStreamSample063() {
    String pass = null;
    int x = 10;
    int i = 0;
    
BufferedInputStream is = null;

try {
    is = new BufferedInputStream(new FileInputStream(new File("")));
    if (pass == null) {
        x = i + x;
    }
} catch (IOException e) {
    System.out.println("error!");
}

return is;
}

void nullDeSample063() {
    
    String x = retNullSample063();
    String y = "zxcv";
    String z = "z";
        
    x = x.toString();
    y = y.toString();
    z.toString(); // BUG
}

public void test_resource_leakSample063() throws IOException {
BufferedInputStream i = getInputStreamSample063();

if (i == null) {
                // return;
}

System.out.print(i.read());

System.out.println("nothing.");

} /* BUG */

public void test_finalizeSample063() throws Throwable {
try {
finalize(); /* BUG */
} catch (Exception e) {

}
}

public void test_gcSample063() {
System.gc();
}

public void test_direct_management_of_connectionsSample063() {
try {
Connection conn = DriverManager.getConnection("localhost");/* BUG */
System.out.println(conn.getAutoCommit());
} catch (SQLException e) {
System.out.println(e);
}
}

public void doGet() {
try {
Connection conn = DriverManager.getConnection("localhost");/* BUG */
System.out.println(conn);
} catch (SQLException e) {
System.out.println(e);
}
try {
Socket sock = new Socket("localhost", 21);/* BUG */
System.out.println(sock);
} catch (UnknownHostException e) {
System.out.println(e);
} catch (IOException e) {
e.printStackTrace();
}
new Thread();
System.exit(1);
}

public native void testJNISample063();

public boolean equals(Sample063 obj) { /* BUG */
return true;
}

public void finalize() {/* BUG */
try {
Connection conn = DriverManager.getConnection("localhost", "id", "pw");/* BUG */
System.out.println(conn);
} catch (SQLException e) {
System.out.println(e);
}
}

public void test_arraySample063() {
ArrayList<String> list = new ArrayList<String>();
list.add("abc");
list.add("def");
String[] str = (String[]) list.toArray(); /* BUG */
System.out.println(str);
}

public void httpSession() {
HttpSession httpSession = new HttpSession() {

public Object getAttribute(String s) {
return null;
}

public Enumeration<?> getAttributeNames() {
return null;
}

public long getCreationTime() {
return 0;
}

public String getId() {
return null;
}


public long getLastAccessedTime() {
return 0;
}


public int getMaxInactiveInterval() {
return 0;
}


public ServletContext getServletContext() {
return null;
}


public HttpSessionContext getSessionContext() {
return null;
}


public Object getValue(String s) {
return null;
}


public String[] getValueNames() {
return null;
}


public void invalidate() {

}


public boolean isNew() {
return false;
}


public void putValue(String s, Object obj) {

}


public void removeAttribute(String s) {

}


public void removeValue(String s) {

}


public void setAttribute(String s, Object obj) {

}


public void setMaxInactiveInterval(int i) {

}

};
httpSession.setMaxInactiveInterval(-1);/* BUG */
}

public void testRule2Sample063() {
int[] arr = { 1, 2, 3 };
int[] brr = { 4, 5, 6 };
if (arr.equals(brr)) { /* BUG */
System.out.println("arr and brr is equal.");
} else {
System.out.println("arr and brr is not equal.");
}
}

public void bad_nextSample063(Collection<Object> c) {
Iterator<Object> it = c.iterator();
System.out.println(it.next()); /* BUG */
}

String name;

public boolean equals(Object o) { /* BUG */
Sample063 other = (Sample063) o;
return (other.name.equals(""));
}

public void process_controlSample063() {
System.load("C:\\java\\bin\\rmi.dll");
}

public static Connection con;

@SuppressWarnings("finally")
public int test_return_finallySample063(File file) {
try {
file.delete();
} catch (NumberFormatException e) {
System.out.println(e);
} finally {
return 0;
}
}

public static String x;

public void assignSample063() {
if (x == null) {
x = "not null";
}
}

public void messedloopSample063() {
for (int i = 0, kkkk = 0; i < 5; i++) { /* BUG */
for (int j = 0; j < 5; i++) {
System.out.println("Messed loop incrementer " + kkkk);
}
}
}
public String tostring() { // bug /* BUG */
return "abc";
}

public void missing_defaultSample063(int x) {
switch (x) {
case 0:
System.out.println(0);
}
}

public int octalSample063() {
int octal = 0377; // poor/* BUG */
return octal;
}

private List<String> a;

public List<String> getASample063() {
return a;
}

public void weakSample063() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
            // algorithm (DES).
SecretKey key = KeyGenerator.getInstance("DES").generateKey();
Cipher cipher = Cipher.getInstance("DES"); // bad
cipher.init(Cipher.ENCRYPT_MODE, key);
            // Encode bytes as UTF8; strToBeEncrypted contains the inputstring
            // that is to be encrypted
            //byte[] encoded = strToBeEncrypted.getBytes("UTF8");
            // Perform encryption
            //byte[] encrypted = cipher.doFinal(encoded);

}



@SuppressWarnings("unused")
void testFoo0(){

System.out.println("Test Code 0");
int xxxx = 0;
int yyyy886949= 0;
}

}
