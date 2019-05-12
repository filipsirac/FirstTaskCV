package hr.osc.ada.cvapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.TransformationUtils.circleCrop
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_cv.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cv)
        setUi()
    }

    private fun setUi() {
        //contact me
        Glide.with(this)
            .asBitmap()
            .load(R.drawable.profileimage)
            .apply(RequestOptions.circleCropTransform())
            .into(profileImage)
        mailDescription.text = contactMe.mail
        phoneDescription.text = contactMe.phone
        addressDescription.text = contactMe.address

        //skills
        skillLanguage.text = skills.languages
        platform.text = skills.platform

        //social media
        facebookDescription.text = socialMedia.facebook
        instagramDescription.text = socialMedia.instagram

        //languages
        languageDescriptionNative.text = speakingLanguages.language
        languageDescription.text = speakingLanguages.language1

        //education Faculty
        nameOfFaculty.text = educationFaculty.name
        yearAndPlaceOfFaculty.text = educationFaculty.time
        fullNameOfFaculty.text = educationFaculty.description

        //education School
        nameOfSchool.text = educationSchool.name
        yearAndPlaceOfSchool.text = educationSchool.time
        fullNameOfSchool.text = educationSchool.description

        //experience
        nameOfWorkingPlace.text = workingExperience.name
        dateOfExperience.text = workingExperience.time
        typeOfExperience.text = workingExperience.type
        linkToWorkingPlace.text = workingExperience.link

        //heading info
        name.text = headingInfo.name
        profession.text = headingInfo.profession
    }
}
