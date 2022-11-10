package io.renren.modules.mohe_test_case.dao;


import io.renren.modules.mohe_test_case.entity.CaseVersionEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CaseVersionDao {
    List<CaseVersionEntity> queryAll();
    boolean addVersion(CaseVersionEntity caseVersionEntity);
    List<CaseVersionEntity> queryByVersion(CaseVersionEntity caseVersionEntity);
    boolean updateByVersion(CaseVersionEntity caseVersionEntity);
    int count(CaseVersionEntity caseVersionEntity);
}
