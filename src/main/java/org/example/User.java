package org.example;

import java.util.ArrayList;

public class User extends Admin{
    private String phoneNumber;
    private String address;
    private float wallet;
    private boolean didFinalized;
    private float addFund;
    private boolean askFund;
    private ArrayList<Order> listOfOrders = new ArrayList<Order>();
    private ArrayList<Product> listOfPurchasedProduct = new ArrayList<Product>();
    private ArrayList<Product> shoppingCart = new ArrayList<Product>();
    public User(String username, String password, String emailAddress, String phoneNumber, String address, float wallet) {
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.wallet = wallet;
    }


    public void addToListOfOrders(Order newOrder) {
        listOfOrders.add(newOrder);
    }
    public void addToListOfPurchasedProduct(Product newProduct) {
        listOfPurchasedProduct.add(newProduct);
    }
    public void addToShoppingCartUser(Product addProduct) {
        shoppingCart.add(addProduct);
    }

    //Setter methods
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDidFinalized(boolean didFinalized) {
        this.didFinalized = didFinalized;
    }

    public void setWallet(float wallet) {
        this.wallet = wallet;
    }

    public void setAddFund(float addFund) {
        this.addFund = addFund;
    }
    public void setAskFund(boolean askFund) {
        this.askFund = askFund;
    }

    public void setListOfOrders(ArrayList<Order> listOfOrders) {
        this.listOfOrders = listOfOrders;
    }

    public void setListOfPurchasedProduct(ArrayList<Product> listOfPurchasedProduct) {
        this.listOfPurchasedProduct = listOfPurchasedProduct;
    }

    public void setShoppingCart(ArrayList<Product> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    //Getter methods
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public float getWallet() {
        return wallet;
    }

    public boolean getDidFinalized() {
        return didFinalized;
    }

    public float getAddFund() {
        return addFund;
    }

    public boolean getAskFund() {
        return askFund;
    }
    public ArrayList<Order> getListOfOrders() {
        return listOfOrders;
    }

    public ArrayList<Product> getListOfPurchasedProduct() {
        return listOfPurchasedProduct;
    }

    public ArrayList<Product> getShoppingCartSeller() { return shoppingCart; }


    //methods to display list of purchased product, list of orders and shopping cart.
    public void getListOfPurchasedProductToString() {
        boolean doesntExist = true;
        for (int i = 0; i < listOfPurchasedProduct.size(); i++) {
            System.out.println(listOfPurchasedProduct.get(i).toString());
            System.out.println("\n");
            doesntExist = false;
        }
        if (doesntExist) {
            System.out.println("You haven't purchase any product yet");
        }
    }

    public void getListOfOrdersToString() {
        boolean doesntExist = true;
        for (int i = 0; i < listOfOrders.size(); i++) {
            System.out.println(listOfOrders.get(i).toString());
            System.out.println("\n");
            doesntExist = false;
        }
        if (doesntExist) {
            System.out.println("You don't any order yet");
        }
    }

    public void getShoppingCart() {
        boolean doesntExist = true;
        for (int i = 0; i < shoppingCart.size(); i++) {
            System.out.println(shoppingCart.get(i).toString());
            System.out.println("\n");
            doesntExist = false;
        }
        if (doesntExist) {
            System.out.println("There isn't any product in your shopping cart.");
        }
    }

    public boolean shoppingCartEmpty() {
        boolean doesntExist = true;
        for (int i = 0; i < shoppingCart.size(); i++) {
            doesntExist = false;
        }
        return doesntExist;
    }

    //toString method for displaying personal information of user to admin.
    @Override
    public String toString() {
        return "User :" +
                "~username='" + username + "\n" +
                "~password='" + password + "\n" +
                "~email address='" + emailAddress + "\n" +
                "~phone number= " + phoneNumber + "\n" +
                "~address='" + address + "\n" +
                "~wallet= " + wallet + "$" + "\n" +
                "~orders= " + listOfOrders + "\n" +
                "~purchased product= " + listOfPurchasedProduct + "\n" +
                "~products in your shopping cart= " + shoppingCart;
    }

    //toString method for displaying personal information of user to user itself.
    public String toStringPersonalInfo() {
        return "your :" + "\n" +
                "~username : " + username + "\n" +
                "~password : " + password + "\n" +
                "~email address : " + emailAddress + "\n" +
                "~phone number : " + phoneNumber + "\n" +
                "~address : " + address + "\n" +
                "~wallet : " + wallet + "$ ";
    }


    public boolean removeFromShoppingCart(String nameOfTheProduct) {
        boolean existence = false;
        for (int i = 0; i < shoppingCart.size(); i++) {
            if (nameOfTheProduct.equals(shoppingCart.get(i).getName())) {
                existence = true;
                shoppingCart.remove(shoppingCart.get(i));
            }
        }
        return existence;
    }

    public void removeAllInShoppingCart() {
        shoppingCart.removeAll(shoppingCart);
        System.out.println("Your shopping cart now is empty");
    }

    public float getTheTotalPrice() {
        boolean doesntExist = true;
        float totalPrice = 0;
        for (int i = 0; i < shoppingCart.size(); i++) {
            totalPrice = totalPrice + shoppingCart.get(i).getPrice();
            doesntExist = false;
        }
        return totalPrice;
    }
}
