🌿 Mental Wellness Journal System
Empowering Mental Health through AI-Driven Sentiment Analysis and Personalized Insights.

📌 Project Overview
The Mental Wellness Journal System is an intelligent platform designed to bridge the gap between traditional journaling and mental health awareness. By leveraging Natural Language Processing (NLP), the system analyzes the emotional tone of daily journal entries to provide users with visual mood trends and tailored wellness recommendations.

✨ Key Features
🧠 Intelligent Sentiment Analysis: Automatically detects emotional states (Happy, Sad, Anxious, Neutral) from text inputs using AI.

📊 Mood Analytics Dashboard: Visualizes emotional health trends over time using interactive graphs and charts.

🎵 Personalized Recommendations: Suggests mood-aligned activities, music, or exercises (e.g., calming music for anxiety or upbeat tracks for happiness).

🔒 Secure Journaling: Ensures user privacy with secure authentication and encrypted data storage.

📅 Daily Mood Logging: Tracks consistent emotional data to provide long-term mental wellness insights.

🛠️ Tech StackLayerTechnologyFrontendReact.js, Tailwind CSS, Axios, Chart.jsBackendJava, Spring Boot, Spring Data JPA, Spring SecurityAI MicroservicePython, FastAPI, TextBlob/NLTKDatabaseMySQLDevOpsDocker (Optional), Git/GitHub

📐 Database Design (ER Schema)
The system follows a relational database model to ensure data integrity and efficient retrieval.

🏗️ System Flow
User Input: User writes a journal entry in the React frontend.

Processing: The Spring Boot backend receives the text and calls the Python FastAPI service.

Analysis: The AI service returns a sentiment score and mood category.

Action: Backend saves the results to MySQL and fetches a matching recommendation.

Output: User sees their mood analysis and personalized tips on the dashboard.

⚙️ Installation & Setup
1. Clone the Repository
Bash
git clone https://github.com/your-username/mental-wellness-journal.git
2. Run the AI Service (Python)
Bash
cd ai-service
pip install fastapi uvicorn textblob
uvicorn main:app --port 8000 --reload
3. Run the Backend (Java)
Configure src/main/resources/application.properties with your MySQL credentials.

Run the Spring Boot application using your IDE or:

Bash
./mvnw spring-boot:run
4. Run the Frontend (React)
Bash
cd frontend
npm install
npm start
