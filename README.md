# Meserszmit Chat App

![image alt](https://github.com/WWasilew/Meserszmit-chat-app/blob/c1d5ee84c997064af517e963f1c1a9afe1f1b4eb/meserszmit_chat/chat/chat/Meserszmit_chat_app.png){ width="950" height="150" style="display: block; margin: 0 auto" }


Meserszmit Chat App is a simple and modern real-time chat application that allows users to communicate seamlessly. This project demonstrates core concepts of web development, real-time communication, and user authentication. Inspired be Messenger chat application from meta, developed By WWasilew

## How does it look like?

Very simple to use! Just type your username to join the chat!

![image alt](https://github.com/WWasilew/Meserszmit-chat-app/blob/c1d5ee84c997064af517e963f1c1a9afe1f1b4eb/meserszmit_chat/chat/chat/meserszmit_logging.png) { width="800" height="600" style="display: block; margin: 0 auto" }

## Just chat with others!
![image alt](https://github.com/WWasilew/Meserszmit-chat-app/blob/c1d5ee84c997064af517e963f1c1a9afe1f1b4eb/meserszmit_chat/chat/chat/chat.png) { width="800" height="600" style="display: block; margin: 0 auto" }

# Features

- Real-time Messaging: Send and receive messages instantly.
- User Authentication: Secure login and registration system.
- Responsive Design: Fully functional on both desktop and mobile devices.
- User-Friendly Interface: Intuitive design for easy use.
- Message Persistence: Messages are stored and can be retrieved later.
- Customizable: Easy to extend with additional features.

# Technology Stack

- Frontend: HTML, CSS, JavaScript
- Backend: Node.js, Express.js
- Real-Time Communication: Socket.IO
- Database: MongoDB (or any preferred database for persistence)
- Hosting/Deployment: Instructions included for hosting on services like Heroku or Vercel.

# Getting Started

Follow these steps to get the application running on your local machine!

## Prerequisites

- Node.js and npm installed on your computer.
- MongoDB server running (or cloud MongoDB instance credentials).

## Installation

1. Clone the repository:
````bash
git clone https://github.com/WWasilew/Meserszmit-chat-app.git
````
2. Navigate to the project directory:
````bash
cd Meserszmit-chat-app
````
3. Install dependencies:
````bash
npm install
````
4. Set up environment variables: Create a .env file in the root of your project and add the following:
````bash
PORT=9090
MONGO_URI=your-mongodb-uri
JWT_SECRET=your-secret-key
````
## Running the Application

1. Start the development server:
````bash
npm run dev
````
2. Open your browser and navigate to http://localhost:9090.

## Usage

- Register a new user account.
- Log in with your credentials.
- Start a conversation in the chat room.

# Project Structure
````bash
Meserszmit-chat-app/
├── public/          # Static files (CSS, images, client-side JS)
├── src/
│   ├── controllers/ # Backend controllers
│   ├── models/      # Database schemas
│   ├── routes/      # API routes
│   ├── utils/       # Helper functions
│   └── server.js    # Application entry point
├── .env             # Environment variables
├── package.json     # Project configuration
└── README.md        # Project documentation
````
# Contributing

Contributions are welcome! Feel free to fork the repository and submit a pull request with your improvements.

1. Fork the project.
2. Create your feature branch:
````bash
git checkout -b feature-name
````
3. Commit your changes:
````bash
git commit -m "Add some feature"
````
4. Push to the branch:
````bash
git push origin feature-name
````
5. Open a pull request.

# License

This project is licensed under the MIT License - see the LICENSE file for details.

# Contact

Created by WWasilew. Feel free to contact me for any questions or feedback!
