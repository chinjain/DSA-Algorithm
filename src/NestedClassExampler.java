
public class NestedClassExampler {
	int i = 10;
	static int j = 11;

	public static void main(String[] args) {

		DemoStatic static1 = new NestedClassExampler.DemoStatic();
		System.out.println();

		NestedClassExampler exampler = new NestedClassExampler();
		Demo demo = exampler.new Demo();

		System.out.println(j);
	}

	static class DemoStatic {

	}

	class Demo {

		NestedClassExampler classExampler = new NestedClassExampler();
		Demo demo = classExampler.new Demo();

		public void print() {
//			System.out.println(demo.j);
		}

	}

}
