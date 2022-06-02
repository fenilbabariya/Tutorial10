package com.rku_21soeca21002.tutorial10;

public class Formula {
    private String formula;
    private String url;

    public Formula(String formula, String url) {
        this.formula = formula;
        this.url = url;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
