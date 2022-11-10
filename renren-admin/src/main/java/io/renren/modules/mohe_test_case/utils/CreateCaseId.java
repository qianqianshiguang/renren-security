package io.renren.modules.mohe_test_case.utils;



public class CreateCaseId {
    private String pre ="Case_";
    private String caseId="";
    private String end_count="";

    public String getCreateCaseId(String application,int applicationCount){
        end_count=this.getCount(applicationCount);
        caseId=pre+application+"_"+end_count;
        return caseId;
    }

    public String  getCount(int a){
        String countStr="";
        int b=a+1;
        if(b/10>=0 && b/10<1){
            countStr = "000"+b;
        }else if(b/10>=1 && b/10<10){
            countStr = "00"+b;
        }else if(b/10>=10 && b/10<100){
            countStr = "0"+b;
        }else{
            countStr = ""+b;
        }
        return countStr;
    }


}
