# ESPARTA
 #### Android application for ESPARTA
 
The **ESPARTA** Android application stands as a culmination of collaborative efforts from our team of four creators. This innovative app aims to provide an engaging platform where customers can browse, appreciate, and purchase various artworks. Rooted in the recognition of the persistent challenges faced by artists in effectively connecting with their audience, ESPARTA seeks to address these issues comprehensively. It strives to offer a seamless solution that not only facilitates art transactions but also endeavors to bridge the communication gap between artists and their patrons.
The driving force behind ESPARTA is the desire to alleviate the hurdles artists encounter while communicating their arts and establishing trust with their audience. This application embodies a range of functionalities meticulously designed to ensure security and foster a sense of reliability. By enabling artists to showcase their work and facilitating easy purchase options for users, ESPARTA aims to empower artists to unleash their full potential within the art world.


* Within the application's framework, several key activities are overseen by different team members. The RegisterActivity, spearheaded by **Varsha Kalvakuntla** enables users to input their personal information such as name, password, and phone number, which are securely stored in Firebase, a real-time database.
  
* **Ajay Kumar** takes charge of the HomeActivity, where a dynamic RecyclerView showcases various artworks uploaded by artists. Users can explore detailed descriptions and pricing information by clicking on individual artworks, thereby facilitating an engaging browsing experience. In Addition it gives a image of the artwork which is the main attraction.

* The LoginActivity, managed by **Sailaja Lakkakula** enables registered users to access the application by providing their username and password.
  
* Furthermore, the ConfirmationActivity, overseen by **Raja Manda** ensures a smooth confirmation process for orders placed within the app. The Buy Now button triggers an OnClick Listener Functionality, redirecting users to a page displaying the order confirmation alongside a unique ID number for reference.

**Test credentials:**
  * Phone: 6605285184
  * Password: esparta

**APK:**
  * The suppported versions for our Project ESPARTA are API-level 24 and above. (Android 7.0)
  
**Supported devices:**
  * All the devices which supports Android 7.0 and above.

**Sequence information:** (ESPARTA Flow)
 
The ESPARTA Flow delineates the user journey within the application. Initially, users encounter options to either log in or join the platform. Registering involves providing essential details like username, password, and phone number, followed by subsequent logins using the same credentials. Upon successful login, users are greeted with a toast message confirming their authorized access. They are then directed to the HomeActivity, where an array of artworks awaits their exploration. Clicking on specific pieces leads users to the ViewActivity, presenting comprehensive details including artwork descriptions, titles, prices, and visual representations. The Buy Now feature within this activity streamlines the purchasing process, culminating in an order confirmation display featuring a unique identification number.
 
In conceptualizing an ideal user experience, considerations were made for additional functionalities like CartActivity and ArtistUploadActivity. The former aimed to manage users' shopping carts, while the latter intended to facilitate artists in uploading their creations. Regrettably, owing to time constraints and the project's focused scope, these functionalities were not implemented after thorough discussions and considerations. Overall, ESPARTA embodies a concerted effort to provide a user-friendly interface for art enthusiasts while empowering artists to showcase their talent in an increasingly interconnected world.

