package hello.itemservice.domain.item;

import lombok.Data;

// getter, setter만 쓸거면, @Data보다는 @Getter @Setter만 쓰는게 안전하다.
@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item(){

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }


}
