package com.zyf.juheinquire.mvp.model;

import java.util.List;

/**
 * Created by zyf on 16/5/20.
 */
public class ExpCompanyInfo {

    /**
     * resultcode : 200
     * reason : 成功的返回
     * result : [{"com":"顺丰","no":"sf"},{"com":"申通","no":"sto"},{"com":"圆通","no":"yt"},{"com":"韵达","no":"yd"},{"com":"天天","no":"tt"},{"com":"EMS","no":"ems"},{"com":"中通","no":"zto"},{"com":"汇通","no":"ht"}]
     */

    private String resultcode;
    private String reason;
    /**
     * com : 顺丰
     * no : sf
     */

    private List<ResultBean> result;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        private String com;
        private String no;

        public String getCom() {
            return com;
        }

        public void setCom(String com) {
            this.com = com;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }
    }
}
