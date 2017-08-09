package design.action.visitor;

// 此模式是为什么呢 因为我们经常写的时候 会讲对象和其功能放置在一块
// 但是有些情况下 防止类被污染 也就是类不允许修改时 我们可以将所有的操作放到Subject内

// 简单的说 就是 visitor方法 可以不用修改 ，一旦业务有需要修改的地方 只需要修改 Subject的内的方法就可以了。
// 作用: 解偶、 数据结构 和 动作 分开
public class VisitorTest {
	public static void main(String[] args) {
		Visitor visitor = new MyVisitor(); 
		Subject subject = new MySubject();
		subject.accept(visitor);
	}

}
