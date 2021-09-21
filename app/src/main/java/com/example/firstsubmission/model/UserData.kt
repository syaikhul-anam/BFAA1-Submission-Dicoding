package com.example.firstsubmission.model
import com.example.firstsubmission.R

object UserData {
    fun getUsers():List<User>{
        val user1 = User(
            "JakeWharton",
            "Jake Wharton",
             R.drawable.user1,
            "Google, Inc.",
            "Pittsburgh, PA, USA",
            102,
            56995,
            12)
        val user2 = User(
            "amitshekhariitbhu",
            "AMIT SHEKHAR",
            R.drawable.user2,
            "MindOrksOpenSource",
            "New Delhi, India",
            37,
            5153,
            2)
        val user3 = User(
            "romainguy",
            "Romain Guy",
            R.drawable.user3,
            "Google",
            "California",
            9,
            7972,
            0)
        val user4 = User(
            "chrisbanes",
            "Chris Banes",
            R.drawable.user4,
            "Google working on @android",
            "Sydney, Australia",
            30,
            14725,
            1)
        val user5 = User(
            "tipsy",
            "David",
            R.drawable.user5,
            "Working Group Two",
            "Trondheim, Norway",
            56,
            788,
            0)
        val user6 = User(
            "ravi8x",
            "Ravi Tamada",
            R.drawable.user6,
            "AndroidHive | Droid5",
            "India",
            28,
            18628,
            3)
        val user7 = User(
            "jasoet",
            "Deny Prasetyo",
            R.drawable.user7,
            "gojek-engineering",
            "Kotagede, Yogyakarta, Indonesia",
            44,
            277,
            39)
        val user8 = User(
            "budioktaviyan",
            "Budi Oktaviyan",
            R.drawable.user8,
            "KotlinID",
            "Jakarta, Indonesia",
            110,
            178,
            23)
        val user9 = User(
            "hendisantika",
            "Hendi Santika",
            R.drawable.user9,
            "JVMDeveloperID @KotlinID @IDDevOps",
            "Bojongsoang - Bandung Jawa Barat",
            1064,
            428,
            61)
        val user10 = User(
            "sidiqpermana",
            "Sidiq Permana",
            R.drawable.user10,
            "Nusantara Beta Studio",
            "Jakarta Indonesia",
            65,
            465,
            10)

        return arrayListOf(user1,user2,user3,user4,user5,user6,user7,user8,user9,user10)
    }
}