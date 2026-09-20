package org.example;

import java.util.ArrayList;

public class Shop {

    final String name = "Shop 059";
    final String webAddress = "www.shop059.com";
    final String supportPhone = "22529059";
    final String supportEmailAddress = "shop059.support@gmail.com";
    private float totalProfit;
    private ArrayList<Object> listOfAccounts = new ArrayList<Object>();
    private ArrayList<Product> listOfAllProducts = new ArrayList<Product>();
    private ArrayList<User> listOfAllUsers = new ArrayList<User>();
    private ArrayList<Seller> listOfAllSellers = new ArrayList<Seller>();
    private ArrayList<Admin> listOfAllAdmins = new ArrayList<Admin>();
    private ArrayList<String> listOfAllUsernames = new ArrayList<String>();
    private ArrayList<String> listOfAllCompanyNames = new ArrayList<String>();
    private ArrayList<Watch> listOfAllWatches = new ArrayList<Watch>();
    private ArrayList<Book> listOfAllBooks = new ArrayList<Book>();
    private ArrayList<Bag> listOfAllBags = new ArrayList<Bag>();
    private ArrayList<Cloth> listOfAllCloths = new ArrayList<Cloth>();
    private ArrayList<Headphones> listOfAllHeadphones = new ArrayList<Headphones>();
    private ArrayList<Mobile> listOfAllMobiles = new ArrayList<Mobile>();
    private ArrayList<Painting> listOfAllPaintings = new ArrayList<Painting>();
    private ArrayList<Rug> listOfAllRugs = new ArrayList<Rug>();
    private ArrayList<Shoes> listOfAllShoes = new ArrayList<Shoes>();
    private ArrayList<SportEquipment> listOfAllSportEquipments = new ArrayList<SportEquipment>();
    private ArrayList<Toy> listOfAllToys = new ArrayList<Toy>();



    //method for adding profit to the total profit of shop
    public void addTotalProfit(float newProfit) {
        totalProfit = totalProfit + (newProfit * 10)/100;
    }


    //Adding methods
    public void addToListOfAllUsers (User newUser) {
        listOfAllUsers.add(newUser);
    }
    public void addToListOfAllUsernames(String newUsername) {
        listOfAllUsernames.add(newUsername);
    }
    public void addToListOfAllCompanyNames(String newCompanyName) { listOfAllCompanyNames.add(newCompanyName); }
    public void addToListOfAllProducts(Product newProduct) {
        listOfAllProducts.add(newProduct);
    }
    public void addToListOfAllSellers(Seller newSeller) {
        listOfAllSellers.add(newSeller);
    }
    public void addToListOfAllAdmins(Admin newAdmin) {listOfAllAdmins.add(newAdmin);}
    public void addToListOfAllAccounts(Object newObject) {
        listOfAccounts.add(newObject);
    }
    public void addToListOfAllWatches(Watch newWatch) {
        listOfAllWatches.add(newWatch);
    }
    public void addToListOfAllBags(Bag newBag) {
        listOfAllBags.add(newBag);
    }
    public void addToListOfAllBooks(Book newBook) {
        listOfAllBooks.add(newBook);
    }
    public void addToListOfAllCloths(Cloth newCloth) {
        listOfAllCloths.add(newCloth);
    }
    public void addToListOfAllHeadphones(Headphones newHeadphones) {
        listOfAllHeadphones.add(newHeadphones);
    }
    public void addToListOfAllMobiles(Mobile newMobile) {
        listOfAllMobiles.add(newMobile);
    }
    public void addToListOfAllPaintings(Painting newPainting) {
        listOfAllPaintings.add(newPainting);
    }
    public void addToListOfAllRugs(Rug newRug) {
        listOfAllRugs.add(newRug);
    }
    public void addToListOfAllShoes(Shoes newShoes) {
        listOfAllShoes.add(newShoes);
    }
    public void addToListOfAllSportEquipment(SportEquipment newSportEquipment) {
        listOfAllSportEquipments.add(newSportEquipment);
    }
    public void addToListOfAllToy(Toy newToy) {
        listOfAllToys.add(newToy);
    }




    //Getter methods
    public float getTotalProfit() {
        return totalProfit;
    }

    public ArrayList<Object> getListOfAccounts() {
        return listOfAccounts;
    }

    public ArrayList<Product> getListOfAllProducts() {
        return listOfAllProducts;
    }

    public ArrayList<User> getListOfAllUsers() {
        return listOfAllUsers;
    }

    public ArrayList<Admin> getListOfAllAdmins() { return listOfAllAdmins; }

    public ArrayList<String> getListOfAllUsernames() {
        return listOfAllUsernames;
    }

    public ArrayList<String> getListOfAllCompanyNames() { return listOfAllCompanyNames; }

