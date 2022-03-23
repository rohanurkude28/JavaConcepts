package principles;

class HighCohesionDatabase {
    void connectDatabase() {
    }

    void printAllPlayersInfo() {
    }

    void printSinglePlayerInfo() {
    }

    void printRankings() {
    }

    void printEvents() {
    }

    void closeDatabase() {
    }
}

public class Cohesion {
}

class LowCohesionDatabase {
    ConnectDatabase connectD = new ConnectDatabase();
    PrintAllPlayersInfo allPlayer = new PrintAllPlayersInfo();
    PrintRankings rankings = new PrintRankings();
    CloseDatabase closeD = new CloseDatabase();
    PrintSinglePlayerInfo singlePlayer = new PrintSinglePlayerInfo();
}


class ConnectDatabase {
    //connecting to database.
}


class CloseDatabase {
    //closing the database connection.
}


class PrintRankings {
    //printing the players current rankings.
}


class PrintAllPlayersInfo {
    //printing all the players information.
}


class PrintSinglePlayerInfo {
    //printing a single player information.
}