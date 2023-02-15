package com.blissstock.mappingSite.repository;

import java.util.List;

import com.blissstock.mappingSite.entity.CourseInfo;
import com.blissstock.mappingSite.entity.JoinCourseUser;
import com.blissstock.mappingSite.entity.UserInfo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinCourseUserRepository extends CrudRepository<JoinCourseUser, Long> {
    @Query(nativeQuery = true, value = "select * from join_course_user where course_id_fkey=:courseId and uid_fkey=:uid")
    public List<JoinCourseUser> findByCourseUser(@Param("courseId") Long courseId, @Param("uid") Long uid);

    List<JoinCourseUser> findByUserInfo(UserInfo userInfo);


    JoinCourseUser findByUserInfoAndCourseInfo(UserInfo userInfo, CourseInfo courseInfo);

    @Query(nativeQuery = true, value="select * from join_course_user where course_id_fkey=:courseId")
	public List<JoinCourseUser> findByCourseID(@Param("courseId")Long courseId);


    @Query(nativeQuery = true, value = "select * from join_course_user where course_id_fkey=:courseId and uid_fkey=:uid")
    public JoinCourseUser findByPayment(@Param("courseId") Long courseId, @Param("uid") Long uid);
}
