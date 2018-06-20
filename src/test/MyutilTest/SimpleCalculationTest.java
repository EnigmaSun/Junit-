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

	// 1.Ϊ���������������������ֱ����ڴ������ֵ�Ͳ�����������
	private int Input1;
	private int Input2;
	private int expectResult;
	// // assertEquals(int,int,int)�·����ж�����������ֵ
	// private double delta = 0.1;

	// 2.Ϊ����������һ�����в����Ĺ������캯������������Ϊ��1�������������ļ���������ֵ��
	public SimpleCalculationTest(int Input1, int Input2, int expectResult) {
		this.Input1 = Input1;
		this.Input2 = Input2;
		this.expectResult = expectResult;
	}

	/**
	 * ׼�����ݡ����ݵ�׼����Ҫ��һ�������н��У��÷�����Ҫ����һ����Ҫ��
	 * 
	 * 1���÷���������Parametersע������ 2���÷�������Ϊpublic static�� 3���÷������뷵��Collection����
	 * 4���÷��������ֲ���Ҫ�� 5���÷���û�в���
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
