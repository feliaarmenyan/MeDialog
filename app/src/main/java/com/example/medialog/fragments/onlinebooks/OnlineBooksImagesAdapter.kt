package com.example.medialog.fragments.onlinebooks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.medialog.databinding.ItemBookImageBinding

class OnlineBooksImagesAdapter :
    ListAdapter<Image, OnlineBooksImagesAdapter.BooksImageViewHolder>(COMPARATOR) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksImageViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemBookImageBinding.inflate(layoutInflater, parent, false)
        return BooksImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BooksImageViewHolder, position: Int) {
        holder.bindTo(getItem(position))
    }

    inner class BooksImageViewHolder(var binding: ItemBookImageBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindTo(header: Image) {
            binding.imageView.setBackgroundResource(header.image)
        }
    }

    companion object {
        val COMPARATOR: DiffUtil.ItemCallback<Image> =
            object : DiffUtil.ItemCallback<Image>() {
                override fun areItemsTheSame(oldItem: Image, newItem: Image): Boolean {
                    return oldItem == newItem
                }

                override fun areContentsTheSame(oldItem: Image, newItem: Image): Boolean {
                    return oldItem == newItem;

                }
            }
    }
}