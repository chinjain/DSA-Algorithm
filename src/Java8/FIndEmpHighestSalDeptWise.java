package Java8;

import java.util.List;

public class FIndEmpHighestSalDeptWise {

    public static void main(String[] args) {

        List<Dept> list = List.of();

    }
}


class Dept{
    private int id;
    private String deptName;

    public Dept(int id, String deptName){
        this.id = id;
        this.deptName = deptName;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setDeptName(String deptName){
        this.deptName = deptName;
    }
}
