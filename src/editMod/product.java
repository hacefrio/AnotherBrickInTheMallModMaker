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
    
    public void saveProduct(){
        SqLiteManager DB = new SqLiteManager();
        DB.saveProduct(this);
    }
    
    public int subTypeStringToInt(String subType1){
        int subType2=0;
        switch (subType1) {
            case "Food":
                subType2=2;
                break;
            case "Beverages":
                subType2=3;
                break;
            case "Household Items":
                subType2=4;
                break;
            case "Health and Beauty":
                subType2=5;
                break;
            case "Tools and Materials":
                subType2=6;
                break;
            case "Electronics and Appliances":
                subType2=7;
                break;
            case "Clothing":
                subType2=8;
                break;
            case "Media":
                subType2=9;
                break;
            case "Press and Print":
                subType2=10;
                break;
            case "Plants and Gardening":
                subType2=11;
                break;
            case "Misc":
                subType2=12;
                break;
            case "Sports and Outdoors":
                subType2=13;
                break;
            case "Toys and Games":
                subType2=14;
                break;
        }
        return  subType2;
    }
    
    public String subTypeIntToString(int subType1){
        String subType2="";
        if(subType1==2){
            subType2="Food";
        }else if(subType1==3){
            subType2="Beverages";
        }else if(subType1==4){
            subType2="Household Items";
        }else if(subType1==5){
            subType2="Health and Beauty";
        }else if(subType1==6){
            subType2="Tools and Materials";
        }else if(subType1==7){
            subType2="Electronics and Appliances";
        }else if(subType1==8){
            subType2="Clothing";
        }else if(subType1==9){
            subType2="Media";
        }else if(subType1==10){
            subType2="Press and Print";
        }else if(subType1==11){
            subType2="Plants and Gardening";
        }else if(subType1==12){
            subType2="Misc";
        }else if(subType1==13){
            subType2="Sports and Outdoors";
        }else if(subType1==14){
            subType2="Toys and Games";
        }
        return  subType2;
    }
    
    public String displayTypeIntToString(int subType1){
        String subType2="";
        
        if(subType1==1){
            subType2="Food shelf";
        }else if(subType1==2){
            subType2="Fridge only";
        }else if(subType1==3){
            subType2="Fridge or food shelf (suitable for drinks)";
        }else if(subType1==4){
            subType2="Table";
        }else if(subType1==5){
            subType2="Cloth rack";
        }else if(subType1==6){
            subType2="Pallet";
        }else if(subType1==7){
            subType2="Non-food shelf";
        }
        return  subType2;
    }
    
    public int displayTypeStringToInt(String subType1){
        int subType2=0;
        
        switch (subType1) {
            case "Food shelf":
                subType2=1;
                break;
            case "Fridge only":
                subType2=2;
                break;
            case "Fridge or food shelf (suitable for drinks)":
                subType2=3;
                break;
            case "Table":
                subType2=4;
                break;
            case "Cloth rack":
                subType2=5;
                break;
            case "Pallet":
                subType2=6;
                break;
            case "Non-food shelf":
                subType2=7;
                break;
        }
        return  subType2;
    }
    
    public int qualityDistributionStringToInt(String subType1){
        int subType2=0;
        
        switch (subType1) {
            case "no specialization (100/0/0)":
                subType2=0;
                break;
            case "standard (75/25/0)":
                subType2=1;
                break;
            case "high sub-category (50/50/0)":
                subType2=2;
                break;
            case "specialty (30/30/40)":
                subType2=3;
                break;
            case "high specialty (10/30/70)":
                subType2=4;
                break;
            case "no middle (30/0/70) - typically for products in the 'Misc' sub-category":
                subType2=5;
                break;
            case "only specialty (0/0/100)":
                subType2=6;
                break;
        }
        return  subType2;
    }
    
    public String qualityDistributionIntToString(int subType1){
        String subType2="";
        
        if(subType1==0){
            subType2="no specialization (100/0/0)";
        }else if(subType1==1){
            subType2="standard (75/25/0)";
        }else if(subType1==2){
            subType2="high sub-category (50/50/0)";
        }else if(subType1==3){
            subType2="specialty (30/30/40)";
        }else if(subType1==4){
            subType2="high specialty (10/30/70)";
        }else if(subType1==5){
            subType2="no middle (30/0/70) - typically for products in the 'Misc' sub-category";
        }else if(subType1==6){
            subType2="only specialty (0/0/100)";
        }
        return  subType2;
    }
    
    public String requiresResearchIntToString(int subType1){
        String subType2="";
        if(subType1==0){
            subType2="none";
        }else if(subType1==1){
            subType2="Cold chain";
        }else if(subType1==2){
            subType2="Alcohol license";
        }else if(subType1==4){
            subType2="Frozen food supplier";
        }else if(subType1==5){
            subType2="Chemical supplier";
        }else if(subType1==6){
            subType2="Clothing supplier";
        }else if(subType1==7){
            subType2="Electronics supplier";
        }else if(subType1==8){
            subType2="Media supplier";
        }else if(subType1==9){
            subType2="Appliances supplier";
        }else if(subType1==10){
            subType2="Tools supplier";
        }else if(subType1==11){
            subType2="Luxury supplier";
        }else if(subType1==30){
            subType2="Tobacco license";
        }else if(subType1==31){
            subType2="Newsagent supplier";
        }else if(subType1==32){
            subType2="Plants and Gardening supplier";
        }else if(subType1==33){
            subType2="E-Cigarettes supplier";
        }
        return  subType2;
    }
    
    public int requiresResearchStringToInt(String subType1){
        int subType2=0;
        
        switch (subType1) {
            case "none":
                subType2=0;
                break;
            case "Cold chain":
                subType2=1;
                break;
            case "Alcohol license":
                subType2=2;
                break;
            case "Frozen food supplier":
                subType2=4;
                break;
            case "Chemical supplier":
                subType2=5;
                break;
            case "Clothing supplier":
                subType2=6;
                break;
            case "Electronics supplier":
                subType2=7;
                break;
            case "Media supplier":
                subType2=8;
                break;
            case "Appliances supplier":
                subType2=9;
                break;
            case "Tools supplier":
                subType2=10;
                break;
            case "Luxury supplier":
                subType2=11;
                break;
            case "Tobacco license":
                subType2=30;
                break;
            case "Newsagent supplier":
                subType2=31;
                break;
            case "Plants and Gardening supplier":
                subType2=32;
                break;
            case "E-Cigarettes supplier":
                subType2=33;
                break;
        }
        return  subType2;
    }
    
 
}
