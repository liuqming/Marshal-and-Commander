

/**
 * @author Administrator
 * @version 1.0
 * @created 02-三月-2012 17:50:16
 */
public class 元帅 {

	private 陆军指挥官 a;
	private 空军指挥官 b;
	private 炮兵指挥官 c;
	public void 委任指挥官(陆军指挥官 A,空军指挥官 B,炮兵指挥官 C){
		a=A;
		b=B;
		c=C;
	}

	public void 下命令(){
		a.下命令();
		b.下命令();
		c.下命令();
	}

}