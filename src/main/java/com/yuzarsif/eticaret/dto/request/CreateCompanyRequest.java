package com.yuzarsif.eticaret.dto.request;

public class CreateCompanyRequest {

    private String id;
    private String companyName;
    private String webSite;

    public CreateCompanyRequest() {}

    public CreateCompanyRequest(String id, String companyName, String webSite) {
        this.id = id;
        this.companyName = companyName;
        this.webSite = webSite;
    }

    public String getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getWebSite() {
        return webSite;
    }
}
