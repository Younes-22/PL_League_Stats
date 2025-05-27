Premier League Stats API
Project Overview
This project is a Spring Boot application that provides a RESTful API for accessing and managing Premier League player statistics. The data is sourced from a CSV file, imported into a PostgreSQL database, and then exposed through various API endpoints.

The application allows users to retrieve player statistics based on various criteria, add new player records, update existing ones, and delete players. It serves as a practical example of building a REST API with Spring Boot, Spring Data JPA, Hibernate, and PostgreSQL, following a layered architecture (Controller-Service-Repository).

Features
Retrieve All Players: Get a list of all players and their statistics.

Filter Players:

By team name

By player name (partial match)

By position

By nation

By team name and position

Add New Player: Add a new player record to the database.

Update Player: Update an existing player's statistics.

Delete Player: Remove a player record by their name.
