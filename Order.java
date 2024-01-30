package domain;

import java.time.LocalDateTime;

public class Order {
    private int numbrer;
    private String description;
    private LocalDateTime dateTime;

    public Order() {

    }

    public Order(int numbrer, String description) {
        this.numbrer = numbrer;
        this.description = description;
        dateTime = LocalDateTime.now();
    }

    public int getNumbrer() {
        return numbrer;
    }

    public void setNumbrer(int numbrer) {
        this.numbrer = numbrer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    public class OrderDitail {
        private String productName;
        private float price;
        private int quantity;

        public OrderDitail() {
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public OrderDitail(String productName, float price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }
    }


}
