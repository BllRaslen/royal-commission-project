Royal Commission for Jubail and Yanbu Project
Overview
This repository contains the source code for the Royal Commission for Jubail and Yanbu Project, which is a web application designed to manage offices and visitor counts for the Royal Commission. The application is built using Java with Spring Boot framework for the backend, and Thymeleaf for server-side templating. It also utilizes MySQL for data storage.

Features
Office Management: Allows users to view, add, edit, and delete offices in both Arabic and English languages.
Visitor Count Tracking: Tracks and displays the number of visitors to the application over time.
Multi-Language Support: Supports both Arabic and English languages for user interface.
Installation
To run this project locally, follow these steps:

Clone the Repository:
bash
Copy code
git clone https://github.com/bllraslen/royal-commission-project.git
Set Up Database:
Install MySQL and create a database named royal_commission_db.
Update application.properties file with your database configuration.
Build and Run the Project:
bash
Copy code
cd royal-commission-project
./mvnw spring-boot:run
Access the Application:
Open your web browser and navigate to http://localhost:8080.
Usage
Navigate to /admin to access the admin dashboard for managing offices.
Use /admin/en for English language and /admin/ar for Arabic language.
Visit /count to view visitor count statistics for the last 7 days.
Contributing
Contributions are welcome! Please fork the repository, make your changes, and submit a pull request.

License
This project is licensed under the MIT License.
