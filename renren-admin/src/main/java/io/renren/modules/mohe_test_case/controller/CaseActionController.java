package io.renren.modules.mohe_test_case.controller;


import io.renren.modules.mohe_test_case.dao.CaseActionDao;
import io.renren.modules.mohe_test_case.entity.CaseActionEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/action")
public class CaseActionController {
    @Resource
    CaseActionDao caseActionDao;

    @PostMapping(value = "addAction")
    public boolean addAction(CaseActionEntity caseActionEntity){
        return caseActionDao.addAction(caseActionEntity);
    }

    @PostMapping(value = "queryByVersion")
    public List<CaseActionEntity> queryByVersion(CaseActionEntity caseActionEntity){
        return caseActionDao.queryByVersion(caseActionEntity);
    }

}
