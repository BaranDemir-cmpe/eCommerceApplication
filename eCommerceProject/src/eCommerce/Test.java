package eCommerce;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Test test = new Test();
		
		User user1 = new User("cmpeStudent","baran","demir","22.05.2001","123456","baran54123@gmail.com",
				"Izmir","Manisa");
		CreditCard card1 = new CreditCard(1234567891,"baran","1571","2026");
		Product product1 = new Product("nike tshirt","white","clothes",1000,50,"black oversize tshirt");
		Product product2 = new Product("nike air force","black","shoes",500,500,"sport shoes");
		test.addingProducts(product1);
		test.addingProducts(product2);
		test.displayProducts();
		while(true) {
			System.out.println("What would you like to buy: ");
			String productChoice = input.nextLine();
			test.productControlAndPurchasing(user1, productChoice);
			System.out.println("Do you want to buy more things: (if yes press 1 otherwise press 2): ");
			String reply = input.nextLine();
			int flag = Integer.parseInt(reply);
			if(flag==1) {
				continue;
			}
			else
				break;
		}
		
		for(int i=0;i<user1.getFavoriteProducts().size();i++) {
			
			System.out.println("Favorite Products: "+user1.getFavoriteProducts().get(i).getProductName());
			System.out.println("Shopping is completed");
		}
		
	}
	
	
	Scanner input = new Scanner(System.in);
	static ArrayList<Product> productList = new ArrayList<Product>();
	public void addingProducts(Product product){
		productList.add(product);
	}
	
	public void displayProducts() {
		for(int i = 0; i<productList.size();i++) {
			System.out.println("Product name: "+productList.get(i).getProductName()+"\n"+"Product Color: "+productList.get(i).getProductColor()+"\n"+
					"Product Category: "+productList.get(i).getProductCategory()+"\n"+"Product stock: "+productList.get(i).getStockInfo()+"\n"+
					"Product Weight: "+productList.get(i).getProductWeight()+" g\n"+"Product description: "+productList.get(i).getDescription()+"\n"+
					"----------------------------");
		}
	}
	
	public  void productControlAndPurchasing(User u,String answer){
        for(Product p:productList){
            if(answer.equals(p.getProductName())){
            	u.getProductOrdered().add(p);
                System.out.println("Added to ordered list. ");
                System.out.println("How many will you buy: ");
                int reply=input.nextInt();
                p.reducingStock(reply);
                u.purchase(productList);
                System.out.println("Do you want to add your favorite list (1 for yes/2 for no): ");
                int addingAnswer=input.nextInt();
                if(addingAnswer==1){
                    u.favoriteList(p);
                    break;
                }
                else;
                	System.out.println("Item is not added to favorite list");
            }     
            }
        }
}
