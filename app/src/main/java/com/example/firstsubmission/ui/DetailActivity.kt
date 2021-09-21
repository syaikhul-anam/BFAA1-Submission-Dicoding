package com.example.firstsubmission.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.firstsubmission.R
import com.example.firstsubmission.databinding.ActivityDetailBinding
import com.example.firstsubmission.model.User

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_USER = "extra_user"
    }

    private lateinit var detailBinding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        val user = intent.getParcelableExtra<User>(EXTRA_USER)

        Glide.with(this)
            .load(user?.avatar)
            .apply(RequestOptions.circleCropTransform())
            .into(detailBinding.imgProfilePhoto)

        detailBinding.apply {
            tvRepository.text = user?.repository.toString()
            tvFollowers.text = user?.followers.toString()
            tvFollowing.text = user?.following.toString()
            tvProfileName.text = user?.name
            tvCompany.text = user?.company
            tvLocation.text = user?.location
        }
        supportActionBar?.apply {
            setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)
            setDisplayHomeAsUpEnabled(true)
            title = user?.username
            elevation = 0f
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}