
public class JPA02 {
	static String test(int a,int b,int c) {

        if ( (a+b>c) && (b+c>a) && (c+a>b) ) {
            if ( (a*a+b*b==c*c) || (b*b+c*c==a*a) || (c*c+a*a==b*b) ) {
                return "直角三角形";
            }
            else if ( (a*a+b*b<c*c) || (b*b+c*c<a*a) || (c*c+a*a<b*b) ) {
                return "鈍角三角形";
            }
            else {
                return "銳角三角形";
            }
        } else {
            return "不可以構成三角形";
        }
    }
	
}
