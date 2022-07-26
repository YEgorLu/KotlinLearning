package com.example.sportapp

class Sport private constructor(
    val name : String,
    val descriptor :String,
    val imageResourceId :Int
    ) {

    companion object {
        public val sports = arrayOf(
            Sport("Футбол", "Игра где пинают мяч ногой в ворота", R.drawable.football),
            Sport("Бокс", "Игра бьют людей руками", R.drawable.boxing),
            Sport("Танцы", "Игра где двигают телом под музыку", R.drawable.dancing),
            Sport("Хокей", "Игра где пинают циллиндрический обьект удлиненным обьектом", R.drawable.hockey),
            Sport("Карате", "Игра где бьют людей руками и ногами", R.drawable.karate),
            Sport("Рэгби", "Игра где бегут с торпедой в обнимку", R.drawable.rugby),
            Sport("Плавание", "Игра где двигают конечностями в воде", R.drawable.swimming),
            Sport("Теннис", "Игра где пинают мяч сеткой", R.drawable.tennis),
            Sport("Воллейбол", "Игра где бьют мяч руками через сетку", R.drawable.volleyball),
            Sport("Баскетбол", "Игра где бьют мяч руками об пол в кольцо", R.drawable.basketball),
        )
    }

    override fun toString(): String {
        return this.name
    }
}