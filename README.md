# Job Post Portal

## Overview
The Job Post Portal is a web application designed to allow users to post and search for job opportunities. The application is built with a modern tech stack using **React** (with Vite) for the frontend, **Spring Boot** for the backend, **MongoDB** as the database, and **Swagger** for API documentation.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Installation](#installation)
- [Backend Setup](#backend-setup)
- [Frontend Setup](#frontend-setup)
- [Running the Application](#running-the-application)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)

## Features
- **User Authentication**: Sign up and log in to create job posts.
- **Job Post Creation**: Authenticated users can create, edit, and delete job postings.
- **Job Search**: Users can search for job postings based on various filters.
- **Responsive Design**: The frontend is designed to work seamlessly on both desktop and mobile devices.
- **API Documentation**: Explore the API endpoints via Swagger UI.

## Tech Stack

### Frontend
- **React**: A JavaScript library for building user interfaces.
- **Vite**: A build tool that provides a faster and leaner development experience for modern web projects.
- **Material-UI**: React components for faster and easier web development with a Material Design theme.

### Backend
- **Spring Boot**: A framework that simplifies the development of Java applications.
- **MongoDB**: A NoSQL database for storing job posts and user data.
- **Swagger**: Used for API documentation and testing.

## Installation

### Prerequisites
- **Node.js** (v14 or higher)
- **npm** or **yarn**
- **Java** (JDK 11 or higher)
- **Maven** (for building the Spring Boot application)
- **MongoDB** (Ensure MongoDB is installed and running)

## Backend Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/job-post-portal.git
   cd job-post-portal/backend
   ```
2. **Configure MongoDB:Ensure MongoDB is running on localhost:27017 or configure your application properties accordingly in 'src/main/resources/application.properties'**
   ```bash
   spring.data.mongodb.uri=mongodb://localhost:27017/jobpostportal
   ```

3. **Build and Run the Backend:**
   ```bash
     mvn clean install
     mvn spring-boot:run
   ```
   
### Frontend Setup
1. **Navigate to the frontend directory:**
   ```bash
   cd ../frontend

   ```
2. **Install dependencies:**
   ```bash
   npm install

   ```

3. **Run the Frontend::**
   ```bash
     npm run dev
   ```

### Running the Application
1. **Start MongoDB:Ensure your MongoDB server is running.**
2. **Start the Backend Server: Follow the instructions in the Backend Setup section.**
3. **Start the Frontend Server: Follow the instructions in the Frontend Setup section.**
   

   


