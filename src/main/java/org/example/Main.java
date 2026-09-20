package org.example;

import java.io.*;
import java.lang.management.ClassLoadingMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static final String REQUEST_FILE = "requests.txt";

    static User user1 = new User("firstuser", "pass1234", "user.one@gmail.com",
            "09901231020", "tehran", 2000);
    static User user2 = new User("heli", "heli7496", "h.ja@gmail.com", "09122584130", "iran.kerman" , 150);
    static Seller seller1 = new Seller("Goody", "1212pass", 57000, true);
    static Shop shop1 = new Shop();
    static Admin mainAdmin = new Admin("mainAdmin", "1973admin", "admin.shop059@gamil.com");
    static Watch watch1 = new Watch("watch1",70,9,"good, more beautiful in close look, lovely",
            511, "Goody", "yes", "Omega","Switzerland");
    static Mobile mobile1 = new Mobile("samsungA51", 1000, 5, "good and beautiful", 411, "Goody", "samsung",
            6, 128, 17, "white");

    static Mobile mobile2 = new Mobile("samsungA33", 700, 7, "didn't like it that much, nice one", 412 , "Goody",
            "samsung" , 6, 128, 25, "blue");

    static Book book1 = new Book("one", 15, 10, "love this book", 111, "Goody", "person", 2011, 2 , "romance", 150, "+12");
    static Headphones headphone1 = new Headphones("QCY T13" , 150, 12, "good thing , bought it for gift and i think it's nice" , 211, "Goody" ,
            "QCY", "white", "Bluetooth", "yes");
    static SportEquipment sport1 = new SportEquipment("gym.ball" , 20, 41, "usefull", 311, "Goody"
    , "Cross" , "fitness", "colorfull" , "US");
    static Cloth cloth1 = new Cloth("Tshirt" , 50, 14 , "like this color and kind", 611, "Goody", "colorful" , "small" , "Floriza" , "no gender" , "cottton");
    static Cloth cloth2 = new Cloth("hoodi" , 75 , 5 , "its soo good and warm , love it more than on screen" , 612 , "Goody" , "black" , "large" , "E1649" , "women", "fluff");
    static Bag bag1 = new Bag("small.bag" , 80, 22, "lovely" , 711, "Goody" ,
            "Firisky" , "black" , "leather" , "button-like", 2);
    static Shoes shoe1 = new Shoes("shoes" , 150, 3, "" , 811, "Goody", "France" , "gray", 38, "leather");

    static Painting painting1 = new Painting("sky.painting", 50, 1 , "", 911, "Goody" , "Olivia" , 2, "Italy" , "watercolor");
    static Toy toy1 = new Toy("exploding.cats" , 20, 12, "i love this game" , 1011, "Goody" , "+15" , 6, 60 , "strategy");
    static Rug rug1 = new Rug("persian.rug", 600, 3, "nice rug with beautiful pattern", 1111, "Goody", "old" , "Iran", 10000, "yes");

    static Order order1 = new Order("3/11/2120", 150, "firstuser", "Goody");




    static HashMap<String, User> mapperUser = new HashMap<String, User>();
    static HashMap<String , Seller> mapperSeller = new HashMap<String , Seller>();
    static HashMap<String, Admin> mapperAdmin = new HashMap<String, Admin>();

    public static void main(String[] args) throws IOException {

        mainMenu();
    }
    public static void mainMenu() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        shop1.addToListOfAllUsers(user1);
        shop1.addToListOfAllAccounts(user1);
        shop1.addToListOfAllUsernames("firstuser");
        mapperUser.put("firstuser", user1);
        shop1.addToListOfAllAccounts(user2);
        mapperUser.put("heli", user2);
        shop1.addToListOfAllUsernames("heli");
        shop1.addToListOfAllUsers(user2);

        shop1.addToListOfAllAdmins(mainAdmin);
        shop1.addToListOfAllAccounts(mainAdmin);
        mapperAdmin.put("mainAdmin", mainAdmin);

        shop1.addToListOfAllProducts(watch1);
        shop1.addToListOfAllWatches(watch1);
        shop1.addToListOfAllProducts(toy1);
        shop1.addToListOfAllProducts(painting1);
        shop1.addToListOfAllProducts(cloth1);
        shop1.addToListOfAllProducts(cloth2);
        shop1.addToListOfAllProducts(sport1);
        shop1.addToListOfAllProducts(bag1);
        shop1.addToListOfAllProducts(shoe1);
        shop1.addToListOfAllProducts(rug1);
        shop1.addToListOfAllProducts(mobile1);
        shop1.addToListOfAllProducts(mobile2);
        shop1.addToListOfAllProducts(headphone1);
        user1.addToShoppingCartUser(book1);
        shop1.addToListOfAllPaintings(painting1);
        shop1.addToListOfAllRugs(rug1);
        shop1.addToListOfAllToy(toy1);
        shop1.addToListOfAllShoes(shoe1);
        shop1.addToListOfAllCloths(cloth1);
        shop1.addToListOfAllCloths(cloth2);
        shop1.addToListOfAllMobiles(mobile1);
        shop1.addToListOfAllMobiles(mobile2);
        shop1.addToListOfAllSportEquipment(sport1);
        shop1.addToListOfAllHeadphones(headphone1);
        shop1.addToListOfAllBags(bag1);

        seller1.addToListOfAvailableProducts(watch1);
        seller1.addToListOfAvailableProducts(mobile1);
        seller1.addToListOfAvailableProducts(mobile2);
        seller1.addToListOfAvailableProducts(book1);
        seller1.addToListOfAvailableProducts(headphone1);
        seller1.addToListOfAvailableProducts(rug1);
        seller1.addToListOfAvailableProducts(toy1);
        seller1.addToListOfAvailableProducts(sport1);
        seller1.addToListOfAvailableProducts(cloth1);
        seller1.addToListOfAvailableProducts(cloth2);
        seller1.addToListOfAvailableProducts(bag1);
        seller1.addToListOfAvailableProducts(shoe1);
        seller1.addToListOfAvailableProducts(painting1);

        user1.addToShoppingCartUser(bag1);
        user1.addToShoppingCartUser(cloth1);
        user1.addToShoppingCartUser(sport1);
        user1.addToShoppingCartUser(painting1);
        user1.addToListOfPurchasedProduct(toy1);
        user1.addToListOfPurchasedProduct(book1);
        user1.addToListOfPurchasedProduct(watch1);
        user1.addToListOfOrders(order1);

        user2.addToListOfPurchasedProduct(painting1);
        user2.addToShoppingCartUser(cloth2);
        user2.addToShoppingCartUser(headphone1);
        user2.addToListOfPurchasedProduct(sport1);

        shop1.addToListOfAllCompanyNames("Goody");
        shop1.addToListOfAllAccounts(seller1);
        shop1.addToListOfAllSellers(seller1);
        mapperSeller.put("Goody", seller1);

        System.out.println("Welcome to shop 059");
        System.out.println("Who are you?\n1.user\t2.seller\t3.admin  \t4.don't have an account");
        int mainCommand = scanner.nextInt();
        switch (mainCommand) {
            case 1 :
                System.out.println("Please enter your username and password");
                String username = scanner.next();
                String password = scanner.next();
                if (shop1.loginUser(username, password)) {
                    System.out.println("welcome " + username);

                    userMenu();

                } else {
                    System.out.println("wrong password or username\nplease try again");
                    mainMenu();
                }
                break;

            case 2 :
                System.out.println("Please enter name of your company and your password");
                String companyName = scanner.next();
                String companyPassword = scanner.next();
                if (shop1.loginSeller(companyName, companyPassword)) {
                    System.out.println("You are now in your company page «" + companyName + "»");
                    sellerMenu();

                } else {
                    System.out.println("wrong password or username\nplease try again");
                    mainMenu();
                }
                break;

            case 3 :
                System.out.println("Please enter your username and your password");
                String usernameAdmin = scanner.next();
                String passwordAdmin = scanner.next();
                if (shop1.loginAdmin(usernameAdmin, passwordAdmin)) {
                    System.out.println("Welcome admin ↦ " + usernameAdmin );
                    adminMenu();
                }
                else {
                    System.out.println("Wrong username or password\nplease try again");
                    mainMenu();
                }

                break;

            case 4 :
                System.out.println("Do you want to sell products?\n1.no(user account) \t2.yse(seller account)");
                int newAccountCommand = scanner.nextInt();
                switch (newAccountCommand) {
                    case 1 :
                        System.out.println("Choose a username");
                        String usernameNew = scanner.next();
                        if (shop1.getListOfAllUsernames().contains(usernameNew)) {
                            System.out.println(usernameNew + "taken.\nPlease choose another username");
                            mainMenu();
                        }
                        else {
                            System.out.println("Choose a password");
                            String passwordNew = scanner.next();
                            Pattern patternPassword = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
                            Matcher matcherPassword = patternPassword.matcher(passwordNew);
                            if (matcherPassword.find()) {
                                System.out.println("Enter your email address");
                                String emailAddressNew = scanner.next();
                                Pattern patternEmailAddress = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
                                Matcher matcherEmailAddress = patternEmailAddress.matcher(emailAddressNew);
                                if (matcherEmailAddress.find()) {
                                    System.out.println("Enter your phone number");
                                    String phoneNumberNew = scanner.next();
                                    if (phoneNumberNew.startsWith("09")) {
                                        Pattern patternPhoneNumber = Pattern.compile("[0-9]{11}");
                                        Matcher matcherPhoneNumber = patternPhoneNumber.matcher(phoneNumberNew);
                                        if (matcherPhoneNumber.find()) {
                                            System.out.println("Enter your address");
                                            String addressNew = scanner.next();
                                            User newUser = new User(usernameNew, passwordNew, emailAddressNew, phoneNumberNew, addressNew, 20);
                                            shop1.addToListOfAllUsernames(usernameNew);
                                            shop1.addToListOfAllAccounts(newUser);
                                            shop1.addToListOfAllUsers(newUser);
                                            mapperUser.put(usernameNew, newUser);
                                            System.out.println("Your account created successfully and a minimum amount of 20$ was added to your wallet");
                                            userMenu();
                                        }
                                        else {
                                            System.out.println("Please enter a valid phone number(length = 11 numbers)");
                                            mainMenu();
                                        }
                                    }
                                    else {
                                        System.out.println("Please enter a valid phone number(phone number should start with 09)");
                                        mainMenu();
                                    }
                                }
                                else {
                                    System.out.println("Please write a valid email address");
                                    mainMenu();
                                }
                            }
                            else {
                                System.out.println("Your password should be at least 8 character and contains both letters and numbers\nThat's just for a safe account");
                                mainMenu();
                            }
                        }
                        break;

                    case 2 :

                        System.out.println("Choose a name for your company");
                        String newCompanyName = scanner.next();
                        if (shop1.getListOfAllCompanyNames().contains(newCompanyName)) {
                            System.out.println(newCompanyName + "taken.\nPlease choose another name for your company");
                            mainMenu();
                        }
                        else {
                            System.out.println("Choose a password");
                            String passwordNew = scanner.next();
                            Pattern patternPassword = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
                            Matcher matcherPassword = patternPassword.matcher(passwordNew);
                            if (matcherPassword.find()) {
                                System.out.println("What amount of money do you want to put in your wallet(in $)");
                                float wallet = scanner.nextFloat();
                                Seller newSeller = new Seller(newCompanyName, passwordNew, wallet, false);
                                shop1.addToListOfAllCompanyNames(newCompanyName);
                                shop1.addToListOfAllSellers(newSeller);
                                shop1.addToListOfAllAccounts(newSeller);
                                mapperSeller.put(newCompanyName, newSeller);
                                try (FileWriter f = new FileWriter(REQUEST_FILE, true);
                                     BufferedWriter b = new BufferedWriter(f);
                                     PrintWriter p = new PrintWriter(b);) {

                                    p.println("New seller with company name «" + newCompanyName +"» was added.Wait for authorization");
                                    System.out.println("Your company page was added successfully\nYou can continue after an admin confirm your authorization.");
                                    sellerMenu();

                                } catch (IOException i) {
                                    i.printStackTrace();
                                }
                            }
                            else {
                                System.out.println("Your password should be at least 8 character and contains both letters and numbers\nThat's just for a safe account");
                                mainMenu();
                            }
                        }

                        break;

                    default:
                        System.out.println("please choose 1 or 2");
                        mainMenu();
                }

                break;

            default:
                System.out.println("Please choose between 1 and 4");
        }
    }
    public static void userMenu() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your username again to continue");
        String username = scanner.next();
        User userValue = mapperUser.get(username);

        System.out.println("Now What do you want to do" + username + "?\n1.search a product\t2.view your shopping cart" +
                "\t3.view wallet\n4.add fund to your wallet\t5.view your past orders\t6.view your purchased products" +
                "\t7.view the situation of your order" +
                "\n8.edit your personal information\t9.view details of shop 059\t10.back to the main menu");
        int userCommand = scanner.nextInt();
        switch (userCommand) {
            case 1 :
                System.out.println("Do want to 1.see products of the categories\t2.search a product with name\t3.back to the menu");
                int searchCommand = scanner.nextInt();
                switch (searchCommand) {
                    case 1 :
                        System.out.println("Which category ?");
                        System.out.println("1.book\t2.headphone\t3.sport products\t4.mobile\t5.watch " +
                                "\n6.cloth \t7.bag\t8.shoes\t9.painting\t10.toys\t11.rug");
                        int categoriesCommand = scanner.nextInt();
                        System.out.println("Here are available products in category ↷");
                        switch (categoriesCommand) {
                            case 1 :
                                System.out.println("book :");
                                shop1.viewListOfAllBooks();
                                userMenu();
                                break;

                            case 2 :
                                System.out.println("headphones :");
                                shop1.viewListOfAllHeadphones();
                                userMenu();
                                break;

                            case 3 :
                                System.out.println("sport products :");
                                shop1.viewListOfAllSportEquipments();
                                userMenu();
                                break;

                            case 4 :
                                System.out.println("mobile :");
                                shop1.viewListOfAllMobiles();
                                userMenu();
                                break;

                            case 5 :
                                System.out.println("watch :");
                                shop1.viewListOfAllWatches();
                                userMenu();

                                break;

                            case 6 :
                                System.out.println("cloth :");
                                shop1.viewListOfAllCloths();
                                userMenu();
                                break;

                            case 7 :
                                System.out.println("bag :");
                                shop1.viewListOfAllBags();
                                userMenu();
                                break;

                            case 8 :
                                System.out.println("shoes :");
                                shop1.viewListOfAllShoes();
                                userMenu();
                                break;

                            case 9 :
                                System.out.println("painting :");
                                shop1.viewListOfAllPainting();
                                userMenu();
                                break;

                            case 10 :
                                System.out.println("toys :");
                                shop1.viewListOfAllToys();
                                userMenu();
                                break;

                            case 11 :
                                System.out.println("rug :");
                                shop1.viewListOfAllRugs();
                                userMenu();
                                break;

                            default:
                                System.out.println("choose from 1 to 11");


                        }

                        break;

                    case 2 :
                        System.out.println("Enter name of the product you are looking for");
                        String searchName = scanner.next();
                        shop1.searchProduct(searchName);
                        System.out.println("do you want to add it to your shopping cart?\n1.yes\t2.no(back to the menu)");
                        int addCommand = scanner.nextInt();
                        switch (addCommand) {
                            case 1 :
                                System.out.println("How many of this product do you want?");
                                int wantedNumber = scanner.nextInt();
                                Product addingProduct =  shop1.addToShoppingCart(searchName);
                                userValue.addToShoppingCartUser(addingProduct);
                                System.out.println(searchName + " added to your shopping cart successfully");
                                userValue.getShoppingCart();
                                userMenu();
                                break;

                            default:
                                userMenu();
                        }

                        break;

                    case 3 :
                        userMenu();
                        break;

                    default:
                        System.out.println("please choose 1 or 2");
                        userMenu();
                }

                break;

            case 2 :

                if (userValue.shoppingCartEmpty()) {
                    System.out.println("There isn't anything in your shopping cart");
                    userMenu();
                } else {
                    userValue.getShoppingCart();
                    System.out.println("what do you want to do?\n1.remove an item\t2.finalize your shopping cart\t3.back to the menu");
                    int shoppingCommand = scanner.nextInt();
                    switch (shoppingCommand) {
                        case 1 :
                            System.out.println("Enter name of the product you want to remove");
                            String removeProduct = scanner.next();
                            if (userValue.removeFromShoppingCart(removeProduct)) {
                                System.out.println(removeProduct + " removed successfully");
                                userValue.getShoppingCart();
                                userMenu();
                            }
                            else {
                                System.out.println("There isn't any product that match "+ removeProduct + " in your shopping cart");
                                userMenu();
                            }
                            break;

                        case 2 :

                            float userWallet = userValue.getWallet();
                            float totalPrice = userValue.getTheTotalPrice();
                            if (userWallet >= totalPrice) {
                                try (FileWriter f = new FileWriter(REQUEST_FILE, true);
                                     BufferedWriter b = new BufferedWriter(f);
                                     PrintWriter p = new PrintWriter(b);) {

                                    p.println("order of user(" + username + ").Wait for confirmation.");
                                    userValue.setDidFinalized(true);

                                } catch (IOException i) {
                                    i.printStackTrace();
                                }
                                System.out.println("You finalized your shopping cart and request was send to the shop.\n" +
                                        "Your order will be sent after an admin confirm it.");
                                mainMenu();
                            } else {
                                System.out.println("Unfortunately you can not finalize your shopping cart because ");
                                System.out.println("You have " + userWallet + "$ in your wallet. But the total price of your shopping cart is "
                                        + totalPrice + "$, which is more than what you have");
                                System.out.println("You should first send request for adding fund to your wallet and after in was confirmed come back to this section");
                                userMenu();
                            }
                            break;

                        case 3 :
                            userMenu();
                            break;

                        default:
                            System.out.println("choose 1 to 3");
                            userMenu();
                    }
                }

                break;

            case 3 :
                if (!userValue.getAskFund()) {
                    System.out.println("There is " + userValue.getWallet() + "$ in your wallet");
                    userMenu();
                } else {
                    File newFile = new File(REQUEST_FILE);
                    if (newFile.length() == 0) {
                        System.out.println("your request confirmed by an admin");
                        int addingFund = (int) (userValue.getAddFund() + userValue.getWallet());
                        userValue.setWallet(addingFund);
                        System.out.println(userValue.getWallet());
                        userMenu();
                    }

                }
                System.out.println("There is " + user1.getWallet() + "$ in your wallet");
                userMenu();
                break;

            case 4 :
                System.out.println("There is " + user1.getWallet() + "$ in your wallet");
                System.out.println("What amount of money(in $) do you want to add to your wallet?");
                int requestFund = scanner.nextInt();
                userValue.setAddFund(requestFund);
                try (FileWriter f = new FileWriter(REQUEST_FILE, true);
                     BufferedWriter b = new BufferedWriter(f);
                     PrintWriter p = new PrintWriter(b);) {

                    p.println("requests for adding fund (" + requestFund + ") for " + userValue.getUsername() + ".Wait for confirm");
                    userValue.setAskFund(true);


                } catch (IOException i) {
                    i.printStackTrace();
                }
                System.out.println("Your request about adding " + requestFund + "$ was made.");
                System.out.println("The money will be add after an admin confirm it.");
                mainMenu();

                break;

            case 5 :
                System.out.println("Here are your past orders ↷");
                userValue.getListOfOrdersToString();
                userMenu();

                break;

            case 6 :
                System.out.println("Here are your purchased products ↷");
                userValue.getListOfPurchasedProductToString();
                userMenu();

                break;

            case 7 :

                if (userValue.getDidFinalized()) {
                    File newFile = new File(REQUEST_FILE);

                    if (newFile.length() == 0) {

                        float totalPrice = userValue.getTheTotalPrice();
                        String userDetail = username;
                        String sellerDetail = userValue.getShoppingCartSeller().get(0).getCompanyOfSeller();
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        Date date = new Date();
                        String now = formatter.format(date);
                        Order newOrder = new Order(now, totalPrice, userDetail, sellerDetail);
                        userValue.addToListOfOrders(newOrder);

                        float newWallet = userValue.getWallet() - totalPrice;
                        userValue.setWallet(newWallet);
                        shop1.addTotalProfit(totalPrice);

                        Seller sellerInUser =  mapperSeller.get(sellerDetail);
                        sellerInUser.addToWallet(totalPrice);
                        userValue.removeAllInShoppingCart();
                        System.out.println(newOrder.toString());
                        System.out.println("Your order has confirmed by an admin.\nYou can see your order in your menu(part 5)");
                        mainMenu();
                    } else {
                        System.out.println("Your order hasn't confirmed by an admin yet");
                        userMenu();
                    }

                } else {
                    System.out.println("It seems you haven't finalized your shopping cart yet.");
                    userMenu();
                }

                break;

            case 8 :

                System.out.println(userValue.toStringPersonalInfo());
                System.out.println("Which part do you want to edit?\nyour...  1.username\t2.password\t3.email address\t4.phone number\t5.address\t6.back to the menu");
                int editCommand = scanner.nextInt();
                switch (editCommand) {
                    case 1 :
                        System.out.println("Enter you new username");
                        String newUsername = scanner.next();
                        for (int i = 0; i < shop1.getListOfAllUsernames().size(); i++) {
                            if (newUsername.equals(shop1.getListOfAllUsernames().get(i))) {
                                System.out.println(newUsername + " taken");
                                System.out.println("please choose another one");
                                userMenu();
                            }
                            else {
                                userValue.setUsername(newUsername);
                                System.out.println("username changed successfully");
                                System.out.println("Your personal information now : ↷");
                                System.out.println(userValue.toStringPersonalInfo());
                                userMenu();
                            }
                        }

                        break;

                    case 2 :
                        System.out.println("Enter your new password");
                        String newPassword = scanner.next();
                        Pattern patternPassword = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
                        Matcher matcherPassword = patternPassword.matcher(newPassword);
                        if (matcherPassword.find()) {
                            userValue.setPassword(newPassword);
                            System.out.println("Password changed successfully");
                            System.out.println("Your personal information now : ↷");
                            System.out.println(userValue.toStringPersonalInfo());
                            userMenu();
                        }
                        else {
                            System.out.println("Your password should be at least 8 character and contains both letters and numbers\nThat's just for a safe account");
                            userMenu();
                        }

                        break;

                    case 3 :
                        System.out.println("Enter your new email address");
                        String newEmail = scanner.next();
                        Pattern patternEmailAddress = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
                        Matcher matcherEmailAddress = patternEmailAddress.matcher(newEmail);
                        if (matcherEmailAddress.find()) {
                            userValue.setEmailAddress(newEmail);
                            System.out.println("Email Address changed successfully");
                            System.out.println("Your personal information now : ↷");
                            System.out.println(userValue.toStringPersonalInfo());
                            userMenu();
                        }
                        else {
                            System.out.println("Please write a valid email address");
                            userMenu();
                        }

                        break;

                    case 4 :
                        System.out.println("Enter your new phone number");
                        String newPhoneNumber = scanner.next();
                        if (newPhoneNumber.startsWith("09")) {
                            Pattern patternPhoneNumber = Pattern.compile("[0-9]{11}");
                            Matcher matcherPhoneNumber = patternPhoneNumber.matcher(newPhoneNumber);
                            if (matcherPhoneNumber.find()) {
                                userValue.setPhoneNumber(newPhoneNumber);
                                System.out.println("Phone number changed successfully");
                                System.out.println("Your personal information now : ↷");
                                System.out.println(userValue.toStringPersonalInfo());
                                userMenu();
                            }
                            else {
                                System.out.println("Please enter a valid phone number(length = 11 numbers)");
                                userMenu();
                            }
                        }
                        else {
                            System.out.println("Please enter a valid phone number(phone number should start with 09)");
                            userMenu();
                        }

                        break;

                    case 5 :
                        System.out.println("Enter your new address(use dot\".\"between your words)");
                        String newAddress = scanner.next();
                        userValue.setAddress(newAddress);
                        System.out.println("Your personal information now : ↷");
                        System.out.println(userValue.toStringPersonalInfo());
                        userMenu();
                        break;

                    case 6 :
                        userMenu();
                        break;

                    default:
                        System.out.println("please enter from 1 to 5");
                }
                break;

            case 9 :
                System.out.println("Here are our shop's details >> \n");
                System.out.println(shop1.toString());
                userMenu();
                break;

            case 10 :
                mainMenu();
                break;

            default:
                System.out.println("please enter a number between 1 to 6");
                userMenu();
        }
    }

    public static void sellerMenu() throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your company name again to continue");
        String companyName = scanner.next();
        Seller sellerValue = mapperSeller.get(companyName);

        File newFile = new File(REQUEST_FILE);
        if (newFile.length() == 0) {
            sellerValue.setDidGetAuthorization(true);
        } else {

            System.out.println("It seems you haven't get your authorization yet");
            System.out.println("Unfortunately you can't go any further.");
            mainMenu();
        }

        if (sellerValue.isDidGetAuthorization()) {

            System.out.println("What do you want to do?\n1.add a new product\t2.view your list of available products\t3.view wallet\t4.back to the main menu");
            int mainCommandSeller = scanner.nextInt();
            switch (mainCommandSeller) {
                case 1 :

                    System.out.println("What kind of product do you want to add?\n1.book\t2.headphone\t3.sport products\t4.mobile\t5.watch\" +\n" +
                            "\t6.cloth\t7.bag\t8.shoes\t9.Rug\t10.Painting\t11.toys");
                    int addCommand = scanner.nextInt();
                    switch (addCommand) {
                        case 1 :
                            System.out.println("Enter : name, price, number of available, list of comments, ID, author ,release year," +
                                    " number of volumes, genre, number of pages, reading age");
                            String name1 = scanner.next();
                            float price1 = scanner.nextFloat();
                            int quantity1 = scanner.nextInt();
                            String listOfComments1 = scanner.next();
                            int ID1 = scanner.nextInt();
                            String author1 = scanner.next();
                            int releaseYear1 = scanner.nextInt();
                            int numberOfVolumes1 = scanner.nextInt();
                            String genre1 = scanner.next();
                            int numberOfPages1 = scanner.nextInt();
                            String readingAge1 = scanner.next();

                            Book book = new Book(name1, price1, quantity1, listOfComments1, ID1, companyName, author1, releaseYear1, numberOfVolumes1, genre1, numberOfPages1, readingAge1);
                            sellerValue.addToListOfAvailableProducts(book);
                            shop1.addToListOfAllProducts(book);
                            shop1.addToListOfAllBooks(book);

                            break;

                        case 2 :
                            System.out.println("Enter : name, price, number of available, list of comments, ID, brand, color ," +
                                    "connection, doesHaveNC");
                            String name2 = scanner.next();
                            float price2 = scanner.nextFloat();
                            int quantity2 = scanner.nextInt();
                            String listOfComments2 = scanner.next();
                            int ID2 = scanner.nextInt();
                            String brand = scanner.next();
                            String color = scanner.next();
                            String connection = scanner.next();
                            String doesHaveNv = scanner.next();

                            Headphones newHeadphones = new Headphones(name2, price2, quantity2, listOfComments2, ID2, companyName,
                                    brand, color, connection, doesHaveNv);
                            sellerValue.addToListOfAvailableProducts(newHeadphones);
                            shop1.addToListOfAllProducts(newHeadphones);
                            shop1.addToListOfAllHeadphones(newHeadphones);


                            break;

                        case 3 :
                            System.out.println("Enter : name, price, number of available, list of comments, ID, brand, name of sport, color, country");
                            String name3 = scanner.next();
                            float price3 = scanner.nextFloat();
                            int quantity3 = scanner.nextInt();
                            String listOfComments3 = scanner.next();
                            int ID3 = scanner.nextInt();
                            String brand3 = scanner.next();
                            String nameOfSport3 = scanner.next();
                            String color3 = scanner.next();
                            String country3 = scanner.next();

                             SportEquipment newSport = new SportEquipment(name3, price3, quantity3, listOfComments3, ID3, companyName ,brand3, nameOfSport3, color3, country3);
                            sellerValue.addToListOfAvailableProducts(newSport);
                            shop1.addToListOfAllProducts(newSport);
                            shop1.addToListOfAllSportEquipment(newSport);

                            break;

                        case 4 :
                            System.out.println("Enter : name, price, number of available, list of comments, ID, brand, memory, storage, sizing, color");
                            String name4 = scanner.next();
                            float price4 = scanner.nextFloat();
                            int quantity4 = scanner.nextInt();
                            String listOfComments4 = scanner.next();
                            int ID4 = scanner.nextInt();
                            String brand4 = scanner.next();
                            int memory4 = scanner.nextInt();
                            int storage4 = scanner.nextInt();
                            int sizing4 = scanner.nextInt();
                            String color4 = scanner.next();

                            Mobile newMobile = new Mobile(name4, price4, quantity4, listOfComments4, ID4, companyName
                            , brand4, memory4, storage4, sizing4, color4);

                            sellerValue.addToListOfAvailableProducts(newMobile);
                            shop1.addToListOfAllProducts(newMobile);
                            shop1.addToListOfAllMobiles(newMobile);


                            break;

                        case 5 :
                            System.out.println("Enter : name, price, number of available, list of comments, ID, is it digital or not(yes/no), brand, country");
                            String name = scanner.next();
                            float price = scanner.nextFloat();
                            int quantity = scanner.nextInt();
                            String listOfComments = scanner.next();
                            int ID = scanner.nextInt();
                            String isDigital = scanner.next();
                            String brand5 = scanner.next();
                            String country = scanner.next();
                            String companyNameW = sellerValue.getCompanyName();

                            Watch newWatch = new Watch(name, price, quantity, listOfComments, ID, companyNameW, isDigital, brand5, country);
                            sellerValue.addToListOfAvailableProducts(newWatch);
                            shop1.addToListOfAllProducts(newWatch);
                            shop1.addToListOfAllWatches(newWatch);
                            break;

                        case 6 :
                            System.out.println("Enter : name, price, number of available, list of comments, ID," +
                                    "color, size, brand, sex, material");
                            String name6 = scanner.next();
                            float price6 = scanner.nextFloat();
                            int quantity6 = scanner.nextInt();
                            String listOfComments6 = scanner.next();
                            int ID6 = scanner.nextInt();
                            String color6 = scanner.next();
                            String size6 = scanner.next();
                            String brand6 = scanner.next();
                            String sex6 = scanner.next();
                            String material6 = scanner.next();

                            Cloth newCloth = new Cloth(name6, price6, quantity6, listOfComments6, ID6, companyName, color6, size6, brand6, sex6, material6);
                            sellerValue.addToListOfAvailableProducts(newCloth);
                            shop1.addToListOfAllProducts(newCloth);
                            shop1.addToListOfAllCloths(newCloth);


                            break;

                        case 7 :
                            System.out.println("Enter : name, price, number of available, list of comments, ID, brand, color, materials, size, how to close");
                            String name7 = scanner.next();
                            float price7 = scanner.nextFloat();
                            int quantity7 = scanner.nextInt();
                            String listOfComments7 = scanner.next();
                            int ID7 = scanner.nextInt();
                            String brand7 = scanner.next();
                            String color7 = scanner.next();
                            String material7 = scanner.next();
                            int size7 = scanner.nextInt();
                            String howtoclose = scanner.next();

                            Bag newBag = new Bag(name7, price7, quantity7, listOfComments7, ID7, companyName, brand7,
                                    color7, material7, howtoclose, size7);
                            sellerValue.addToListOfAvailableProducts(newBag);
                            shop1.addToListOfAllProducts(newBag);
                            shop1.addToListOfAllBags(newBag);

                            break;

                        case 8 :
                            System.out.println("Enter : name, price, number of available, list of comments, ID, country, color, size, material");
                            String name8 = scanner.next();
                            float price8 = scanner.nextFloat();
                            int quantity8 = scanner.nextInt();
                            String listOfComments8 = scanner.next();
                            int ID8 = scanner.nextInt();
                            String county8 = scanner.next();
                            String color8 = scanner.next();
                            int size8 = scanner.nextInt();
                            String material8 = scanner.next();

                            Shoes newShoes = new Shoes(name8, price8, quantity8, listOfComments8, ID8, companyName,
                                    county8, color8, size8, material8);
                            sellerValue.addToListOfAvailableProducts(newShoes);
                            shop1.addToListOfAllProducts(newShoes);
                            shop1.addToListOfAllShoes(newShoes);

                            break;

                        case 9 :
                            System.out.println("Enter : name, price, number of available, list of comments, ID, number of players, age of playing, time of playing, style of game");
                            String name9 = scanner.next();
                            float price9 = scanner.nextFloat();
                            int quantity9 = scanner.nextInt();
                            String listOfComments9 = scanner.next();
                            int ID9 = scanner.nextInt();
                            int numberOfPlayers9 = scanner.nextInt();
                            String ageOfPlaying = scanner.next();
                            int timeOfPlaying = scanner.nextInt();
                            String styleOfGame = scanner.next();

                            Toy newToy = new Toy(name9, price9, quantity9, listOfComments9, ID9, companyName,
                                   ageOfPlaying , numberOfPlayers9, timeOfPlaying, styleOfGame);
                            sellerValue.addToListOfAvailableProducts(newToy);
                            shop1.addToListOfAllProducts(newToy);
                            shop1.addToListOfAllToy(newToy);

                            break;

                        case 10 :
                            System.out.println("Enter : name, price, number of available, list of comments, ID, pattern, country, number of knots, is handmade");
                            String name10 = scanner.next();
                            float price10 = scanner.nextFloat();
                            int quantity10 = scanner.nextInt();
                            String listOfComments10 = scanner.next();
                            int ID10 = scanner.nextInt();
                            String pattern = scanner.next();
                            String country10 = scanner.next();
                            int numberOfKnots = scanner.nextInt();
                            String isHandmade = scanner.next();

                            Rug newRug = new Rug(name10, price10, quantity10, listOfComments10, ID10, companyName
                            , pattern, country10, numberOfKnots, isHandmade);
                            sellerValue.addToListOfAvailableProducts(newRug);
                            shop1.addToListOfAllProducts(newRug);
                            shop1.addToListOfAllRugs(newRug);

                            break;

                        case 11 :
                            System.out.println("Enter : name, price, number of available, list of comments, ID, painter, size, country, paintingStyle");
                            String name11 = scanner.next();
                            float price11 = scanner.nextFloat();
                            int quantity11 = scanner.nextInt();
                            String listOfComments11 = scanner.next();
                            int ID11 = scanner.nextInt();
                            String painter = scanner.next();
                            int size11 = scanner.nextInt();
                            String country11 = scanner.next();
                            String paintingStyle = scanner.next();

                            Painting newPainting = new Painting(name11, price11, quantity11, listOfComments11, ID11, companyName,
                                    painter, size11, country11, paintingStyle);
                            sellerValue.addToListOfAvailableProducts(newPainting);
                            shop1.addToListOfAllProducts(newPainting);
                            shop1.addToListOfAllPaintings(newPainting);

                            break;

                        default:
                            System.out.println("choose from 1 to 11");
                            sellerMenu();


                    }

                    break;

                case 2 :
                    System.out.println("Here are your available products ↷ ");
                    sellerValue.viewListOfAvailableProducts();
                    sellerMenu();
                    break;

                case 3 :
                    System.out.println("There is " + sellerValue.getWallet() + "$ in your wallet");
                    sellerMenu();
                    break;

                case 4 :
                    mainMenu();
                    break;

                default:
                    System.out.println("Enter a number from 1 to 3");
                    sellerMenu();
            }

        }
        else {

            System.out.println("It seems you haven't get your authorization yet");
            System.out.println("Unfortunately you can't go any further.");
            mainMenu();
        }
    }

    public static void adminMenu() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your username again to continue");
        String username = scanner.next();
        Admin adminValue = mapperAdmin.get(username);

        System.out.println("What do you want to do?\n1.add new admins\t2.view users' information\t3.see requests and confirm them\t4.back to the main menu");
        int adminCommand = scanner.nextInt();
        switch (adminCommand) {
            case 1 :

                System.out.println("Enter username");
                String newUsername = scanner.next();
                System.out.println("Choose a password");
                String passwordNew = scanner.next();
                Pattern patternPassword = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
                Matcher matcherPassword = patternPassword.matcher(passwordNew);
                if (matcherPassword.find()) {
                    System.out.println("Enter your email address");
                    String emailAddressNew = scanner.next();
                    Pattern patternEmailAddress = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
                    Matcher matcherEmailAddress = patternEmailAddress.matcher(emailAddressNew);
                    if (matcherEmailAddress.find()) {

                        Admin newAdmin = new Admin(newUsername, passwordNew, emailAddressNew);
                        shop1.addToListOfAllAdmins(newAdmin);
                        shop1.addToListOfAllAccounts(newAdmin);
                        System.out.println("New admin(" + newUsername + ") was made successfully");
                        adminMenu();
                    }
                    else {
                        System.out.println("Please write a valid email address");
                        adminMenu();
                    }
                }
                else {
                    System.out.println("Your password should be at least 8 character and contains both letters and numbers\nThat's just for a safe account");
                    adminMenu();
                }
                break;

            case 2 :
                System.out.println("Here are the users' account ↷");
                shop1.showUserAccount();
                adminMenu();
                break;

            case 3 :
                File newFile = new File(REQUEST_FILE);
                if (newFile.length() == 0) {
                    System.out.println("There isn't any requests right now");
                    adminMenu();
                }
                else {
                    try {
                        File myObj = new File(REQUEST_FILE);
                        Scanner myReader = new Scanner(myObj);
                        System.out.println("Here are the request ↷");
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            System.out.println(data);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    System.out.println("Do you want to confirm them?\n1.Yes\t2.Not now");
                    int confirmCommand = scanner.nextInt();
                    switch (confirmCommand) {
                        case 1:
                            PrintWriter writer = new PrintWriter(REQUEST_FILE);
                            writer.print("");
                            writer.close();
                            System.out.println("Requests was confirmed successfully.\nWe are going to th main menu");
                            mainMenu();
                            break;

                        case 2:
                            System.out.println("We are going back to the admin menu");
                            adminMenu();
                            break;

                        default:
                            System.out.println("choose 1 or 2");
                            adminMenu();
                    }

                }

                break;

            case 4 :
                System.out.println("You are going back to the main menu");
                mainMenu();

            default:
                System.out.println("Enter a number from 1 to 3");
                adminMenu();
        }

    }

}
