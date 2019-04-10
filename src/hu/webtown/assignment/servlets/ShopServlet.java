package hu.webtown.assignment.servlets;

import hu.webtown.assignment.model.Cart;
import hu.webtown.assignment.model.products.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/shop")
public class ShopServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public ShopServlet() {
        super();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String toothpasteAmount = request.getParameter("toothpaste");
        String pomeloAmount = request.getParameter("pomelo");
        String salmonAmount = request.getParameter("salmon");
        String cheeseAmount = request.getParameter("cheese");
        String napkinAmount = request.getParameter("napkin");
        String giftpackAmount = request.getParameter("giftpack");
        String milkAmount = request.getParameter("milk");
        String joghurtAmount = request.getParameter("joghurt");
        String pastaAmount = request.getParameter("pasta");

        Cart cart = new Cart();

        cart.fillUpCart(toothpasteAmount, pomeloAmount, salmonAmount, cheeseAmount, napkinAmount, giftpackAmount,
                        milkAmount, joghurtAmount, pastaAmount);

        cart.addToThreeForTwos(new Toothpaste());
        cart.addToThreeForTwos(new Pomelo());
        cart.addToThreeForTwos(new Salmon());

        cart.addToMegapacks(new Cheese());
        cart.addToMegapacks(new Napkin());
        cart.addToMegapacks(new Giftpack());


        cart.calculateFullPrice();
        cart.calculateDiscounts();
        cart.updateDiscountedPrice();


        Integer fullPrice = cart.getFullPrice();
        Integer discountedPrice = cart.getDiscountedPrice();
        String discountType = cart.getDiscountType();


        request.setAttribute("toothpaste", toothpasteAmount);
        request.setAttribute("pomelo", pomeloAmount);
        request.setAttribute("salmon", salmonAmount);
        request.setAttribute("cheese", cheeseAmount);
        request.setAttribute("napkin", napkinAmount);
        request.setAttribute("giftpack", giftpackAmount);
        request.setAttribute("milk", milkAmount);
        request.setAttribute("joghurt", joghurtAmount);
        request.setAttribute("pasta", pastaAmount);
        request.setAttribute("fullPrice", fullPrice);
        request.setAttribute("discountedPrice", discountedPrice);
        request.setAttribute("discountType", discountType);

        RequestDispatcher dispatcher = request.getRequestDispatcher("shop.jsp");
        dispatcher.forward(request, response);

    }

}