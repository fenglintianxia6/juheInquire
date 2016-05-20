package com.zyf.juheinquire.mvp.model;

import java.util.List;

/**
 * Created by zyf on 16/5/20.
 */
public class ExpStageInfo {

    /**
     * resultcode : 200
     * reason : 成功的返回
     * result : {"company":"圆通","com":"yt","no":"700182589755","status":"0","list":[{"datetime":"2016-05-17 18:46:06","remark":"快件在【江苏省南京市栖霞区公司】已收件 取件人: 岳宏结","zone":""},{"datetime":"2016-05-17 19:57:31","remark":"快件在【南京转运中心公司】已收入 张华红","zone":""},{"datetime":"2016-05-17 23:20:45","remark":"快件在【南京转运中心公司】已打包 张华红","zone":""},{"datetime":"2016-05-19 15:09:58","remark":"快件在【北京转运中心公司】已发出 王银平","zone":""},{"datetime":"2016-05-20 06:46:33","remark":"快件在【北京市海淀区中关村公司】已收入 苗军国","zone":""},{"datetime":"2016-05-20 08:36:40","remark":"快件在【北京市海淀区中关村公司】派件中 派件人: 彭宝全","zone":""}]}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    /**
     * company : 圆通
     * com : yt
     * no : 700182589755
     * status : 0
     * list : [{"datetime":"2016-05-17 18:46:06","remark":"快件在【江苏省南京市栖霞区公司】已收件 取件人: 岳宏结","zone":""},{"datetime":"2016-05-17 19:57:31","remark":"快件在【南京转运中心公司】已收入 张华红","zone":""},{"datetime":"2016-05-17 23:20:45","remark":"快件在【南京转运中心公司】已打包 张华红","zone":""},{"datetime":"2016-05-19 15:09:58","remark":"快件在【北京转运中心公司】已发出 王银平","zone":""},{"datetime":"2016-05-20 06:46:33","remark":"快件在【北京市海淀区中关村公司】已收入 苗军国","zone":""},{"datetime":"2016-05-20 08:36:40","remark":"快件在【北京市海淀区中关村公司】派件中 派件人: 彭宝全","zone":""}]
     */

    private ResultBean result;
    private int error_code;

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

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        private String company;
        private String com;
        private String no;
        private String status;
        /**
         * datetime : 2016-05-17 18:46:06
         * remark : 快件在【江苏省南京市栖霞区公司】已收件 取件人: 岳宏结
         * zone :
         */

        private List<ListBean> list;

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

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

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String datetime;
            private String remark;
            private String zone;

            public String getDatetime() {
                return datetime;
            }

            public void setDatetime(String datetime) {
                this.datetime = datetime;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getZone() {
                return zone;
            }

            public void setZone(String zone) {
                this.zone = zone;
            }
        }
    }
}
