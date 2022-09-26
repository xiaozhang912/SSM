package Interface;

public class T1 implements T1interface {
    @Override
    public void add(){
        System.out.println("add被重写");
    }

    @Override
    public void delete() {
        System.out.println("delete被重写");
    }

    public static void main(String[] args) {
        T1 n1 = new T1();
        n1.add();
        n1.delete();
    }
}
