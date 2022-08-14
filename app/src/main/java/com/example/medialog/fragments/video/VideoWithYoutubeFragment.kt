package com.example.medialog.fragments.video

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.medialog.databinding.VideoWithYoutubeFragmentBinding
import com.example.medialog.fragments.Description
import com.example.medialog.fragments.ToolbarWithMenu
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener

class VideoWithYoutubeFragment : Fragment() {

    private lateinit var binding: VideoWithYoutubeFragmentBinding
    private val args: VideoWithYoutubeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = VideoWithYoutubeFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.setContent {

            ToolbarWithMenu(args.video.title) {
                requireActivity().onBackPressed()
            }
        }

        lifecycle.addObserver(binding.ytPlayer)
        binding.ytPlayer.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.play()
                youTubePlayer.loadVideo(args.video.id, 0f)
            }
        })

        binding.videoText.setContent {
            Description(args.video.description)
        }
    }
}