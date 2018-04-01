package testprotobuf;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;

public class Test {

	public static void main(String[] args) {
		
		C c = new C();
		c.setA("dwqdwefewg");
		c.setB(38754365);
		c.setC(1);
		c.setD("duhwihwuie");
		
		A a = new A();
		a.setA("dwekufhwfhwhkefhwej");
		a.setB(18372434);
		a.setC(545946496969866496L);
		a.setD("48383898");
		a.setE(c);
	
		Schema schema = RuntimeSchema.getSchema(a.getClass());
		System.out.println("proto:" + new String(ProtobufIOUtil.toByteArray(a, schema, LinkedBuffer.allocate(256))));
	}
}


/**
 输出结果:
  proto:
  dwekufhwfhwhkefhwejҮ����Ҥ���"48383898*

  dwqdwefewg���

  结论：
  被加了Tag注解了类，其中的自定义类变量的每个属性都会被序列化，但是变量的子类的属性不会被序列化
*/