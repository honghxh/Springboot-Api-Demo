package com.example.demo.pojo;

import java.util.Date;

public class FutureHour {


        private Date dateYmdh;
        private String wtId;
        private String wtNm;
        private String wtIcon;
        private String wtTemp;
        private String wtWindId;
        private String wtWindNm;
        private String wtWinpId;
        private String wtWinpNm;
        public void setDateYmdh(Date dateYmdh) {
            this.dateYmdh = dateYmdh;
        }
        public Date getDateYmdh() {
            return dateYmdh;
        }

        public void setWtId(String wtId) {
            this.wtId = wtId;
        }
        public String getWtId() {
            return wtId;
        }

        public void setWtNm(String wtNm) {
            this.wtNm = wtNm;
        }
        public String getWtNm() {
            return wtNm;
        }

        public void setWtIcon(String wtIcon) {
            this.wtIcon = wtIcon;
        }
        public String getWtIcon() {
            return wtIcon;
        }

        public void setWtTemp(String wtTemp) {
            this.wtTemp = wtTemp;
        }
        public String getWtTemp() {
            return wtTemp;
        }

        public void setWtWindId(String wtWindId) {
            this.wtWindId = wtWindId;
        }
        public String getWtWindId() {
            return wtWindId;
        }

        public void setWtWindNm(String wtWindNm) {
            this.wtWindNm = wtWindNm;
        }
        public String getWtWindNm() {
            return wtWindNm;
        }

        public void setWtWinpId(String wtWinpId) {
            this.wtWinpId = wtWinpId;
        }
        public String getWtWinpId() {
            return wtWinpId;
        }

        public void setWtWinpNm(String wtWinpNm) {
            this.wtWinpNm = wtWinpNm;
        }
        public String getWtWinpNm() {
            return wtWinpNm;
        }

    @Override
    public String toString() {
        return "FutureHour{" +
                "dateYmdh=" + dateYmdh +
                ", wtId='" + wtId + '\'' +
                ", wtNm='" + wtNm + '\'' +
                ", wtIcon='" + wtIcon + '\'' +
                ", wtTemp='" + wtTemp + '\'' +
                ", wtWindId='" + wtWindId + '\'' +
                ", wtWindNm='" + wtWindNm + '\'' +
                ", wtWinpId='" + wtWinpId + '\'' +
                ", wtWinpNm='" + wtWinpNm + '\'' +
                '}';
    }
}