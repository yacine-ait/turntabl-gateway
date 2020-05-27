package com.turntabl.gateway;

public class ApiDetail {
    private String specificationLocation;
    private String department;
    private String displayName;

    private ApiDetail() {}

    public ApiDetail(String specificationLocation, String department, String displayName) {
        this.specificationLocation = specificationLocation;
        this.department = department;
        this.displayName = displayName;
    }

    public String getSpecificationLocation() {
        return specificationLocation;
    }

    public String getDepartment() {
        return department;
    }

    public String getDisplayName() {
        return displayName;
    }
}
