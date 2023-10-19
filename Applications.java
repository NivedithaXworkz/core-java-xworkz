package com.xworkz.playstoreapp.application;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
 public class Applications {
    private int appId;
    private String appName;
    private int sizeInMb;
    private String companyName;
    private String version;
   private String releasedDate;
   private String appType;
}
