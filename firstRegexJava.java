//First Regex example by JAVA
import java.util.regex.*;
class firstRegexJava{
public static void main(String [] args) {
Pattern p = Pattern.compile(args[0]);
Matcher m = p.matcher(args[1]);
System.out.println("Pattern is " + m.pattern());
while(m.find()) {
System.out.println(m.start() + " " + m.group());
}
}
}