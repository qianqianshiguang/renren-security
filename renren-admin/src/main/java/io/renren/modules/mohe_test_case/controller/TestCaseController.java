package io.renren.modules.mohe_test_case.controller;


//import com.alibaba.fastjson.JSONObject;
import io.renren.modules.mohe_test_case.dao.TestCaseDao;
import io.renren.modules.mohe_test_case.entity.CaseActionEntity;
import io.renren.modules.mohe_test_case.entity.TestCaseEntity;
import io.renren.modules.mohe_test_case.utils.CreateCaseId;
import io.renren.modules.mohe_test_case.utils.HttpClientUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/case")
public class TestCaseController {
    @Resource
    private TestCaseDao testCaseDao;
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());
    CreateCaseId createCaseId = new CreateCaseId();
    @PostMapping(value = "/query")
    public List<TestCaseEntity> queryAll(){
        return testCaseDao.queryAll();
    }
    //新增用例
    @PostMapping(value="/addCase")
    public boolean addCase(@RequestBody TestCaseEntity testCaseEntity){
        testCaseEntity.setCaseId(createCaseId.getCreateCaseId(
                testCaseEntity.getApplication(),
                testCaseDao.count(testCaseEntity)
                ));
        return testCaseDao.addCase(testCaseEntity);
    }
    //更新用例
    @PostMapping(value="/updateCase")
    public boolean updateCase(@RequestBody TestCaseEntity testCaseEntity){
        return testCaseDao.updateByCaseId(testCaseEntity);
    }
    //删除用例
    @PostMapping(value="/deleteByCaseId")
    public boolean deleteByCaseId(@RequestBody TestCaseEntity testCaseEntity){
        return testCaseDao.deleteByCaseId(testCaseEntity);
    }
    //按照用例编号查询
    @PostMapping(value ="/queryByCaseId")
    public List<TestCaseEntity> queryByCaseId(@RequestBody TestCaseEntity testCaseEntity){

        return testCaseDao.queryByCaseId(testCaseEntity);}
    //统计测试用例数量
    @PostMapping(value = "/count")
    public int count(@RequestBody TestCaseEntity testCaseEntity){
        return testCaseDao.count(testCaseEntity);
    }
    //按照创建者搜索
    @PostMapping(value = "/queryByDetail")
    public List<TestCaseEntity> queryByAuthor(@RequestBody TestCaseEntity testCaseEntity){
        return testCaseDao.queryByDetail(testCaseEntity);
    }

//    @PostMapping(value ="/action")
//    public CaseActionEntity action(@RequestBody TestCaseEntity testCaseEntity){
//        CaseActionEntity caseActionEntity = new CaseActionEntity();
//        List<TestCaseEntity> testCases = this.queryByCaseId(testCaseEntity);
//        TestCaseEntity testCase = testCases.get(0);
//        String url = testCase.getApi();
//        String expectResult = testCase.getExpectResult();
//        Map<String,Object> body = new HashMap<>();
//        JSONObject jsonParam = JSONObject.parseObject(testCase.getParam());
//        for(Map.Entry<String,Object> entry : jsonParam.entrySet()){
//                body.put(entry.getKey(),entry.getValue());
//                LOGGER.info("入参键值："+entry.getKey()+"===="+entry.getValue());
//        }
//        String result = HttpClientUtils.httpPostRequest(url,body);
//        LOGGER.info("实际结果："+result);
//        caseActionEntity.setActualResult(result);
//        caseActionEntity.setExpectResult(expectResult);
//        return caseActionEntity;
//    }

}
