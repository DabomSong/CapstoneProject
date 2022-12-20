package com.dabom.capstone3.Fragment

import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.dabom.capstone3.databinding.FragmentCCTVBinding

class CCTVFragment : Fragment() {
    private lateinit var binding: FragmentCCTVBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCCTVBinding.inflate(inflater, container, false)

        binding.webView.settings.javaScriptEnabled = true
        binding.webView.webViewClient = WebViewClient()
        binding.webView.loadUrl("http://www.google.com")
        binding.webView.settings.loadWithOverviewMode
        binding.webView.settings.useWideViewPort
        binding.click.setOnClickListener() {
            binding.webView.loadUrl("https://www.webrtc-experiment.com/screen/?s=" + binding.uri.editableText)
        }
        return binding.root
    }
}