public class Cart {
 public int cartNumber;
 public String[] items = new String[3];
 public double[] prices = new double[3];
 public int itemCount = 0;
 public double discount = 0.0;

 public void create_cart(int num) {
  this.cartNumber = num;
  }

 public void addItem(String item, double price) {
  if (itemCount < 3) {
    items[itemCount] = item;
    prices[itemCount] = price;
    itemCount++;
    System.out.println(item + " added to cart " + cartNumber + ".");
    System.out.println("You have " + itemCount + " item(s) in your cart now.");
     } else {
     System.out.println("You already have 3 items on your cart");
     }
    }

 public void addItem(double price, String item) {
  addItem(item, price);
    }

 public void giveDiscount(double discount) {
  this.discount = discount;
  for (int i = 0; i < itemCount; i++) {
    prices[i] = prices[i] - (prices[i] * discount / 100);
    }
  }

 public void cartDetails() {
  System.out.println("Your cart(c" + cartNumber + ") : ");
   for (int i = 0; i < itemCount; i++) {
      System.out.println(items[i] + " - " + prices[i]);
   }
   System.out.println("Discount Applied: " + discount + "%");
   double total = 0.0;
   for (int i = 0; i < itemCount; i++) {
    total += prices[i];
    }
      System.out.println("Total price: " + total);
    }
}