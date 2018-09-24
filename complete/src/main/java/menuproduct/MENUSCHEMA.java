
package menuproduct;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "id",
    "menuname",
    "available",
    "comboprice",
    "eachprice",
    "image"
})
public class MENUSCHEMA {

    @JsonProperty("id")
    private Integer id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("menuname")
    private String menuname;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("available")
    private Boolean available;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comboprice")
    private Double comboprice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eachprice")
    private Double eachprice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("image")
    private String image;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("menuname")
    public String getMenuname() {
        return menuname;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("menuname")
    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("available")
    public Boolean getAvailable() {
        return available;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("available")
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comboprice")
    public Double getComboprice() {
        return comboprice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comboprice")
    public void setComboprice(Double comboprice) {
        this.comboprice = comboprice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eachprice")
    public Double getEachprice() {
        return eachprice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eachprice")
    public void setEachprice(Double eachprice) {
        this.eachprice = eachprice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("menuname", menuname).append("available", available).append("comboprice", comboprice).append("eachprice", eachprice).append("image", image).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(image).append(menuname).append(comboprice).append(available).append(eachprice).append(id).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MENUSCHEMA) == false) {
            return false;
        }
        MENUSCHEMA rhs = ((MENUSCHEMA) other);
        return new EqualsBuilder().append(image, rhs.image).append(menuname, rhs.menuname).append(comboprice, rhs.comboprice).append(available, rhs.available).append(eachprice, rhs.eachprice).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
