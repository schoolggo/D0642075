
public class JPA02 {
	static String test(int a,int b,int c) {

        if ( (a+b>c) && (b+c>a) && (c+a>b) ) {
            if ( (a*a+b*b==c*c) || (b*b+c*c==a*a) || (c*c+a*a==b*b) ) {
                return "�����T����";
            }
            else if ( (a*a+b*b<c*c) || (b*b+c*c<a*a) || (c*c+a*a<b*b) ) {
                return "�w���T����";
            }
            else {
                return "�U���T����";
            }
        } else {
            return "���i�H�c���T����";
        }
    }
	
}
