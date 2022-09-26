package Modifier;

/**
 * 封装，通过getter，setter设置
 */
public class T1 {
    private String name;
    private String password;
    private int id;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    @Override
    public String toString() {
        return "T1{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.setName("张杨");
        t1.setPassword("123456");
        t1.setId(001);
        String result = t1.toString();
        System.out.println(result);
    }
}
