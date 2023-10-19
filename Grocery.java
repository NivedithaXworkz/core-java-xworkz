package grocery;


import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Grocery {

    private int productId;
    private String name;
    private String releasedDate;
    private String expiryDate;
    private int price;
    private String ingredients;
    private String netContent;
    private String companyName;
}













