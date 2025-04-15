package app.christopher.jettrivia.util

import app.christopher.jettrivia.domain.Question

object QuestionSeeder {

    fun getSeedQuestions(): List<Question> {
        val science = listOf(
            Question(category = "Science", questionText = "What planet is known as the Red Planet?", optionA = "Mars", optionB = "Venus", optionC = "Jupiter", optionD = "Saturn", correctAnswer = "Mars"),
            Question(category = "Science", questionText = "What gas do plants absorb from the atmosphere?", optionA = "Carbon Dioxide", optionB = "Oxygen", optionC = "Nitrogen", optionD = "Hydrogen", correctAnswer = "Carbon Dioxide"),
            Question(category = "Science", questionText = "What is the center of an atom called?", optionA = "Nucleus", optionB = "Electron", optionC = "Proton", optionD = "Neutron", correctAnswer = "Nucleus"),
            Question(category = "Science", questionText = "Which organ pumps blood through the body?", optionA = "Heart", optionB = "Lungs", optionC = "Brain", optionD = "Liver", correctAnswer = "Heart"),
            Question(category = "Science", questionText = "What force keeps us grounded?", optionA = "Gravity", optionB = "Magnetism", optionC = "Inertia", optionD = "Friction", correctAnswer = "Gravity"),
            Question(category = "Science", questionText = "What is H2O commonly known as?", optionA = "Water", optionB = "Hydrogen Peroxide", optionC = "Salt", optionD = "Oxygen", correctAnswer = "Water"),
            Question(category = "Science", questionText = "Which planet has rings?", optionA = "Saturn", optionB = "Earth", optionC = "Mars", optionD = "Venus", correctAnswer = "Saturn"),
            Question(category = "Science", questionText = "What is the hardest substance in the human body?", optionA = "Tooth Enamel", optionB = "Bone", optionC = "Nails", optionD = "Hair", correctAnswer = "Tooth Enamel"),
            Question(category = "Science", questionText = "What part of the cell holds DNA?", optionA = "Nucleus", optionB = "Cytoplasm", optionC = "Membrane", optionD = "Ribosome", correctAnswer = "Nucleus"),
            Question(category = "Science", questionText = "What gas do humans exhale?", optionA = "Carbon Dioxide", optionB = "Oxygen", optionC = "Hydrogen", optionD = "Nitrogen", correctAnswer = "Carbon Dioxide")
        )

        val history = listOf(
            Question(category = "History", questionText = "Who was the first President of the USA?", optionA = "George Washington", optionB = "Abraham Lincoln", optionC = "John Adams", optionD = "Thomas Jefferson", correctAnswer = "George Washington"),
            Question(category = "History", questionText = "When did World War II end?", optionA = "1945", optionB = "1942", optionC = "1939", optionD = "1950", correctAnswer = "1945"),
            Question(category = "History", questionText = "Who discovered America?", optionA = "Christopher Columbus", optionB = "Leif Erikson", optionC = "Marco Polo", optionD = "Amerigo Vespucci", correctAnswer = "Christopher Columbus"),
            Question(category = "History", questionText = "The Great Wall is in which country?", optionA = "China", optionB = "Japan", optionC = "India", optionD = "Mongolia", correctAnswer = "China"),
            Question(category = "History", questionText = "What year did the Berlin Wall fall?", optionA = "1989", optionB = "1991", optionC = "1980", optionD = "1995", correctAnswer = "1989"),
            Question(category = "History", questionText = "Who was known as the Iron Lady?", optionA = "Margaret Thatcher", optionB = "Angela Merkel", optionC = "Indira Gandhi", optionD = "Golda Meir", correctAnswer = "Margaret Thatcher"),
            Question(category = "History", questionText = "Which country gifted the Statue of Liberty?", optionA = "France", optionB = "UK", optionC = "Spain", optionD = "Italy", correctAnswer = "France"),
            Question(category = "History", questionText = "Where did the Renaissance begin?", optionA = "Italy", optionB = "France", optionC = "Germany", optionD = "Greece", correctAnswer = "Italy"),
            Question(category = "History", questionText = "Who wrote the Declaration of Independence?", optionA = "Thomas Jefferson", optionB = "Benjamin Franklin", optionC = "James Madison", optionD = "George Washington", correctAnswer = "Thomas Jefferson"),
            Question(category = "History", questionText = "In what year did man first land on the moon?", optionA = "1969", optionB = "1972", optionC = "1965", optionD = "1959", correctAnswer = "1969")
        )

        val movies = listOf(
            Question(category = "Movies", questionText = "Who directed Jurassic Park?", optionA = "Steven Spielberg", optionB = "James Cameron", optionC = "George Lucas", optionD = "Peter Jackson", correctAnswer = "Steven Spielberg"),
            Question(category = "Movies", questionText = "What is the name of the snowman in Frozen?", optionA = "Olaf", optionB = "Sven", optionC = "Kristoff", optionD = "Hans", correctAnswer = "Olaf"),
            Question(category = "Movies", questionText = "Who played Iron Man?", optionA = "Robert Downey Jr.", optionB = "Chris Evans", optionC = "Mark Ruffalo", optionD = "Tom Holland", correctAnswer = "Robert Downey Jr."),
            Question(category = "Movies", questionText = "What movie has the quote 'I'll be back'?", optionA = "The Terminator", optionB = "Predator", optionC = "Commando", optionD = "RoboCop", correctAnswer = "The Terminator"),
            Question(category = "Movies", questionText = "Who played the Joker in The Dark Knight?", optionA = "Heath Ledger", optionB = "Joaquin Phoenix", optionC = "Jack Nicholson", optionD = "Jared Leto", correctAnswer = "Heath Ledger"),
            Question(category = "Movies", questionText = "What movie features Hogwarts?", optionA = "Harry Potter", optionB = "Fantastic Beasts", optionC = "Narnia", optionD = "Twilight", correctAnswer = "Harry Potter"),
            Question(category = "Movies", questionText = "Who directed Inception?", optionA = "Christopher Nolan", optionB = "Quentin Tarantino", optionC = "David Fincher", optionD = "James Cameron", correctAnswer = "Christopher Nolan"),
            Question(category = "Movies", questionText = "Who voiced Woody in Toy Story?", optionA = "Tom Hanks", optionB = "Tim Allen", optionC = "Robin Williams", optionD = "Billy Crystal", correctAnswer = "Tom Hanks"),
            Question(category = "Movies", questionText = "Which movie won Best Picture in 1994?", optionA = "Forrest Gump", optionB = "Pulp Fiction", optionC = "Shawshank Redemption", optionD = "Four Weddings", correctAnswer = "Forrest Gump"),
            Question(category = "Movies", questionText = "Which film is about dreams within dreams?", optionA = "Inception", optionB = "Matrix", optionC = "Interstellar", optionD = "Shutter Island", correctAnswer = "Inception")
        )

        val sports = listOf(
            Question(category = "Sports", questionText = "How many players are on a soccer team?", optionA = "11", optionB = "10", optionC = "9", optionD = "12", correctAnswer = "11"),
            Question(category = "Sports", questionText = "Which sport uses a puck?", optionA = "Ice Hockey", optionB = "Field Hockey", optionC = "Lacrosse", optionD = "Cricket", correctAnswer = "Ice Hockey"),
            Question(category = "Sports", questionText = "Who holds the most Olympic golds?", optionA = "Michael Phelps", optionB = "Usain Bolt", optionC = "Carl Lewis", optionD = "Mark Spitz", correctAnswer = "Michael Phelps"),
            Question(category = "Sports", questionText = "What is Serena Williams known for?", optionA = "Tennis", optionB = "Golf", optionC = "Track", optionD = "Swimming", correctAnswer = "Tennis"),
            Question(category = "Sports", questionText = "In which sport do you perform a slam dunk?", optionA = "Basketball", optionB = "Volleyball", optionC = "Rugby", optionD = "Football", correctAnswer = "Basketball"),
            Question(category = "Sports", questionText = "What’s the length of a marathon?", optionA = "26.2 miles", optionB = "20 miles", optionC = "30 miles", optionD = "24 miles", correctAnswer = "26.2 miles"),
            Question(category = "Sports", questionText = "Which country won the 2018 FIFA World Cup?", optionA = "France", optionB = "Germany", optionC = "Brazil", optionD = "Croatia", correctAnswer = "France"),
            Question(category = "Sports", questionText = "What sport is known as America’s pastime?", optionA = "Baseball", optionB = "Football", optionC = "Basketball", optionD = "Hockey", correctAnswer = "Baseball"),
            Question(category = "Sports", questionText = "Who is the fastest man alive?", optionA = "Usain Bolt", optionB = "Tyson Gay", optionC = "Justin Gatlin", optionD = "Yohan Blake", correctAnswer = "Usain Bolt"),
            Question(category = "Sports", questionText = "What color jersey does the Tour de France leader wear?", optionA = "Yellow", optionB = "Green", optionC = "Red", optionD = "Blue", correctAnswer = "Yellow")
        )

        return science + history + movies + sports
    }
}