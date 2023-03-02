package primary.gather.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class e {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(01, new staff("tao", 20000, 01));
        map.put(02, new staff("lin", 30000, 02));
        map.put(03, new staff("qin", 10000, 03));

        Set keyset = map.keySet();
        for (Object key : keyset) {
            staff s = (staff) map.get(key);
            if(s.getSalary()>18000){
                System.out.println(s);
            }
        }
        System.out.println("====第二种====");
        Set set = map.entrySet();
        for (Object entry :set) {
            staff m = (staff)entry;
            System.out.println(m);
        }


    }
}

class staff {
    String name;
    double salary;
    int id;

    public staff(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "staff{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
