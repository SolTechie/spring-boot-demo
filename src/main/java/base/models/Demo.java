package base.models;

import java.util.*;

public class Demo {

    private String name;
    private int id;
    private String desc;
    private List<String> tags;
    private Map<String, String> marks;

    public Demo(int id, String name) {
        this.id = id;
        this.name = name;
        this.desc = "由于这里没有设置get方法，所以在rest controller的请求返回json串中不会有这一项";
        this.tags = new ArrayList<String>(Arrays.asList("red", "blue", "green"));
        this.marks = new HashMap<String, String>() {{
            put("red", "R");
            put("blue", "B");
            put("green", "G");
        }};
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public Map<String, String> getMarks() {
        return this.marks;
    }

//    这里没有设置get方法，所以在rest controller的请求返回json串中不会有这一项
//    public String getDesc(){
//        return this.desc;
//    }

}
