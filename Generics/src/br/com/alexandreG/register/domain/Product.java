/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.register.domain;

public class Product implements IPersistance{

    private String name;
    private Long code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }
}
