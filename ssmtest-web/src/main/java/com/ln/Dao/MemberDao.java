package com.ln.Dao;

import com.ln.Entity.Member;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by lining on 2019/6/18.
 */
@Repository
public interface MemberDao {

    Member findByMobile(@Param("mobile") String mobile);

    Member findByCode(@Param("member_code") String code);
}
