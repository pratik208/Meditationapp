package com.codecrafters.meditationapp.ui.main

import androidx.lifecycle.ViewModel
import com.codecrafters.meditationapp.R

// ViewModel class responsible for managing data related to learning resources
class LearnViewModel : ViewModel() {
    // ArrayList to hold video data
    var videos = ArrayList<Videos>()

    // Method to populate the ArrayList with sample video data
    fun fillData() {
        // Create instances of Videos and add them to the ArrayList
        val video1: Videos = Videos("https://firebasestorage.googleapis.com/v0/b/meditationapp-5c76d.appspot.com/o/videoes%2Fabcd.mp4?alt=media&token=7b726d25-f7bf-47ca-845e-65b586063e47", "How To Meditate For Beginners (Animated)", "Learn meditation basics and techniques for beginners. Discover where to meditate, how to stop thinking, and when you'll start seeing benefits.", "05:36", R.drawable.meditation3)
        val video2: Videos = Videos("https://firebasestorage.googleapis.com/v0/b/meditationapp-5c76d.appspot.com/o/videoes%2FA%20Renewed%20Sense%20of%20Mind_%20Body_%20and%20Spirit%20(Guided%20Meditation)(360P).mp4?alt=media&token=0db20aa8-78a7-4e9e-ba9b-3e695fd45726", "How To Meditate For Older Adults (Animated)", "Explore meditation techniques suitable for older adults. Learn where to meditate, how to relax, and the benefits of meditation for seniors.", "07:12", R.drawable.meditation3)
        val video3: Videos = Videos("https://firebasestorage.googleapis.com/v0/b/meditationapp-5c76d.appspot.com/o/videoes%2FAlign%20With%20What%20You%20Desire_%2010%20Minute%20Manifestation%20Meditation(360P).mp4?alt=media&token=3e4f79e2-f3a7-4395-a4d5-eafaf54b8f9d", "Manifestation Meditation: Align With Your Desires", "Practice a 10-minute manifestation meditation to align with your desires and attract positivity into your life.", "10:00", R.drawable.meditation3)
        val video4: Videos = Videos("https://firebasestorage.googleapis.com/v0/b/meditationapp-5c76d.appspot.com/o/videoes%2FAttracting%20Positivity%20into%20Your%20Life%20Guided%20Meditation(360P).mp4?alt=media&token=ec91685d-7835-4c86-ae24-d05cb04ea11e", "Guided Meditation: Attracting Positivity", "Experience a guided meditation for attracting positivity and abundance into your life.", "08:45", R.drawable.meditation3)
        val video5: Videos = Videos("https://firebasestorage.googleapis.com/v0/b/meditationapp-5c76d.appspot.com/o/videoes%2FBoost%20Creativity_%20Desire%20_%20Confidence%20_%20Sacral%20Chakra%20Guided%20meditation(360P).mp4?alt=media&token=76e687da-e63d-44cc-b0fe-08765344948c", "Boost Creativity: Sacral Chakra Guided Meditation", "Enhance your creativity, desire, and confidence with a guided meditation focusing on the sacral chakra.", "09:30", R.drawable.meditation3)
        val video6: Videos = Videos("https://firebasestorage.googleapis.com/v0/b/meditationapp-5c76d.appspot.com/o/videoes%2FBoost%20Your%20Energy%2010%20Minute%20Guided%20Meditation(360P).mp4?alt=media&token=8fecfe66-1bd2-4606-9efd-a16dbdeb5061", "Boost Your Energy: 10-Minute Guided Meditation", "Recharge and boost your energy levels with a quick 10-minute guided meditation.", "10:23", R.drawable.meditation3)
        val video7: Videos = Videos("https://firebasestorage.googleapis.com/v0/b/meditationapp-5c76d.appspot.com/o/videoes%2FCan%20you%20feel%20the%20powerful%20Self%20Healing%20Energy%20Within_%20%20Try%20this%2010%20minute%20Guided%20Meditation(360P).mp4?alt=media&token=2ca35dd0-bde8-44f2-9915-e667aa3fbc0d", "Self-Healing Energy Within: 10-Minute Guided Meditation", "Tap into your powerful self-healing energy with a short 10-minute guided meditation.", "10:45", R.drawable.meditation3)
        val video8: Videos = Videos("https://firebasestorage.googleapis.com/v0/b/meditationapp-5c76d.appspot.com/o/videoes%2FConnecting%20to%20Source%20Energy%20Guided%20Meditation(360P).mp4?alt=media&token=5b45b81a-6fb6-4da5-9a58-42fdb19a0fe9", "Connecting to Source Energy: Guided Meditation", "Connect and align with source energy through a calming guided meditation.", "06:58", R.drawable.meditation3)
        val video9: Videos = Videos("https://firebasestorage.googleapis.com/v0/b/meditationapp-5c76d.appspot.com/o/videoes%2FEnergy%20Healing%20_%20Guided%20Meditation(360P).mp4?alt=media&token=3da6cf9d-d245-41e2-81ce-28aec2f38a32", "Energy Healing: Guided Meditation", "Experience healing and rejuvenation with an energy-focused guided meditation.", "08:15", R.drawable.meditation3)
        val video10: Videos = Videos("https://firebasestorage.googleapis.com/v0/b/meditationapp-5c76d.appspot.com/o/videoes%2FCan%20you%20feel%20the%20powerful%20Self%20Healing%20Energy%20Within_%20%20Try%20this%2010%20minute%20Guided%20Meditation(360P).mp4?alt=media&token=2ca35dd0-bde8-44f2-9915-e667aa3fbc0d", "Self-Healing Energy Within: 10-Minute Guided Meditation", "Connect with your inner self and experience powerful self-healing energy in this guided meditation.", "09:10", R.drawable.meditation3)

        // Add more video instances as needed

        // Add the videos to the ArrayList
        videos.add(video1)
        videos.add(video2)
        videos.add(video3)
        videos.add(video4)
        videos.add(video5)
        videos.add(video6)
        videos.add(video7)
        videos.add(video8)
        videos.add(video9)
        videos.add(video10)
        // Add more videos as needed
    }

    // Method to get the list of videos
    fun getData(): ArrayList<Videos> {
        // Call fillData() to populate the ArrayList if not already populated
        fillData()
        // Return the ArrayList of videos
        return videos
    }
}
