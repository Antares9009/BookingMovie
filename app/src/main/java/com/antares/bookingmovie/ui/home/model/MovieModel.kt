package com.antares.bookingmovie.ui.home.model

import com.antares.bookingmovie.R

data class MovieModel(
    val id: String,
    val title: String,
    val assetImage: Int,
    val type: String,
    val duration: String,
    val rating: String,
    val synopsis: String,
    val isPlaying: Boolean
)

val nowPlayingMovie = listOf(
    MovieModel(
        id = "1",
        title = "Minions: The Rise Of Gru",
        assetImage = R.drawable.minion,
        type = "Action",
        duration = "1h 27m",
        rating = "7.7/10",
        synopsis = "A fanboy of a supervillain supergroup known as the Vicious 6, Gru hatches a plan to become evil enough to join them. When the Vicious 6 fire their leader, legendary fighter Wild Knuckles, Gru interviews to become their newest member. It does not go well, and things only get worse after Gru steals a precious stone from them with the help of some Minions. A sudden turn of events overtake Gru, and he finds himself the mortal enemy of the apex of evil.",
        isPlaying = true
    ),
    MovieModel(
        id = "2",
        title = "Thor: Love and Thunder",
        assetImage = R.drawable.thor,
        type = "Action",
        duration = "1h 59m",
        rating = "7.0/10",
        synopsis = "After his retirement from being the God of Thunder, Thor is back in action with all-new powers. But he still has to face the biggest threat of his life. The film is directed by Taika Waititi and is part of the Marvel Cinematic Universe.",
        isPlaying = true
    ),
    MovieModel(
        id = "3",
        title = "Jurassic World Dominion",
        assetImage = R.drawable.jurassic,
        type = "Action",
        duration = "2h 29m",
        rating = "8.0/10",
        synopsis = "Four years after Isla Nublar was distroyed, dinosaurs now live in the wild. A rescue mission to save the dinosaurs from a volcano eruption is launched by former park manager Claire Dearing and Owen Grady, who is a former dinosaur trainer. They soon encounter terrifying new breeds of gigantic dinosaurs while uncovering a conspiracy that threatens the entire planet.",
        isPlaying = true
    )
)

val upcoming = listOf(
    MovieModel(
        id = "4",
        title = "DC League of Super-Pets",
        assetImage = R.drawable.super_pets,
        type = "Animation",
        duration = "1h 46m",
        rating = "N/A",
        synopsis = "When Superman and the other Justice League superheroes are busy saving the world, their pets are left to their own devices at the Hall of Justice. Krypto the Super-Dog, Ace the Bat-Hound, and Streaky the Super-Cat must form the League of Super-Pets to save the day.",
        isPlaying = true
    ),
    MovieModel(
        id = "5",
        title = "Nope",
        assetImage = R.drawable.nope,
        type = "Science Fiction",
        duration = "2h 11m",
        rating = "N/A",
        synopsis = "Residents in a lonely gulch of inland California are terrorized by a mysterious, dark, and massive airborne object that arrives with a sinister purpose.",
        isPlaying = true
    ),
    MovieModel(
        id = "6",
        title = "Thirteen Lives",
        assetImage = R.drawable.lives,
        type = "Drama",
        duration = "1h 46m",
        rating = "N/A",
        synopsis = "A dramatization of the rescue of a boys soccer team trapped in a cave in Thailand.",
        isPlaying = true
    )
)