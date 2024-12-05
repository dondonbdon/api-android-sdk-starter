API ANDROID SDK STARTER

Use this program for when you want to create a 
seamless and simple sdk for any api that you have.

To get started, you typically want to add a service
interface, this uses retrofit, and you can specify,
the routes you want using the annotations. Next you
can create a helper function which returns a call 
handler with a specific type. In your android app
you can then call the helper function for the 
specific service you need, then you can either, 
register a onSuccessListener or an onFailureListener 
or just call execute, which sends the response to the
server, and to check if it's successful or not, you
can use the aforementioned interfaces.