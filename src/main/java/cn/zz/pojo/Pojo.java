package cn.zz.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("users")
public class Pojo {
    int id;
    String uname;
    int age;
}
