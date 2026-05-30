public class Product{
 public String name;
 public int qty;
 static Product [] arr = new Product [3];
 static int count;
 
 public Product(String name,int qty){
   if(count < 3){
   this.name = name;
   this.qty = qty;
   for(int i = 0;i < 3;i++){
     if (arr[i]==null){
       arr[i]= this;
       count++;
       break;
     }
   }
   System.out.println("Stored: "+name);
   } else {
   System.out.println("Storage is full! Cannot add "+name);
   }
 }
 public static void buy(String name, int qty){
   boolean productfound = false;
   for(int i = 0;i < 3;i++){
     if(arr[i].name == name){
       productfound = true;
       if (arr[i].qty >= qty){
       arr[i].qty -= qty;
       System.out.println("Product Sold");
       } 
       else System.out.println("Quantity low");
     } 
   }
    if(productfound == false) System.out.println("Product not found");
 }
 public static void displayProducts(){
   System.out.println("=== Stored Products ===");
   for(int i = 0;i < 3;i++){
     if(arr[i]!=null){
       System.out.println(arr[i].name+"- Qty: "+arr[i].qty);
     }
   }
 }
}