package io.renren.modules.mohe_test_case.controller;


import io.renren.modules.mohe_test_case.dao.CaseVersionDao;
import io.renren.modules.mohe_test_case.entity.CaseVersionEntity;
import io.renren.modules.mohe_test_case.utils.CreateCaseVersion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/testVersion")
public class CaseVersionController {
    @Resource
    CaseVersionDao caseVersionDao;
    CreateCaseVersion createCaseVersion = new CreateCaseVersion();

    @PostMapping(value = "query")
    public List<CaseVersionEntity> queryAll(){
        return caseVersionDao.queryAll();
    }

    @PostMapping(value = "addVersion")
    public boolean addVersion(@RequestBody CaseVersionEntity caseVersionEntity){
        caseVersionEntity.setVersion(
                createCaseVersion.getCreateCaseVersion(
                        caseVersionEntity.getApplication(),
                        caseVersionDao.count(caseVersionEntity))
        );
        return caseVersionDao.addVersion(caseVersionEntity);
    }

    @PostMapping(value = "queryByVersion")
    public List<CaseVersionEntity> queryByVersion(@RequestBody CaseVersionEntity caseVersionEntity){
        return caseVersionDao.queryByVersion(caseVersionEntity);
    }

    @PostMapping(value = "updateByVersion")
    public boolean updateByVersion(@RequestBody CaseVersionEntity caseVersionEntity){
        return caseVersionDao.updateByVersion(caseVersionEntity);
    }

    @PostMapping(value = "count")
    public int count(@RequestBody CaseVersionEntity caseVersionEntity){
        return caseVersionDao.count(caseVersionEntity);
    }
}
