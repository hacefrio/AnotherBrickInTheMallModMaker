/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editMod;

/**
 *
 * @author sebastian
 */
public class product {

    private String codename;
    private String name;
    private String specalty_name;
    private String subtype;
    private String display_type;
    private String depletion_rate;
    private String base_demand;
    private String base_price;
    private String quality_distribution;
    private String expires_in_hours;
    private String requires_research;
    private String horizontal_gfx;
    private String vertical_gfx;
    private String checkout_gfx;

    public void loadProduct(String codename) {
        SqLiteManager DB = new SqLiteManager();
        String[] properties = DB.loadProduct(codename);
        this.codename =properties[0];
        this.name =properties[1];
        this.specalty_name =properties[2];
        this.subtype =properties[3];
        this.display_type =properties[4];
        this.depletion_rate =properties[5];
        this.base_demand=properties[6];
        this.base_price=properties[7];
        this.quality_distribution=properties[8];
        this.expires_in_hours=properties[9];
        this.requires_research=properties[10];
        this.horizontal_gfx=properties[11];
        this.vertical_gfx=properties[12];
        this.checkout_gfx =properties[13];
    }
    
    public void saveProduct(){
        SqLiteManager DB = new SqLiteManager();
        DB.saveProduct(this);
    }
    

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecalty_name() {
        return specalty_name;
    }

    public void setSpecalty_name(String specalty_name) {
        this.specalty_name = specalty_name;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getDisplay_type() {
        return display_type;
    }

    public void setDisplay_type(String display_type) {
        this.display_type = display_type;
    }

    public String getDepletion_rate() {
        return depletion_rate;
    }

    public void setDepletion_rate(String depletion_rate) {
        this.depletion_rate = depletion_rate;
    }

    public String getBase_demand() {
        return base_demand;
    }

    public void setBase_demand(String base_demand) {
        this.base_demand = base_demand;
    }

    public String getBase_price() {
        return base_price;
    }

    public void setBase_price(String base_price) {
        this.base_price = base_price;
    }

    public String getQuality_distribution() {
        return quality_distribution;
    }

    public void setQuality_distribution(String quality_distribution) {
        this.quality_distribution = quality_distribution;
    }

    public String getExpires_in_hours() {
        return expires_in_hours;
    }

    public void setExpires_in_hours(String expires_in_hours) {
        this.expires_in_hours = expires_in_hours;
    }

    public String getRequires_research() {
        return requires_research;
    }

    public void setRequires_research(String requires_research) {
        this.requires_research = requires_research;
    }

    public String getHorizontal_gfx() {
        return horizontal_gfx;
    }

    public void setHorizontal_gfx(String horizontal_gfx) {
        this.horizontal_gfx = horizontal_gfx;
    }

    public String getVertical_gfx() {
        return vertical_gfx;
    }

    public void setVertical_gfx(String vertical_gfx) {
        this.vertical_gfx = vertical_gfx;
    }

    public String getCheckout_gfx() {
        return checkout_gfx;
    }

    public void setCheckout_gfx(String checkout_gfx) {
        this.checkout_gfx = checkout_gfx;
    }

}
