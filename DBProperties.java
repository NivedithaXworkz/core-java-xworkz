package com.workz.bankApp.bankutils;

public enum DBProperties {
    URL("jdbc:mysql://localhost:3308/Bookdto2"),USER("root"),PASSWORD("niveditha@22"),DRIVER_PATH("com.mysql.cj.jdbc.Driver");
    public String value;
    private DBProperties(String value){
        this.value = value;
    }
}
