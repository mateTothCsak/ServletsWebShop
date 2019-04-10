 ### Task
 
 *Build a simplified webshop app.*
 
 The page should consist of a form with the name of products and desired quantity. As we submit our purchase
 the landing page should show us the same form with the filled out data, total price of products, discounted price of
 products and the type of discount.
 
 Discount types:
 
 * For some products every 3rd piece is for free.
 * For some other products if you buy in bulk (at least 12) you get 6000 Forint discount.
 
 These discounts are stackable, but only with the same product type and only the highest discount will be counted upon
 check-out.
 
 /The content of the web pages is in Hungarian/


---

### Technology-stack:

* JavaServer Pages
* Java Servlets
* Tomcat

---

### Configuration:

After cloning the repo you can deploy the app in Tomcat

Step into your project directory in terminal - you should be at the same level with pom.xml

> mvn eclipse:eclipse

> mvn clean package

> We will get WAR file in target directory

> Deploy war in Tomcat (copy war file to the webapp subfolder of Tomcat)

If done right, your landing page should look like this:

![](https://i.ibb.co/CWNqmY8/webtown1.png)

And after submitting the form you get this results:

![](https://i.ibb.co/kK2m77K/webtown2.png)