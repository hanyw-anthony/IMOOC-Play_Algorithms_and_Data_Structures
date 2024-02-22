import java.util.Objects;

/**
 * 课前实现的Student类，用于测试泛型算法
 */
public class MyStudent {

    private String name;

    public static MyStudent[] samples = {
            new MyStudent("Zhang San"),
            new MyStudent("Li Si"),
            new MyStudent("Wang Wu"),
    };

    public MyStudent(String name) {
        setName(name);
    }

    public void setName(String name) {
        String _name = name.trim();
        if (!_name.isEmpty()) {
            this.name = _name;
        }
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object other) {
        try {
            MyStudent student = (MyStudent) other;
            return Objects.equals(this.name, student.name);
        } catch (Exception e) {
            return false;
        }
    }
}
