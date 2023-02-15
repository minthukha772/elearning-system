package com.blissstock.mappingSite.repository;

import java.util.List;

import com.blissstock.mappingSite.entity.UserInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {
  @Query(nativeQuery = true, value = "SELECT * FROM user_info WHERE user_account_mail=:email")
  public UserInfo findUserInfoByEmail(@Param("email") String email);

  @Query(nativeQuery = true, value = "select * from User_info where account_id in (select DISTINCT User_info.account_id from User_info join User_account on  User_info.account_id= User_account.account_id where User_account.role='ROLE_STUDENT' and User_info.account_id Not in (select join_course_user.Uid_fkey from join_course_user where join_course_user.course_id_fkey=:courseId))")
  public List<UserInfo> findStudentsToEnroll(@Param("courseId") Long courseId);

  @Query(nativeQuery = true, value = "select * from user_info where user_name=:userName and user_account_account_id=:accountId")
  UserInfo findByNameAndAccount(
      @Param("userName") String userName,
      @Param("accountId") Long accountId);
}
