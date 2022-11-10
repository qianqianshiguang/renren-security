package io.renren.modules.mohe_test_case.dao;


import io.renren.modules.mohe_test_case.entity.TestCaseEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestCaseDao {
     List<TestCaseEntity>  queryAll();
     boolean addCase(TestCaseEntity testCaseEntity);
     boolean updateByCaseId(TestCaseEntity testCaseEntity);
     boolean deleteByCaseId(TestCaseEntity testCaseEntity);
     List<TestCaseEntity> queryByCaseId(TestCaseEntity testCaseEntity);
     int count(TestCaseEntity testCaseEntity);
     List<TestCaseEntity> queryByDetail(TestCaseEntity testCaseEntity);

}
