import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.*;

public class SubStringCheck {
//  static int count = 0;
  private static boolean filterCookie(List<HashMap> cookies)
  {
    try
    {
      for (HashMap<String, Object> cookie : cookies)
      {
        List<Boolean> boolResponse = new ArrayList<>();
        for(Object value : cookie.values())
        {
          boolResponse.add(sanitize(value));
        }
        if (boolResponse.contains(false))
        {
          return false;
        }
      }
    }
        catch (Exception e)
    {
      System.out.println("Exception message: " + e.getMessage());
      e.printStackTrace();
    }
    return true;
  }

  private static boolean sanitize(Object value)
  {
    if (value == null)
    {
//      count++;
      return true;
    }

    List<String> restrictedChar = Arrays.asList("\n", "\r", "\0", "\t", "\\");

    for (String c : restrictedChar) {
      if (value.toString().contains(c)) {
//        count++;
        return false;
      }
    }
//    count++;
    return true;
  }

  public static void main(String[] args) {
    List<HashMap> cookies = new ArrayList<>();
    HashMap<String, Object> cookie1 = new HashMap<String, Object>();
    HashMap<String, Object> cookie2 = new HashMap<String, Object>();
    // Adding key-value pairs of different data types
    cookie1.put("value", "E8A1AB1D95AF477D86252B904028B259");
    cookie1.put("comment", null);
    cookie1.put("domain", null);
    cookie1.put("maxage", -1);
    cookie1.put("name", "JSESSIONID");
    cookie1.put("path", null);
    cookie1.put("secure", false);
    cookie1.put("version", 0);
    cookie1.put("class", "javax.servlet.http.Cookie");

    cookies.add(cookie1);

    cookie2.put("value", "F8A3E3T65Y:-,.-_~@!`,.?><|/#$%^&*(){}[]+=rn0t\t");
    cookie2.put("comment", null);
    cookie2.put("domain", null);
    cookie2.put("maxage", -1);
    cookie2.put("name", "dtCookie");
    cookie2.put("path", null);
    cookie2.put("secure", false);
    cookie2.put("version", 0);
    cookie2.put("class", "javax.servlet.http.Cookie");

    cookies.add(cookie2);

    boolean cookieEligibility = filterCookie(cookies);
    System.out.println("cookieEligibility = " + cookieEligibility);
  }
}




//          String key = null;
//          for (HashMap.Entry<String, Object> entry : cookie.entrySet()) {
//            if (entry.getValue().equals(value)) {
//              key = entry.getKey();
//            }
//          }
//          System.out.println("key = " + key);

//        boolResponse.add(sanitize(cookie.get("value")));
//        boolResponse.add(sanitize(cookie.get("comment")));
//        boolResponse.add(sanitize(cookie.get("domain")));
//        boolResponse.add(sanitize(cookie.get("maxage")));
//        boolResponse.add(sanitize(cookie.get("name")));
//        boolResponse.add(sanitize(cookie.get("path")));
//        boolResponse.add(sanitize(cookie.get("secure")));
//        boolResponse.add(sanitize(cookie.get("version")));
//        boolResponse.add(sanitize(cookie.get("class")));
