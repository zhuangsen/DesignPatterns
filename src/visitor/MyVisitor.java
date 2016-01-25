package visitor;

public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject subject) {
		System.out.println("visitor the subject:"+subject.getSubject());
	}

}
