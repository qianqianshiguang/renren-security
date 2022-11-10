package io.renren.modules.mohe_test_case.dao;

import io.renren.modules.mohe_test_case.entity.CaseActionEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CaseActionDao {
     boolean addAction(CaseActionEntity caseActionEntity);
     List<CaseActionEntity> queryByVersion(CaseActionEntity caseActionEntity);
}
