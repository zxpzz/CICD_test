package cn.zz.mapper;

import cn.zz.pojo.Pojo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface Mapper extends BaseMapper<Pojo> {
    List<Pojo> list();
}
