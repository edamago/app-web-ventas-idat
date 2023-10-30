package pe.edu.idat.appwebventasidat.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name="orderdetails")
public class OrderDetail {
    @Id
    private Integer orderid;

    @ManyToOne
    @JoinColumn(name = "productid")
    private Product product;

    @Column(name="unitprice")
    private Double unitprice;
    @Column(name="quantity")
    private Integer quantity;
    @Column(name="discount")
    private Double discount;
}
