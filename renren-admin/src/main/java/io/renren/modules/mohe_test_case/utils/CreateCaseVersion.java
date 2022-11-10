package io.renren.modules.mohe_test_case.utils;

public class CreateCaseVersion {
    private String pre ="Version_";
    private String version="";
    private String end_count="";

    public String getCreateCaseVersion(String application,int applicationCount){
        end_count=this.getCount(applicationCount);
        version=pre+application+"_"+end_count;
        return version;
    }

    public String  getCount(int count){
        String countStr="";
        int b=count+1;
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
