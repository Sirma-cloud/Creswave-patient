package sirma.example.Creswave.model;

import jakarta.persistence.*;

@Entity
@Table(name = "annual-enterprise-survey-2021-financial-year-provisional-csv")
public class Survey {
    @Id
    private String Industry_code_NZSIOC;
    private int year;
    private String Industry_aggregation_NZSIOC;

    private String industry_name_NZSIOC;
    private String Units;
    private String Variable_code;
    private String Variable_category;
    private String value;
    private String Industry_code_ANZIC06;

    public Survey(int year, String industry_aggregation_NZSIOC, String industry_code_NZSIOC, String industry_name_NZSIOC, String units, String variable_code, String variable_category, String value, String industry_code_ANZIC06) {
        this.year = year;
        Industry_aggregation_NZSIOC = industry_aggregation_NZSIOC;
        Industry_code_NZSIOC = industry_code_NZSIOC;
        this.industry_name_NZSIOC = industry_name_NZSIOC;
        Units = units;
        Variable_code = variable_code;
        Variable_category = variable_category;
        this.value = value;
        Industry_code_ANZIC06 = industry_code_ANZIC06;
    }

    public Survey() {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIndustry_aggregation_NZSIOC() {
        return Industry_aggregation_NZSIOC;
    }

    public void setIndustry_aggregation_NZSIOC(String industry_aggregation_NZSIOC) {
        Industry_aggregation_NZSIOC = industry_aggregation_NZSIOC;
    }

    public String getIndustry_code_NZSIOC() {
        return Industry_code_NZSIOC;
    }

    public void setIndustry_code_NZSIOC(String industry_code_NZSIOC) {
        Industry_code_NZSIOC = industry_code_NZSIOC;
    }

    public String getIndustry_name_NZSIOC() {
        return industry_name_NZSIOC;
    }

    public void setIndustry_name_NZSIOC(String industry_name_NZSIOC) {
        this.industry_name_NZSIOC = industry_name_NZSIOC;
    }

    public String getUnits() {
        return Units;
    }

    public void setUnits(String units) {
        Units = units;
    }

    public String getVariable_code() {
        return Variable_code;
    }

    public void setVariable_code(String variable_code) {
        Variable_code = variable_code;
    }

    public String getVariable_category() {
        return Variable_category;
    }

    public void setVariable_category(String variable_category) {
        Variable_category = variable_category;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIndustry_code_ANZIC06() {
        return Industry_code_ANZIC06;
    }

    public void setIndustry_code_ANZIC06(String industry_code_ANZIC06) {
        Industry_code_ANZIC06 = industry_code_ANZIC06;
    }

    @Override
    public String toString() {
        return "Survey{" +
                ", year=" + year +
                ", Industry_aggregation_NZSIOC='" + Industry_aggregation_NZSIOC + '\'' +
                ", Industry_code_NZSIOC=" + Industry_code_NZSIOC +
                ", industry_name_NZSIOC='" + industry_name_NZSIOC + '\'' +
                ", Units='" + Units + '\'' +
                ", Variable_code='" + Variable_code + '\'' +
                ", Variable_category='" + Variable_category + '\'' +
                ", value='" + value + '\'' +
                ", Industry_code_ANZIC06='" + Industry_code_ANZIC06 + '\'' +
                '}';
    }
}
