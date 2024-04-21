# Royal Commission for Jubail and Yanbu Project

## Overview

This project is a web application developed using Spring MVC for the Royal Commission for Jubail and Yanbu Project. It provides functionalities for managing offices, handling visitor counts, and supporting multiple languages (Arabic and English).

## Features

- **Office Management**: Admins can perform CRUD operations on offices, including adding, editing, and deleting offices. Offices can be managed separately for Arabic and English languages.
- **Language Support**: The application supports both Arabic and English languages for office information and user interface.
- **Visitor Count**: A visitor count feature is implemented to track the number of visitors to the application.

## Components

The project consists of the following main components:

- **Controllers**: Handle incoming HTTP requests and define the application's request-handling methods.
- **Entities**: Represent data models used in the application, such as OfficeArabic and OfficeEnglish.
- **Services**: Implement business logic and interact with repositories or other services.
- **Views**: Contain HTML templates for rendering user interfaces, including office lists, details, and forms.

## Installation and Setup

1. **Clone the Repository**: 
   ```bash
   git clone https://github.com/bllraslen/royal-commission-project.git
2. **Build the Project**:

cd royal-commission-project
mvn clean install
3. **Run the Application:**
mvn spring-boot:run
4. **Access the Application**:
Open a web browser and go to http://localhost:8080 to view the application.
## Usage
As an admin, navigate to /admin to manage offices in both Arabic and English languages.
Visitors can view office details and navigate the application in their preferred language.
## Contributing
Contributions are welcome! Feel free to fork the repository, make changes, and submit pull requests.

## License
This project is licensed under the MIT License.

## Contact
For any inquiries or issues, please contact Your Name.
