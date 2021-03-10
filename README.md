# hypnos-cardealership-pair1
**Car Dealership:**

To expand the car dealership application, we finally can begin to move it into the online world. Hypnos Motors requires a new RESTful CRUD web API that can do the following:

-   An admin can add a new car to the system
-   An admin can delete a car to the system.
-   A user can view what cars are available on the system.
-   A user can confirm a test drive booking to the system, which results in the specific car becoming unavailable and removed from any further searches.
-   A user can filter the car results returned by;

-   Mileage (lowest to highest)
-   Year (lowest to highest)
-   Brand (alphabetical order)
-   Colour (alphabetical order)
-   Engine Size (lowest to highest)

In regards to databases, we'll use the internal H2 DB that comes out the box with springboot.

Hypnos Motors value quality of service and require a fully tested system to ensure quality meets the expectations of their customers, so TDD is mandatory for this project. Unit / component level testing is required, integration on the other hand, is not. The application will conform to REST and users will not interact with a front end, but at this point of time, via Postman to meet MVP to ensure the web API endpoints work as expected.

Now with MVP in place, Hypnos have desired basic security checks in place. To use the application, the user will require credentials configured in a basic auth header to enable access, which will be validated server-side. If the credentials are incorrect, we supply a 401 error with the message unauthorised back to the client, and if otherwise, a valid response with a status OK.

Now finally, Hypnos would love a front end. It doesn't need to be pretty right now, it just needs to work. There will be two types of accounts, the user and the admin. The user won't have admin access, just the ability to book a test drive with existing functionality remaining the same. The admin will be able to use the system in the same way as a user, if they wanted to book their own car, but also have an additional web page that contains a means to add / delete cars at will.