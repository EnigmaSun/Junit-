package test.MyutilTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import code.Myutil.*;

@RunWith(Parameterized.class)
public class SimpleCalculationTest {

	@BeforeClass
	public static void setUp() throws Exception {

	}

	// 1.为测试类声明几个变量，分别用于存放期望值和测试所用数据
	private int Input1;
	private int Input2;
	private int expectResult;
	// // assertEquals(int,int,int)新方法中定义的允许误差值
	// private double delta = 0.1;

	// 2.为测试类声明一个带有参数的公共构造函数，并在其中为第1个环节中声明的几个变量赋值。
	public SimpleCalculationTest(int Input1, int Input2, int expectResult) {
		this.Input1 = Input1;
		this.Input2 = Input2;
		this.expectResult = expectResult;
	}

	/**
	 * 准备数据。数据的准备需要在一个方法中进行，该方法需要满足一定的要求：
	 * 
	 * 1）该方法必须由Parameters注解修饰 2）该方法必须为public static的 3）该方法必须返回Collection类型
	 * 4）该方法的名字不做要求 5）该方法没有参数
	 * 
	 * @return
	 */
	@Parameters
	@SuppressWarnings("unchecked")
	public static Collection<Object[]> testData() {
		Object[][] object = new Object[][] { { 1, 2, 3 }, { 2, 3, 5 }, { 2, 2, 4 } };
		return Arrays.asList(object);

	}

	@Test
	public void AddTest() {

		SimpleCalculation sc = new SimpleCalculation();
		int actResult = sc.Add(Input1, Input2);
		assertEquals(expectResult, actResult);
	}

	@AfterClass
	public static void tearDown() throws Exception {

	}
}
