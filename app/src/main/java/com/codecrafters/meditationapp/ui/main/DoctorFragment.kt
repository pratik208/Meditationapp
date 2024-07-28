package com.codecrafters.meditationapp.ui.main

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codecrafters.meditationapp.R
import com.codecrafters.meditationapp.databinding.FragmentDoctorBinding
import com.codecrafters.meditationapp.databinding.ItemDoctorBinding

class DoctorFragment : Fragment() {

    private var _binding: FragmentDoctorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout using data binding
        _binding = FragmentDoctorBinding.inflate(inflater, container, false)
        val view = binding.root

        // Sample doctor data (replace with your actual data source)
        val doctors = listOf(
            Doctor("Dr. John Doe", "Cardiologist", "15 years", "Heart Specialist", "123-456-7890"),
            Doctor("Dr. Jane Smith", "Pediatrician", "10 years", "Child Health", "987-654-3210"),
            Doctor("Dr. Sarah Johnson", "Dermatologist", "12 years", "Skin Care Specialist", "555-123-4567"),
            Doctor("Dr. Michael Brown", "Orthopedic Surgeon", "20 years", "Bone and Joint Specialist", "333-999-8888"),
            Doctor("Dr. Emily Williams", "Ophthalmologist", "8 years", "Eye Care Specialist", "777-444-2222"),
            Doctor("Dr. David Lee", "Neurologist", "18 years", "Brain Specialist", "888-777-5555"),
            Doctor("Dr. Susan Chang", "Endocrinologist", "14 years", "Hormone Specialist", "222-555-9999"),
            Doctor("Dr. Robert Taylor", "Gastroenterologist", "16 years", "Digestive System Specialist", "111-222-3333"),
            Doctor("Dr. Lisa Anderson", "Psychiatrist", "10 years", "Mental Health Specialist", "999-111-7777"),
            Doctor("Dr. Christopher Clark", "Pulmonologist", "13 years", "Lung Specialist", "666-333-1111"),
            Doctor("Dr. Jennifer White", "Obstetrician/Gynecologist", "17 years", "Women's Health Specialist", "444-888-6666"),
            Doctor("Dr. William Green", "Urologist", "11 years", "Urinary System Specialist", "777-222-5555"),
            Doctor("Dr. Laura Martinez", "Rheumatologist", "9 years", "Joint and Arthritis Specialist", "555-999-4444"),
            Doctor("Dr. Daniel Adams", "Allergist/Immunologist", "14 years", "Allergy and Immune System Specialist", "333-666-9999"),
            Doctor("Dr. Olivia Taylor", "Dentist", "15 years", "Dental Care Specialist", "222-444-8888")
        )


        // Inflate and bind each doctor item using item_doctor.xml
        for (doctor in doctors) {
            val itemBinding = ItemDoctorBinding.inflate(layoutInflater, container, false)
            populateDoctorItem(itemBinding, doctor)
            binding.layoutDoctors.addView(itemBinding.root)
        }

        return view
    }

    private fun populateDoctorItem(itemBinding: ItemDoctorBinding, doctor: Doctor) {
        itemBinding.apply {
            textViewDoctorName.text = doctor.name
            textViewDesignation.text = doctor.designation
            textViewExperience.text = doctor.experience
            textViewSpecialist.text = doctor.specialist
            textViewMobile.text = "Mobile: ${doctor.mobileNumber}"

            // Set OnClickListener for mobile number TextView
            textViewMobile.setOnClickListener {
                dialPhoneNumber(doctor.mobileNumber)
            }

            // Load doctor's image (you can use Picasso, Glide, or other libraries here)
            imageViewDoctor.setImageResource(R.drawable.baseline_person_24)
        }
    }

    private fun dialPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
        }
        startActivity(intent)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Clean up binding
    }

    data class Doctor(
        val name: String,
        val designation: String,
        val experience: String,
        val specialist: String,
        val mobileNumber: String
    )
}
