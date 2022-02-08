package com.example.demo.pojo;

public class parameter {

    private String success;
    private Result result;
    public void setSuccess(String success) {
        this.success = success;
    }
    public String getSuccess() {
        return success;
    }

    public void setResult(Result result) {
        this.result = result;
    }
    public Result getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "parameter{" +
                "success='" + success + '\'' +
                ", result=" + result +
                '}';
    }
}