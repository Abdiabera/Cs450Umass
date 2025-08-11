# cs450 Compiler

Description:
This course is an introduction to compiler organization and implementation, including formal specifications and algorithms for lexical and syntactic analysis, internal representation of the source program, semantic analysis, run-time environment issues, and code generation. Participants write a compiler for a reasonably large subset of a contemporary language, targeted to a virtual machine.

---

## Table of Contents

1. [About Me](#about-me)
2. [Project 1: MiniLang – High-Level Language Interpreter (CS450)](#project-1-minilang)
3. [Project 2: UMassBot – Campus Assistant Chatbot](#project-2-umassbot)
4. [Project 3: BookShare – Peer-to-Peer Book Exchange Platform](#project-3-bookshare)
5. [Project 4: DataVizGen – Automated Data Visualization Tool](#project-4-datavizgen)
6. [Project 5: SecureVote – Blockchain Voting Prototype](#project-5-securevote)
7. [Reflection & Learning Outcomes](#reflection--learning-outcomes)
8. [Contact](#contact)

---

## About Me

I am currently a senior at UMass Boston, majoring in Computer Science. My academic interests include the theory and implementation of programming languages, distributed systems, and the design of secure, user-friendly web applications.  
Through my coursework and personal projects, I have developed skills in Python, Java, JavaScript, web frameworks, database systems, and cloud technologies. I enjoy tackling challenging problems and turning ideas into working software that can be used and improved by others.

This portfolio highlights five key projects which demonstrate my growth as a developer and my ability to apply academic knowledge to real-world problems.

---

## Project 1: MiniLang – High-Level Language Interpreter (CS450)

### Overview

**MiniLang** is a miniature interpreter for a custom-designed high-level programming language, built as the capstone project for CS450: *The Structure of Higher Level Languages* at UMass Boston. CS450 focuses on the syntax and semantics of high-level languages, giving students hands-on experience with parsing, parameter passing, scoping, dynamic storage allocation, and message passing.

### Objectives

- Design a readable, expressive language grammar.
- Implement a parser using recursive descent methods.
- Model and demonstrate parameter passing (by value and by reference).
- Support both static (lexical) and dynamic variable scoping.
- Simulate dynamic storage allocation with a heap and garbage collection.
- Enable object-oriented message passing.

### Implementation

- **Language Syntax:** MiniLang supports variable declarations, control flow, function definitions, and simple OOP constructs.
- **Parsing:** Built a recursive descent parser in Python that converts source code into an abstract syntax tree (AST).
- **Parameter Passing:** Functions allow both call-by-value (default) and call-by-reference (with `ref` keyword).
- **Scoping:** The interpreter can toggle between static and dynamic scoping to illustrate both methods.
- **Dynamic Storage:** Variables and objects are allocated on a simulated heap. A basic mark-and-sweep garbage collector reclaims unused memory.
- **Message Passing:** Objects can send and receive messages (method calls), demonstrating encapsulation and dynamic dispatch.

#### Example Code

```mini
var x = 10;
function double(ref y) {
    y = y * 2;
}
double(x);
print(x); // Output: 20 (call-by-reference)

object Counter {
    var count = 0;
    function inc() { count = count + 1; }
    function get() { return count; }
}
Counter.inc();
print(Counter.get()); // Output: 1
```

### Testing & Results

- **Unit Tests:** Developed for the lexer, parser, and interpreter modules.
- **Integration Tests:** Ran full programs with mixed features to verify correct behavior.
- **User Testing:** Peers wrote sample programs to test edge cases and provide feedback.
- **Documentation:** Created a user manual and technical guide.

### Learning Outcomes

- Deepened understanding of how high-level languages work “under the hood.”
- Learned to implement parsing algorithms and manage scope and memory.
- Gained experience in interpreter construction and debugging.

---

## Project 2: UMassBot – Campus Assistant Chatbot

### Overview

**UMassBot** is an intelligent chatbot designed to answer common questions for students and visitors at UMass Boston. The bot acts as a virtual campus guide, providing information on locations, schedules, and services.

### Objectives

- Build a conversational agent capable of understanding natural language queries.
- Integrate with campus data sources for real-time information (e.g., class schedules, library hours).
- Provide a user-friendly interface.
- Ensure secure and reliable operation.

### Implementation

- **Language:** Python, using NLTK and spaCy for natural language processing.
- **Backend:** Flask REST API to handle user requests and integrate with data sources.
- **Frontend:** Simple web chat interface using HTML, CSS, and JavaScript.
- **Features:**
  - Answers FAQs about campus facilities, academic calendars, and events.
  - Can recommend courses, direct to departments, and give directions.
  - Integrates with Google Maps API for navigation.
  - Supports both text and voice input.

### Testing & Results

- Tested with 200+ sample queries from students and staff.
- Achieved >90% accuracy in returning relevant answers for covered topics.
- Positive feedback for ease of use and time saved by users.

### Learning Outcomes

- Gained practical skills in NLP, RESTful API design, and frontend-backend integration.
- Learned about data privacy and security for user interactions.

---

## Project 3: BookShare – Peer-to-Peer Book Exchange Platform

### Overview

**BookShare** is a web application that enables students to lend, borrow, or trade textbooks and course materials with fellow students, helping to reduce costs and promote resource sharing.

### Objectives

- Create a secure platform for users to list and search for books.
- Implement user authentication and messaging.
- Design a rating and review system for trust and accountability.

### Implementation

- **Frontend:** React.js for a responsive, single-page application.
- **Backend:** Node.js with Express for API endpoints.
- **Database:** MongoDB for user and book data.
- **Features:**
  - User registration and login.
  - List books for lending, borrowing, or sale.
  - Search and filter by course, author, or book title.
  - Internal messaging system for negotiations.
  - Ratings and reviews for users after transactions.

### Testing & Results

- Beta tested with 30 students over two weeks.
- Processed 50+ book exchanges with high user satisfaction.
- Identified and patched minor security vulnerabilities in messaging.

### Learning Outcomes

- Acquired proficiency in full-stack web development (MERN stack).
- Tackled real-world challenges such as user authentication and secure data storage.

---

## Project 4: DataVizGen – Automated Data Visualization Tool

### Overview

**DataVizGen** is a tool that automatically suggests and generates data visualizations from raw datasets, helping users without programming skills to quickly gain insights from their data.

### Objectives

- Design an intuitive interface for uploading and exploring datasets.
- Automatically detect data types and recommend suitable visualizations.
- Allow users to export or share visualizations.

### Implementation

- **Frontend:** Vue.js for a dynamic dashboard.
- **Backend:** Python (Flask) using pandas for data analysis and matplotlib/seaborn for charting.
- **Features:**
  - Spreadsheet-style data upload (CSV, Excel).
  - Visualization recommendations (bar, line, scatter, heatmap, etc.).
  - Interactive charts with tooltips and filtering.
  - Export to PNG, SVG, or PDF formats.

### Testing & Results

- Tested with real-world datasets (e.g., census, campus survey).
- User studies showed a 60% reduction in time to create visualizations versus manual tools.
- Highly rated for ease of use and quality of recommendations.

### Learning Outcomes

- Improved skills in data wrangling, statistical analysis, and visualization.
- Learned to balance automation with user control in tool design.

---

## Project 5: SecureVote – Blockchain Voting Prototype

### Overview

**SecureVote** is a prototype voting platform leveraging blockchain technology to ensure transparency, immutability, and security in digital elections.

### Objectives

- Demonstrate how blockchain can be applied to secure voting systems.
- Model the process of voter registration, ballot casting, and tallying.
- Ensure anonymized, tamper-proof vote records.

### Implementation

- **Language:** JavaScript (Node.js) with Ethereum smart contracts (Solidity).
- **Blockchain:** Local Ethereum testnet using Ganache.
- **Frontend:** Simple React app for voter interaction.
- **Features:**
  - Voter registration with cryptographic key pairs.
  - Ballot submission as a blockchain transaction.
  - Audit trail: All votes are publicly recorded and verifiable.
  - Admin panel to start/end elections and verify results.

### Testing & Results

- Simulated class election with 20 participants.
- All votes recorded immutably, with real-time tallying.
- Demonstrated resistance to tampering and double-voting.

### Learning Outcomes

- Gained hands-on experience with blockchain development and smart contracts.
- Understood the challenges of scalability and privacy in decentralized applications.

---

## Reflection & Learning Outcomes

Through these projects, I have:

- Developed a strong foundation in programming languages, software architecture, and security.
- Learned to quickly adapt to new frameworks, APIs, and technologies.
- Practiced project management, from requirements gathering to testing and deployment.
- Improved communication and collaboration skills by working with peers and incorporating user feedback.
- Discovered a passion for building tools that make technology accessible and trustworthy.
