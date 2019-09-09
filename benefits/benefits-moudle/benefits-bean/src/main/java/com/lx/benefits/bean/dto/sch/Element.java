package com.lx.benefits.bean.dto.sch;

import com.lx.benefits.bean.dto.jd.base.BaseDO;
import org.apache.commons.lang.StringUtils;

/**
 * Created by ldr on 2016/2/18.
 */
public class Element extends BaseDO {

    private static final long serialVersionUID = -5539520870770464639L;

    private String key;

    private String value;
    
    private String valueEn;

    public Element() {
    }

    public Element(String key, String value) {
        this.key = key;
        this.value = value;
    }

	public Element(String key, String value, String valueEn) {
		this.key = key;
		this.value = value;
		this.valueEn = valueEn;
	}

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return (String.valueOf(key) + String.valueOf(value)).hashCode();

    }

    public String getValueEn() {
		return valueEn;
	}

	public void setValueEn(String valueEn) {
		this.valueEn = valueEn;
	}

	@Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Element)) {
            return false;
        }
        Element t = (Element) obj;
        return StringUtils.equals(this.getKey(), t.getKey()) && StringUtils.equals(this.getValue(), t.getValue());
    }
}
