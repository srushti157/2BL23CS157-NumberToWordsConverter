# 2BL23CS157-NumberToWordsConverter
This project is a Java Servlet-based web application that converts a number between 1 and 20 into English words and Roman numerals.

# Number To Words Converter

## Description
This project is a Java Servlet-based web application that converts a number between 1 and 20 into English words and Roman numerals. The user enters a number in the HTML form, and the servlet processes the input and displays the result.

---

## Technologies Used
- Java
- Servlet
- HTML
- Apache Tomcat v10.1
- Eclipse IDE

---

## Requirements
- JDK 17 or above
- Eclipse Enterprise Edition
- Apache Tomcat v10.1
- Web Browser

---

## Project Folder Structure

NumberToWordsConverter/

├── src/main/java

│ └── com.sound

│ └── NumberWordServlet.java

│

├── src/main/webapp

│ ├── index.html

│ │

│ └── WEB-INF

│ └── web.xml

│

└── README.md

---

## Features
- Accepts numbers from 1 to 20
- Converts number into English words
- Converts number into Roman numerals
- Displays error message for invalid input

---

## How To Run

1. Open Eclipse IDE

2. Create Dynamic Web Project
   - Project Name: NumberToWordsConverter

3. Add Tomcat Server

4. Create package:
   com.sound

5. Add files:
   - NumberWordServlet.java
   - index.html
   - web.xml

6. Right click project

7. Run As → Run on Server

8. Open browser and run:

http://localhost:8081/NumberToWordsConverter/

---

## Sample Input
15

---

## Sample Output
Number : 15

In Words : Fifteen

Roman Number : XV