    public ArrayList<Watch> getListOfAllWatches() {
        return listOfAllWatches;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getListOfAllBooks() {
        return listOfAllBooks;
    }

    public ArrayList<Bag> getListOfAllBags() {
        return listOfAllBags;
    }

    public ArrayList<Cloth> getListOfAllCloths() {
        return listOfAllCloths;
    }

    public ArrayList<Headphones> getListOfAllHeadphones() {
        return listOfAllHeadphones;
    }

    public ArrayList<Mobile> getListOfAllMobiles() {
        return listOfAllMobiles;
    }

    public ArrayList<Painting> getListOfAllPaintings() {
        return listOfAllPaintings;
    }

    public ArrayList<Rug> getListOfAllRugs() {
        return listOfAllRugs;
    }

    public ArrayList<Shoes> getListOfAllShoes() {
        return listOfAllShoes;
    }

    public ArrayList<SportEquipment> getListOfAllSportEquipments() {
        return listOfAllSportEquipments;
    }

    public ArrayList<Toy> getListOfAllToys() {
        return listOfAllToys;
    }

    @Override
    public String toString() {
        return "Shop \n" +
                "name='" + name + '\n' +
                ", web address='" + webAddress + '\n' +
                ", support phone='" + supportPhone + '\n' +
                ", support email address='" + supportEmailAddress + "\n";
    }

    public boolean loginUser(String username, String password) {
        for(User user : listOfAllUsers) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean loginSeller(String companyName, String companyPassword) {
        for (Seller seller : listOfAllSellers) {
            if (seller.getCompanyName().equals(companyName) && seller.getPassword().equals(companyPassword)) {
                return true;
            }
        }
        return false;
    }

    public boolean loginAdmin(String username, String password) {
        for (Admin admin : listOfAllAdmins) {
            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean searchProduct(String nameOfProduct) {
        boolean existence = false;
        for (int i = 0; i < listOfAllProducts.size(); i++) {
            if(nameOfProduct.equals(listOfAllProducts.get(i).getName())) {
                existence = true;
                System.out.println("Here is what we found in shop >>");
                System.out.println(listOfAllProducts.get(i).getName() + " ⇶");
                System.out.println("price : " + listOfAllProducts.get(i).getPrice());
                System.out.println("number of available : " + listOfAllProducts.get(i).getQuantity());
                System.out.println("comments about it : " + listOfAllProducts.get(i).getListOfComments());
                System.out.println("the company that sells it : " + listOfAllProducts.get(i).getCompanyOfSeller());
            }
        }
        return existence;
    }

    public Product addToShoppingCart(String nameOfProduct) {
        for(int i = 0; i < listOfAllProducts.size(); i++) {
            if (nameOfProduct.equals(listOfAllProducts.get(i).getName())) {
                return listOfAllProducts.get(i);
            }
        }
        return null;
    }

    public void viewListOfAllWatches() {
        for (int i = 0; i < listOfAllWatches.size(); i++) {
            System.out.println(listOfAllWatches.get(i).toString());
            System.out.println("\n");
        }
    }

    public void viewListOfAllBooks() {
        for (int i = 0; i < listOfAllBooks.size(); i++) {
            System.out.println(listOfAllBooks.get(i).toString());
            System.out.println("\n");
        }
    }

    public void viewListOfAllBags() {
        for (int i = 0; i < listOfAllBags.size(); i++) {
            System.out.println(listOfAllBags.get(i).toString());
            System.out.println("\n");
        }
    }

    public void viewListOfAllCloths() {
        for (int i = 0; i < listOfAllCloths.size(); i++) {
            System.out.println(listOfAllCloths.get(i).toString());
            System.out.println("\n");
        }
    }

    public void viewListOfAllHeadphones() {
        for (int i = 0; i < listOfAllHeadphones.size(); i++) {
            System.out.println(listOfAllHeadphones.get(i).toString());
            System.out.println("\n");
        }
    }

    public void viewListOfAllMobiles() {
        for (int i = 0; i < listOfAllMobiles.size(); i++) {
            System.out.println(listOfAllMobiles.get(i).toString());
            System.out.println("\n");
        }
    }

    public void viewListOfAllPainting() {
        for (int i = 0; i < listOfAllPaintings.size(); i++) {
            System.out.println(listOfAllPaintings.get(i).toString());
            System.out.println("\n");
        }
    }

    public void viewListOfAllRugs() {
        for (int i = 0; i < listOfAllRugs.size(); i++) {
            System.out.println(listOfAllRugs.get(i).toString());
            System.out.println("\n");
        }
    }

    public void viewListOfAllShoes() {
        for (int i = 0; i < listOfAllShoes.size(); i++) {
            System.out.println(listOfAllShoes.get(i).toString());
            System.out.println("\n");
        }
    }

    public void viewListOfAllSportEquipments() {
        for (int i = 0; i < listOfAllSportEquipments.size(); i++) {
            System.out.println(listOfAllSportEquipments.get(i).toString());
            System.out.println("\n");
        }
    }

    public void viewListOfAllToys() {
        for (int i = 0; i < listOfAllToys.size(); i++) {
            System.out.println(listOfAllToys.get(i).toString());
            System.out.println("\n");
        }
    }

    public void showUserAccount() {
        for (int i = 0; i < listOfAccounts.size(); i++) {
            System.out.println(listOfAccounts.get(i).toString());
            System.out.println("\n");
        }
    }

}
