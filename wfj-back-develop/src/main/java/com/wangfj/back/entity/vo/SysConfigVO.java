package com.wangfj.back.entity.vo;

public class SysConfigVO {
	private Integer sid;

    private String sysKey;

    private String sysValue;
    
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSysKey() {
        return sysKey;
    }

    public void setSysKey(String sysKey) {
        this.sysKey = sysKey;
    }

    public String getSysValue() {
        return sysValue;
    }

    public void setSysValue(String sysValue) {
        this.sysValue = sysValue;
    }

	@Override
	public String toString() {
		return "SysConfig [sid=" + sid + ", sysKey=" + sysKey + ", sysValue="
				+ sysValue + "]";
	}
}

