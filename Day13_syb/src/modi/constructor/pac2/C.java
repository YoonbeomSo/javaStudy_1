package modi.constructor.pac2;

import modi.constructor.pac1.*;

public class C {

	A a1 = new A(true);  //public생성자 호출(o) > 다른 패키지에서는 해당 패키지 import 해줘야 함.
//	A a2 = new A(1);	 //p.f생성자 호출(o) > 다른 패키지에서 사용 불가
//	A a3 = new A("GO");  //private생성자 호출(x) > 다른 class에서 사용불가

}
