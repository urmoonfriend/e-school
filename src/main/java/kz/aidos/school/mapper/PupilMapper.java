package kz.aidos.school.mapper;

import kz.aidos.school.model.Pupil;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PupilMapper {
    @Select("select * from pupils")
    public List<Pupil> findAll();

    @Insert("insert into pupils(first_name, last_name) values(#{pupil.first_name}, #{pupil.last_name} )")
    public void save(@Param("pupil") Pupil pupil);

    @Delete("delete from pupils where id=#{id}")
    public boolean delete(@Param("id") Long id);
}
